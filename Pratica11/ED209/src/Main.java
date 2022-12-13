public class Main {
    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree<>();
        Integer[] arr = {6,3,10,1,4,8,42,2,7,23,54};

        for (Integer x:arr){
            tree.insert(x);
        }


        System.out.println(tree.countBetween(5,44));



    }
}