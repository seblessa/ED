import java.util.Scanner;

public class ED213 {

    // nao consegui arranjar maneira de guardar o caminho entao desisti

    final static String RIGHT ="D";
    final static String LEFT ="E";
    static String s="";
    static int soma=0;
    static int max=0;

    public static int maxSum(BTree<Integer> t){
        s="";
        max=0;
        return maxSum(t.getRoot());
    }
    private static int maxSum(BTNode<Integer> n){
        if (n==null) return 0;
        int leftSum = maxSum(n.getLeft());
        int rightSum = maxSum(n.getRight());
        return Math.max(leftSum+n.getValue(),rightSum+n.getValue());
    }


}