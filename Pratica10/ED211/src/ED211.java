public class ED211 {
    private static int count=0;
    public static int countEven(BTree<Integer> t) {
        count=0;
        return countEven(t.getRoot());
    }

    public static int countEven(BTNode<Integer> n){
        if (n==null) return 0;
        if (n.getValue()%2==0) count++;
        countEven(n.getLeft());
        countEven(n.getRight());
        return count;
    }
}