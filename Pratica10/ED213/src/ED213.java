public class ED213 {

    // nao consegui arranjar maneira de guardar o caminho entao desiti

    final static String RIGHT ="D";
    final static String LEFT ="E";

    public static String maxSum(BTree<Integer> t){
        s="";
        soma=0;
        return maxSum(t.getRoot());
    }
    static int soma=0;
    static String s="";
    public static String maxSum(BTNode<Integer> n){
        if (n==null) return s;
        soma=n.getValue();
        s=maxSum(n.getLeft());

        return s;
    }
}