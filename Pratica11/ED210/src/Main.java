public class Main {

    // impossivel

    public static void main(String[] args) {
        Integer[] arr = {7,5,9,6,8,10};


        BSTree<Integer> tree = new BSTree<>();

        for (Integer x : arr){
            tree.insert(x);
        }

        System.out.println(tree.valid());






    }
}