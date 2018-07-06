public class Test {
    public static void main(String[] args) {
        System.out.println("-----* TESTING *----- ");
        MyLinkedList ll = new MyLinkedList(15);
        ll.addFirst(11);
        ll.addFirst(10);

        ll.add(3, 8);
        ll.add(15,20);
        ll.printList();
    }
}
