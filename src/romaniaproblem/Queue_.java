/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package romaniaproblem;

/**
 *
 * @author DELL
 */
public class Queue_ {


   private int SIZE = 30;
   private int[] queArray;
   private int front;
   private int rear;

   public Queue_()            // constructor
      {
      queArray = new int[SIZE];
      front = 0;
      rear = -1;
      }

   public void insert(int j) // put item at rear of queue
      {
      if(getRear() == getSIZE()-1)
         setRear(-1);
        getQueArray()[++rear] = j;
      }

   public int remove()       // take item from front of queue
      {
      int temp = getQueArray()[front++];
      if(getFront() == getSIZE())
         setFront(0);
      return temp;
      }

   public boolean isEmpty()  // true if queue is empty
      {
      return ( getRear()+1==getFront() || (getFront()+getSIZE()-1==getRear()) );
      }

   public void removeAll() {
      front = 0;
      rear = -1;

   }
    /**
     * @return the SIZE
     */
    public int getSIZE() {
        return SIZE;
    }

    /**
     * @param SIZE the SIZE to set
     */
    public void setSIZE(int SIZE) {
        this.SIZE = SIZE;
    }

    /**
     * @return the queArray
     */
    public int[] getQueArray() {
        return queArray;
    }

    /**
     * @param queArray the queArray to set
     */
    public void setQueArray(int[] queArray) {
        this.queArray = queArray;
    }

    /**
     * @return the front
     */
    public int getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(int front) {
        this.front = front;
    }

    /**
     * @return the rear
     */
    public int getRear() {
        return rear;
    }

    /**
     * @param rear the rear to set
     */
    public void setRear(int rear) {
        this.rear = rear;
    }
}
