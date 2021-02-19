/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author clatulip
 */
public class BTNode<T> {
    
    private T element;
    private BTNode<T> leftChild;
    private BTNode<T> rightChild;


    /** 
     * Creates a node containing element
     * @param elem element to be stored
     */
    public BTNode(T elem) {
        leftChild = null;
        rightChild = null;
        element = elem;
    }
    
    /**
     * Creates a new node, with element and sub-trees
     * @param elem element
     * @param left a LinkedBinaryTree (or null)
     * @param right a LinkedBinaryTree (or null)
     */
    public BTNode(T elem, LinkedBinaryTree<T> left, LinkedBinaryTree<T> right) {
        element = elem;
        if (left == null) {
            leftChild = null;
        } else {
            leftChild = left.root;
        }
        
        if (right == null) {
            rightChild = null;
        } else {
            rightChild = right.root;
        }
    }

    
    /**
     * Gets the left sub-tree
     * @return BTNode<T> left sub-tree (could be null)
     */
    public BTNode<T> getLeftChild() {
        return leftChild;
    }

    /**
     * Sets the leftChild to point at the passed in tree
     * @param leftChild a BTNode (could be null)
     */
    public void setLeftChild(BTNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Gets the right sub-tree
     * @return BTNode<T> right sub-tree (could be null)
     */
    public BTNode<T> getRightChild() {
        return rightChild;
    }

    /**
     * Sets the rightChild to point at the passed in tree
     * @param rightChild a BTNode (could be null)
     */
    public void setRightChild(BTNode<T> rightChild) {
        this.rightChild = rightChild;
    }
    
    /**
     * Returns the element stored in this node
     * @return element stored in the node
     */
    public T getElement() {
        return element;
    }
    
    public void setElement(T elem) {
        element = elem;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "element=" + element + "\n leftChild=" + leftChild + "\n rightChild=" + rightChild + '}';
    }

    

    

    
    
    
}
