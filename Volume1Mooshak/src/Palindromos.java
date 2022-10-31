import java.util.Scanner;

public class Palindromos {

    public static String palindromo(String str){
        str=str.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return "nao";
            }
        }
        return "sim";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        System.out.println(n);
        String txt;

        for (int i=0;i<n;i++){
            txt=input.nextLine();
            System.out.println(palindromo(txt));
        }
    }
}
