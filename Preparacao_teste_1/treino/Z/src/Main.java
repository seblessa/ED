import java.util.Scanner;

public class Main {
    /*

    n=5

    #####
    ...#.
    .###.
    .#...
    #####

    n=7


     */
    static final String ALIVE="#";
    static final String DEAD=".";

    public static void draw(int n){
        for (int i=0;i<n;i++){
            if (i==0 || i==n-1){
                for (int j=0;j<n;j++){
                    System.out.print(ALIVE);
                }
            }else {
                if (i==1 || i==n-2){
                    for (int j=0;j<n;j++){
                       if (i==1 && j==n-2){
                           System.out.print(ALIVE);
                       }else if (i==n-2 && j==1){
                            System.out.print(ALIVE);
                        }else System.out.print(DEAD);
                    }
                }else {
                    if (i==n/2){
                        for(int k=0;k<n;k++){
                            if (k==n/2 || k==(n/2)-1  ||  k==(n/2)+1 ){
                                System.out.print(ALIVE);
                            }else System.out.print(DEAD);
                            }
                        }else{
                        for (int q=0;q<n;q++){
                            if (q==n-1-i){
                                System.out.print(ALIVE);
                            }else System.out.print(DEAD);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        for (int i=0;i<C;i++){
            System.out.println("5<=n<=∞");
            System.out.print("n: ");
            int n= in.nextInt();
            while (n<5){
                System.out.println("5<=n<=∞");
                System.out.print("n: ");
                n= in.nextInt();
            }
            draw(n);

        }
    }
}