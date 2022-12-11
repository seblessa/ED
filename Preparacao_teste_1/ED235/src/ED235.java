import java.util.Scanner;

public class ED235 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        int n;
        for (int i=0;i<N;i++){
            n=input.nextInt();
            draw(n);
        }

    }
    public static void draw(int n){
        final String ALIVE="#";
        final String DEAD=".";
        for (int i=0;i<n;i++){
            System.out.print(ALIVE.repeat(n-i)+DEAD.repeat(i));
            System.out.println();
        }
    }
}