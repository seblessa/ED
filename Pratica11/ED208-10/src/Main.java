public class Main {
    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree<>();

        Integer[] arr ={5,3,10,1,4,7,42};

        for(int i=0;i< arr.length;i++) tree.insert(arr[i]);

        System.out.println(tree.minValue());

        System.out.println(tree.maxValue());

    }
}