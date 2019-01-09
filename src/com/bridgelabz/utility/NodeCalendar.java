package com.bridgelabz.utility;

class NodeCalendar<T> {
    private T value;
    private NodeCalendar<T> nextRef;
    /**
     * Constructors to initialize the instance variables
     */
    public NodeCalendar(){
        value=null;
        nextRef=null;
    }
    /**
     * Parameterized Constructors to initialize instance and 
     * local variables
     * 
     * @param data the data to store in the node of a linked list
     * @param next the address of the next node
     */
    public NodeCalendar(T data, NodeCalendar<T> next){
        this.value=data;
        this.nextRef=next;
    }
    /**
     * Getter method to get the data
     * 
     * @return
     */
    public T getValue() {

        return value;
    }
    /**
     * Setter method to set the data
     * 
     * @param data the data to be set
     */

    public void setValue(T value) {
        this.value = value;
    }
    /**
     * Getter Method to get the address of the previous node
     * 
     * @return the address of the previous node
     */
    public NodeCalendar<T> getNextRef() {
        return nextRef;
    }
    /**
     * Setter Method to get the address of the previous node
     * 
     * @return the address of the previous node
     */
    public void setNextRef(NodeCalendar<T> ref) {
        this.nextRef = ref;
    }
}

