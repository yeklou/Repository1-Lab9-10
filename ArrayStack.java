/**
 * ArrayCircularQueue which implement QueueADT
 * Use an array as the stack container, and use the
 * variable size to represent the total number of elements in the queue. 
 * In the array, new data element will always be stored in the end of queue, 
 * which is represented in the index of (front + size) % array length.
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

/** An array-based StackADT. */
public class ArrayStack<E> implements StackADT<E> {

  /** Array of items in this StackADT. */
  private E[] data;

  /** Number of items currently in this StackADT. */
  private int top;

  /** The StackADT is initialized to be empty. */
  public ArrayStack() {
    //TODO Instantiate the array-based data collection
    

  }

  @Override
  public boolean isEmpty() {
      //TODO Evaluate whether the stack is empty
       
  }

  /** Return true if data is full. */
  protected boolean isFull() {
      //TODO Evaluate whether the queue is full
    

  }

  @Override
  public E peek() throws EmptyCollectionException{
      //TODO Retrieve element at the end of the stack (index of the data array: top -1) 
      //Do not modify the Stack.
    

  }

  @Override
  public E pop() throws EmptyCollectionException {
      //TODO Remove and return the top item on the stack (data array)
    

  }

  @Override
  public void push(E target) {
    //TODO Add targer to the top of the stack (data array)
    

  }

  /** Double the length of data. */
  protected void expandCapacity() {
    E[] newData = (E[])(new Object[data.length * 2]); // Warning
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

    @Override
    public int size() {
        //TODO return the size of the stack, identified by the variable top
        

    }
}
