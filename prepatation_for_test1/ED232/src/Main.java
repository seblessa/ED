public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list0 = new SinglyLinkedList<>();

        list0.addLast(42);
        list0.addLast(22);
        list0.addLast(42);
        list0.addLast(42);
        list0.addLast(22);
        list0.addLast(42);

        SinglyLinkedList<Integer> toRemove0 = new SinglyLinkedList<>();

        toRemove0.addLast(42);
        toRemove0.addLast(1);


        System.out.println("\nInicio lista0="+list0+"size="+list0.size());
        list0.remove(toRemove0);
        System.out.print("remove{a,c}="+list0+"size="+list0.size());


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