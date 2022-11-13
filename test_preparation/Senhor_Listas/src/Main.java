public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Character> list0 = new SinglyLinkedList<>();
        list0.addLast('a');
        list0.addLast('b');
        list0.addLast('d');
        list0.addLast('a');
        list0.addLast('c');
        list0.addLast('e');

        SinglyLinkedList<Character> toRemove0 = new SinglyLinkedList<>();
        toRemove0.addLast('a');
        toRemove0.addLast('c');


        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        list1.addLast(81);
        list1.addLast(39);
        list1.addLast(39);
        list1.addLast(81);
        list1.addLast(55);
        list1.addLast(99);

        SinglyLinkedList<Integer> toRemove1 = new SinglyLinkedList<>();
        toRemove1.addLast(39);
        toRemove1.addLast(55);



        System.out.println("\nInicio lista0="+list0+"size="+list0.size());
        list0.remove(toRemove0);
        System.out.print("remove{a,c}="+list0+"size="+list0.size());

        System.out.println("\nInicio lista1="+list1+"size="+list1.size());
        list1.remove(toRemove1);
        System.out.print("remove{39,55}="+list1+"size="+list1.size());



    }



    public static void print_array(int[] arr){
        if (arr!=null){
            System.out.print("[");
            for (int i=0;i< arr.length;i++){
                if (i!=arr.length-1){
                    System.out.print(arr[i]+",");
                }else {
                    System.out.print(arr[i]+"]");
                }
            }
            System.out.println();
        }else{
            System.out.println("null");
        }
    }
}