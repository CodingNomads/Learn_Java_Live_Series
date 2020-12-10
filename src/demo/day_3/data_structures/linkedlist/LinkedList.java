package demo.day_3.data_structures.linkedlist;

public class LinkedList<T> {

    private LinkedListNode<T> head;

    // ADD DATA
    public void addToFront(T data){
        // create simple node containing data
        LinkedListNode<T> node = new LinkedListNode(data);

        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;

    }

    public void addToBack(T data){
        LinkedListNode<T> node = new LinkedListNode(data);

        if (head == null){
            head = node;
            return;
        }

        LinkedListNode<T> iterator = head;

        while(iterator.next != null){
            iterator = iterator.next;
        }

        iterator.next = node;
    }

    // FIND DATA

    // REMOVE DATA
    public void remove(T data){

        if (head == null){
            return;
        }

        // remove from front of list
        if(head.getData().equals(data)){
            head = head.next;
            return;
        }

        // removing something from the middle of the list
        LinkedListNode<T> iter = head;

        while(!iter.next.getData().equals(data) && iter.next != null){
            iter = iter.next;
        }

        if(iter.next.getData().equals(data) && iter.next.next != null){
            iter.next = iter.next.next;
        }
        // removing something from the very end of the list
        else if (iter.next.getData().equals(data)) {
            iter.next = null;
        }

    }

    public void print(){
        LinkedListNode<T> iter = head;

        if (head == null){
            return;
        }

        do {
            System.out.println(iter.toString());
            iter = iter.next;
        } while(iter != null);
    }

}
