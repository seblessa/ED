import java.util.Scanner;

public class Main {
    public static void ED241(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int N = in.nextInt();
        in.nextLine();
        if (F==1){
            flag1(N,in);
        }else if (F==2){
            flag2(N,in);
        }else if (F==3){
            flag3(N,in);
        } else if (F==4) {
            flag4(N,in);
        }
    }

    private static void flag1(int n, Scanner in) {
        BSTree<String> tree = new BSTree<>();
        for (int i=0;i<n;i++){
            String[] line= in.nextLine().split(" ");
            tree.insert(line[0]);
        }
        System.out.println(tree.numberNodes());
    }
    private static void flag2(int n, Scanner in) {



    }
    private static void flag3(int n, Scanner in) {



    }
    private static void flag4(int n, Scanner in) {




    }
}