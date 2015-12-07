
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package ar.com.javacuriosities.calculator.parser;

import java_cup.runtime.*;
import ar.com.javacuriosities.calculator.model.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ArithmeticParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ArithmeticSymbols.class;
}

  /** Default constructor. */
  @Deprecated
  public ArithmeticParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ArithmeticParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ArithmeticParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\005\004\000\002\005" +
    "\003\000\002\002\004\000\002\003\005\000\002\003\003" +
    "\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\004\004\010\001\002\000\006\002\015\004" +
    "\010\001\002\000\006\002\uffff\004\uffff\001\002\000\006" +
    "\005\012\013\011\001\002\000\006\005\ufffc\013\ufffc\001" +
    "\002\000\006\005\ufffb\013\ufffb\001\002\000\006\002\ufffe" +
    "\004\ufffe\001\002\000\004\004\010\001\002\000\006\005" +
    "\ufffd\013\ufffd\001\002\000\006\002\000\004\000\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\012\002\004\003\005\004\006\005\003\001" +
    "\001\000\010\002\013\003\005\004\006\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ArithmeticParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ArithmeticParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ArithmeticParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	// public static void main(String args[]) throws Exception {
	// new parser(new ArithmeticLexer(System.in)).parse();
	// }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ArithmeticParser$actions {
  private final ArithmeticParser parser;

  /** Constructor */
  CUP$ArithmeticParser$actions(ArithmeticParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ArithmeticParser$do_action_part00000000(
    int                        CUP$ArithmeticParser$act_num,
    java_cup.runtime.lr_parser CUP$ArithmeticParser$parser,
    java.util.Stack            CUP$ArithmeticParser$stack,
    int                        CUP$ArithmeticParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ArithmeticParser$result;

      /* select the action based on the action number */
      switch (CUP$ArithmeticParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Document EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).right;
		Document start_val = (Document)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).value;
		RESULT = start_val;
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ArithmeticParser$parser.done_parsing();
          return CUP$ArithmeticParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Document ::= Document ExpressionLine 
            {
              Document RESULT =null;
		int prevDocumentleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).left;
		int prevDocumentright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).right;
		Document prevDocument = (Document)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).right;
		Expression expr = (Expression)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.peek()).value;
		
			Document document = new Document(prevDocument);
			document.addExpression(expr);
			RESULT = document;
		
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("Document",3, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          return CUP$ArithmeticParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Document ::= ExpressionLine 
            {
              Document RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).right;
		Expression expr = (Expression)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.peek()).value;
		
			Document document = new Document();
			document.addExpression(expr);
			RESULT = document;
		
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("Document",3, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          return CUP$ArithmeticParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ExpressionLine ::= MathExpression SEMICOLON 
            {
              Expression RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).right;
		Expression expr = (Expression)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)).value;
		
			RESULT = expr;
		
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("ExpressionLine",0, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-1)), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          return CUP$ArithmeticParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // MathExpression ::= MathExpression PLUS NumberExpression 
            {
              Expression RESULT =null;
		int lhsleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-2)).left;
		int lhsright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-2)).right;
		Expression lhs = (Expression)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-2)).value;
		int rhsleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).left;
		int rhsright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).right;
		Expression rhs = (Expression)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.peek()).value;
		
  			RESULT = new PlusExpression(lhs, rhs); 
		
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("MathExpression",1, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.elementAt(CUP$ArithmeticParser$top-2)), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          return CUP$ArithmeticParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // MathExpression ::= NumberExpression 
            {
              Expression RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).right;
		Expression value = (Expression)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.peek()).value;
		
			RESULT = value;
		
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("MathExpression",1, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          return CUP$ArithmeticParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NumberExpression ::= NUMBER 
            {
              Expression RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()).right;
		Integer value = (Integer)((java_cup.runtime.Symbol) CUP$ArithmeticParser$stack.peek()).value;
		
		RESULT = new NumberExpression(value); 
	
              CUP$ArithmeticParser$result = parser.getSymbolFactory().newSymbol("NumberExpression",2, ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ArithmeticParser$stack.peek()), RESULT);
            }
          return CUP$ArithmeticParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ArithmeticParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ArithmeticParser$do_action(
    int                        CUP$ArithmeticParser$act_num,
    java_cup.runtime.lr_parser CUP$ArithmeticParser$parser,
    java.util.Stack            CUP$ArithmeticParser$stack,
    int                        CUP$ArithmeticParser$top)
    throws java.lang.Exception
    {
              return CUP$ArithmeticParser$do_action_part00000000(
                               CUP$ArithmeticParser$act_num,
                               CUP$ArithmeticParser$parser,
                               CUP$ArithmeticParser$stack,
                               CUP$ArithmeticParser$top);
    }
}

}
