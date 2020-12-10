package demo.day_3.data_structures.linkedlist;

public class LinkedListNode <T> {
    private T data;
    LinkedListNode next;

    public LinkedListNode(){}

    public LinkedListNode(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                '}';
    }
}
