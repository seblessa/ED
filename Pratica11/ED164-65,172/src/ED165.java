import java.util.Scanner;

public class ED165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        BSTree<Integer> tree = new BSTree<>();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i]= in.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                    tree.insert(array[i]+array[j]);
            }
        }
        n=in.nextInt();
        for (int i=0;i<n;i++){
            int num=in.nextInt();
            if (tree.contains(num)){
                System.out.println(num+": sim");
            }else System.out.println(num+": nao");
        }

    }
}