import java.util.Scanner;

public class Main {

    // Ex inventado

    // C triangulos equilateros com tamanho n


    /*


     n=3
     .#.
     ###

     n=5
    ..#..
    .###.
    #####

     n=7
   ...#...
   ..###..
   .#####.
   #######


     */

    static final String DEAD=".";
    static final String ALIVE="#";

    public static void triangle(int n){
        int count1=1;
        int count2=n/2;
        for (int i=0;i<=n/2;i++){
            for (int j=0;j<count2;j++){
                System.out.print(DEAD);
            }
            for (int j=0;j<count1;j++){
                System.out.print(ALIVE);
            }
            for (int j=0;j<count2;j++){
                System.out.print(DEAD);
            }
            count1+=2;
            count2--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        for (int i=0;i<C;i++){
            //3<=n<=∞
            int n= in.nextInt();
            triangle(n);
        }
    }
}