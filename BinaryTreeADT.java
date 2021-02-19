package ADTs;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;


/**
 * An interface for a Binary Tree
 * Specific binary tree implementations will implement this interface
 * This interface leaves out iterators
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 */
public interface BinaryTreeADT<T> extends CollectionADT {
    
    /**
     * Returns the element at the root 
     * @return the element at the root
     * @throws EmptyCollectionException 
     */
    public T getRootElement() throws EmptyCollectionException;
    
    /**
     * checks to see if element is in tree
     * @param targetElement, the element we are looking for
     * @return boolean, true if found, false otherwise
     */
    public boolean contains(T targetElement);
    
    /**
     * Returns a reference to the element, if it is found in this binary tree.
     * Throws an exception if element is not found
     * 
     * @param targetElement the element being sought in the tree
     * @return a reference to the specified element
     */
    public T find(T targetElement) throws ElementNotFoundException;
    
    
}
