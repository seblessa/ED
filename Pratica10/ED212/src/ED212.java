public class ED212 {
    public static int[] sumLevels(BTree<Integer> t){
        int[] arr = new int[t.depth()+1];
        int i=0;
        return sumLevels(t.getRoot(),arr,i);
    }
    public static int[] sumLevels(BTNode<Integer> n,int[] arr,int i){
        if (n==null) return arr;
        arr[i]+=n.getValue();
        arr=sumLevels(n.getLeft(),arr,i+1);
        arr=sumLevels(n.getRight(),arr,i+1);
        return arr;

    }
}