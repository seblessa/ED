import java.util.Scanner;

public class ED268 {
    final static String ALIVE="#";
    static final String DEAD=".";
    public static void lamda_with_repeat(int n){
        int a=0,b=n-1;
        for (int j=0;j<(n/2)+1;j++){
            System.out.print(DEAD.repeat(a));
            System.out.print(ALIVE);
            System.out.print(DEAD.repeat(b));
            System.out.println();
            a++;
            b--;
        }
        a=1;
        b=(n/2)-1;
        for (int k=(n/2)+1;k<n;k++){
            System.out.print(DEAD.repeat(b));
            System.out.print(ALIVE);
            System.out.print(DEAD.repeat(a));
            System.out.print(ALIVE);
            System.out.print(DEAD.repeat(b));
            System.out.println();
            a+=2;
            b--;
        }
    }
    public static void lamda_without_repeat(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    System.out.print(ALIVE);
                }else {
                    if ( (n-1)-j==i && i>n/2 ){
                        System.out.print(ALIVE);
                    }else {
                        System.out.print(DEAD);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N=in.nextInt();
        in.nextLine();

        for (int i=0;i<N;i++){
            int n= in.nextInt();
            //lamda_with_repeat(n);
            lamda_without_repeat(n);
        }
    }

}