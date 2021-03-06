package ar.com.javacuriosities.threads;


public class Lesson11WaitAndNotify {

	public static void main(String[] args) {
		try {
			/*
			 * Creamos el objeto meeting que se usar como shared lock y usar los métodos wait() y notifyAll()
			 */
			Meeting meeting = new Meeting();

			/*
			 * Creamos los objetos que comparten la reunion
			 */
			Employee worker01 = new Employee("Homero Simpson", meeting);
			Employee worker02 = new Employee("Pablo Marmol", meeting);
			Employee worker03 = new Employee("Don Quijote", meeting);
			Boss boss = new Boss("Cosme Fulanito", meeting);

			// Start employees
			worker01.start();
			worker02.start();
			worker03.start();

			/*
			 * Esperamos para evitar deadlocks, si descomentamos esta línea en
			 * algunos casos se podría generar un deadlock porque el jefe llega
			 * antes y notifica a todos pero no todos están esperando.
			 * 
			 * Para resolver esto podríamos usar un wait con tiempo dentro de un ciclo que verifique si ya llego el jefe o no
			 * Homework :)
			 */
			Thread.sleep(2000);

			// Start boss
			boss.start();
		} catch (InterruptedException e) {
			// Log and Handle exception
			e.printStackTrace();
		}
	}

	/*
	 * Esta clase representa la encargada de avisar si debe saludar o esperar
	 */
	private static final class Meeting {

		public Meeting() {
		}

		/*
		 * Los empleados van a quedar esperando a que llegue el jefe
		 * Se hace wait del thread que esta corriendo y se bloquea, es importante marcar que el thread
		 * suelta el lock que obtuvo al entrar al método, siempre que usamos wait() debemos estar en un contexto
		 * sincronizado
		 */
		public synchronized void waitBoss(String name) {
			try {
				System.out.println(name + " is waiting");
				wait();
				System.out.println(name + ": Good Morning boss");
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		/*
		 * Cuando el jefe llega saluda a todos y les informa que llego por medio del notifyAll(), 
		 * esto despierta a todos los thread que hicieron wait() antes que el llegue
		 */
		public synchronized void startMeeting(String name) {
			System.out.println(name + " -: Good Morning slaves :)");
			// Si cambiamos el notifyAll() por notify() se genera un deadlock, por el notify solo informa a un thread
			notifyAll();
		}
	}

	private static final class Employee extends Thread {

		private Meeting meeting;

		public Employee(String name, Meeting meeting) {
			super(name);
			this.meeting = meeting;
		}

		@Override
		public void run() {
			System.out.println(getName() + " arrives at the office.");
			meeting.waitBoss(getName());
		}
	}

	private static final class Boss extends Thread {

		private Meeting meeting;

		public Boss(String name, Meeting meeting) {
			super(name);
			this.meeting = meeting;
		}

		@Override
		public void run() {
			System.out.println(getName() + " arrives at the office.");
			meeting.startMeeting(getName());
		}
	}
}