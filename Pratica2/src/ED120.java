import java.util.Scanner;

public class ED120 {
    public static void drawlosango(int n){
        int p=1;
        int m=n/2;
        String a=".";
        String b="#";
        boolean flag=false;
        for (int i=0;i<n;i++){
            System.out.print(a.repeat(m));
            System.out.print(b.repeat(p));
            System.out.println(a.repeat(m));

            if (p>=n){
                flag=true;
            }
            if (flag){
                m++;
                p-=2;
            }else {
                m--;
                p+=2;
            }

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        drawlosango(n);
    }
}
