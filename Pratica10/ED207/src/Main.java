import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BTree<Integer> tree = LibBTree.readIntTree(in);
        in.nextLine();
        int n= in.nextInt();;
        for (int i=0;i< n;i++){
            System.out.println("t.nodesLevel("+i+") = "+tree.nodesLevel(in.nextInt()));
        }

    }
}