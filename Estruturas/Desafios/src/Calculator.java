import java.util.Scanner;

public class Calculator {
    public static void um(int n){
        String[] str= new String[]{("...."), ("...#"), ("...#"), ("...."), ("...#"), ("...#"), ("....")};
        System.out.print(str[n]);
    }
    public static void dois(int n){
        String[] str= new String[]{(".##."), ("...#"), ("...#"), (".##."), ("#..."), ("#..."), (".##.")};
        System.out.print(str[n]);
    }
    public static void tres(int n){
        String[] str= new String[]{(".##."), ("...#"), ("...#"), (".##."), ("...#"), ("...#"), (".##.")};
        System.out.print(str[n]);
    }
    public static void quatro(int n){
        String[] str= new String[]{("...."), ("#..#"), ("#..#"), (".##."), ("...#"), ("...#"), ("....")};
        System.out.print(str[n]);
    }
    public static void cinco(int n){
        String[] str= new String[]{(".##."), ("#..."), ("#..."), (".##."), ("...#"), ("...#"), (".##.")};
        System.out.print(str[n]);
    }
    public static void seis(int n){
        String[] str= new String[]{(".##."), ("#..."), ("#..."), (".##."), ("#..#"), ("#..#"), (".##.")};
        System.out.print(str[n]);
    }
    public static void sete(int n){
        String[] str= new String[]{(".##."), ("#..#"), ("#..#"), ("...."), ("...#"), ("...#"), ("....")};
        System.out.print(str[n]);
    }
    public static void oito(int n){
        String[] str= new String[]{(".##."), ("#..#"), ("#..#"), (".##."), ("#..#"), ("#..#"), (".##.")};
        System.out.print(str[n]);
    }
    public static void nove(int n){
        String[] str= new String[]{(".##."), ("#..#"), ("#..#"), (".##."), ("...#"), ("...#"), (".##.")};
        System.out.print(str[n]);
    }
    public static void zero(int n){
        String[] str= new String[]{(".##."), ("#..#"), ("#..#"), ("...."), ("#..#"), ("#..#"), (".##.")};
        System.out.print(str[n]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String number= String.valueOf(N);
        char[] n_array=number.toCharArray();
        for (int k=0;k<7;k++){
            for (int i=0;i<n_array.length;i++){
                switch(n_array[i]){
                        case('0'):
                        zero(k);
                        break;
                    case('1'):
                        um(k);
                        break;
                    case('2'):
                        dois(k);
                        break;
                    case('3'):
                        tres(k);
                        break;
                    case('4'):
                        quatro(k);
                        break;
                    case('5'):
                        cinco(k);
                        break;
                    case('6'):
                        seis(k);
                        break;
                    case('7'):
                        sete(k);
                        break;
                    case('8'):
                        oito(k);
                        break;
                    case('9'):
                        nove(k);
                        break;

                }
                System.out.print(" ");
            }
            if (k<6){ System.out.println("");}
        }
    }
}