import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BTree<Integer> tree = LibBTree.readIntTree(in);
        System.out.println(tree.level(3));

    }
}