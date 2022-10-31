public class Square {
    static void line(char a, char b, int n) {
        System.out.print(a);
        for (int i=1; i<=n-2; i++)
            System.out.print(b);
        System.out.println(a);
    }
    static void square (int n){
        for (int i =0;i<n;i++){
            if (i==0 || i==n-1){
                line('+','-',n);
                continue;
            }
            line('|','.',n);
        }
    }

    public static void main(String[] args) {
        // line('*','-',5);
        square(6);

    }
}