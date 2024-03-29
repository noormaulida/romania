/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package romaniaproblem;

/**
 *
 * @author DELL
 */
public class Stack_ {


   private final int SIZE = 30;
   private int[] st;
   private int top;


   public Stack_()           // constructor
      {
      st = new int[SIZE];    // make array
      top = -1;
      }

   public void push(int j)   // put item on stack
      { st[++top] = j; }

   public int pop()          // take item off stack
      { return st[top--]; }

   public int peek()         // peek at top of stack
      { return st[top]; }

   public boolean isEmpty()  // true if nothing on stack
      { return (top == -1); }

   public void removeAllStack() {
       top = -1;
   }

}
