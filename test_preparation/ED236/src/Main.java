public class Main {
    public static void main(String[] args) {
            SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
        list.addLast(8);
        list.addLast(10);


        System.out.println(list);
        list.shift(3);
        System.out.println(list);

    }
}