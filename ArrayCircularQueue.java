/**
 * ArrayCircularQueue which implement QueueADT
 * Use an array as the Queue container, and use the
 * variable size to represent the total number of elements in the queue. 
 * In the array, new data element will always be stored in the end of queue, 
 * which is represented in the index of (front + size) % array length.
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

/** An array-based QueueADT. */
public class ArrayCircularQueue<E> implements QueueADT<E> {

    /** Array of items in this QueueADT. */
    private E[] data;

    /** Declare a int variable named front, which represents 
 the index of the frontmost element in this QueueADT. */
    private int front;

    /** Declare a int variable named size, which represents 
 the number of items currently in this QueueADT. */
    private int size;

    /** The QueueADT is initialized to be empty. */
    public ArrayCircularQueue() {
        // TODO Instantiate the array-based data collection
        

    }

    @Override
    public void enqueue(E target) {
        /** TODO if queue is full, expand capacity the array-based data collection,
         *  for example, doubling its size and copying the original data items into the new expanded array.
         * Then insert a new data item with reference to the input target into the queue
         * Do not forget to change the size
        **/
        

    }

    @Override
    public boolean isEmpty() {
        //TODO Evaluate whether the queue is empty
        
    }

    /** Return true if data is full. */
    protected boolean isFull() {
        //TODO Evaluate whether the queue is full
        

    }

    @Override
    public E dequeue() throws EmptyCollectionException{
        /** TODO if queue is empty, throw an exception.
        * Then remove the data item from the queue, which 
        * corresponds to save element at the front index to a variable, named result,
        * and move the front to its next index in circular array.
        * 
        * Do not forget to change the size
        * Return the variable result.
        **/
        

    }

    /** Double the length of data. */
    protected void expandCapacity() {
        E[] newData = (E[])(new Object[data.length * 2]); // Warning
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
    }

    @Override
    public E first() {
        /**TODO return element in the frontmost position of the array **/
        

    }

    @Override
    public int size() {
        //TODO return the size of the Queue
        

    }

}
