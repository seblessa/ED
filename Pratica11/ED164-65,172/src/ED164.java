import java.util.Scanner;

public class ED164 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        in.nextLine();

        BSTree<String> tree = new BSTree<>();

        for(int i=0;i<N;i++){
            String name = in.next();
            tree.insert(name);
        }

        System.out.println(tree.numberNodes());
    }
}
