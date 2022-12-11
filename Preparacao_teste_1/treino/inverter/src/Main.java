public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i=0;i<10;i++){
            list.addLast(i);
        }

        System.out.println(list);

        list.inverter(2,6);

        System.out.println(list);


    }
}