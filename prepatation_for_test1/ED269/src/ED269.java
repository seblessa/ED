public class ED269 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        for (int i=1;i<=5;i++){
            list.addLast(i);
        }

        System.out.println(list);
        int[] pos = {0,4,5};

        list=list.remove(pos);

        System.out.println(list);




    }
}