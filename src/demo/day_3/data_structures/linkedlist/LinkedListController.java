package demo.day_3.data_structures.linkedlist;

public class LinkedListController {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();

        list.addToFront("ryan");
        list.addToFront("kim");
        list.addToBack("martin");
        list.addToBack("gilad");
        list.addToFront("brandon");
        list.addToFront("evina");

        list.print();
        System.out.println("-------------------");

        list.remove("evina"); // front
        list.print();
        System.out.println("-------------------");

        list.remove("ryan"); // middle
        list.print();
        System.out.println("-------------------");

        list.remove("gilad"); // end
        list.print();
        System.out.println("-------------------");
    }

}
