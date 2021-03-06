package ar.com.javacuriosities.networking.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * El protocolo UDP esta soportado por dos clases principales
 * DatagramSocket --> La cual esta encargada de enviar y recibir datos
 * DatagramPacket --> Contiene la información a enviar junto con los datos del destinarlo, el encabezado posee
 * Source Port|Destination Port|Length|UDP Checksum|Data
 * 
 */
public class Step1ServerSocketUDP {
	public static void main(String[] args) throws InterruptedException {
		// Definimos un socket
		try (DatagramSocket serverSocket = new DatagramSocket(4000, InetAddress.getLocalHost())){
			DatagramPacket inputPacket = new DatagramPacket(new byte[100], 100);

			// Podemos asignar un timeout para el método receive
			// socket.setSoTimeout(1000);

			/*
			 *  Aunque el protocolo UDP no es orientado a la conexión podemos usar
			 *  el método connect() para restringir la llegada de paquetes desde una
			 *  IP + Port.
			 *  Si ejecutamos le método connect() varias veces solo queda restringido
			 *  al ultimo asignado
			 */
			// socket.connect(InetAddress.getLocalHost(), 5000);
			while (true) {
				serverSocket.receive(inputPacket);

				System.out.println("Remote Address:" + inputPacket.getAddress());
				System.out.println("Remote Port:" + inputPacket.getPort());

				System.out.println(new String(inputPacket.getData()));
			}
		} catch (Exception e) {
			// Log and Handle exception
			e.printStackTrace();
		}
	}
}
