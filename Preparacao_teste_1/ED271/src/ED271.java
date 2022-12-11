import java.util.Scanner;

public class ED271 {
    public static String replace(String str,int pos, String letters){
        return str.substring(0,pos)+letters+str.substring(pos+1);
    }

    public static char transform(int N, int K){
        String str = "A";
        for (int j=1;j<N;j++){
            for (int k=0;k<str.length();k++){
                if (str.charAt(k)=='A'){
                    str=replace(str,k,"AB");
                    k++;
                }else{
                    if (str.charAt(k)=='B'){
                        str=replace(str,k,"AC");
                        k++;
                    }else {
                        if (str.charAt(k)=='C') str=replace(str,k,"A");
                    }
                }
            }
        }

        return str.charAt(K-1);
    }

    public static char transform_opt(int N,int K){
        String str="A";
        for (int n=1;n<N;n++){
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)=='A'){
                    str= str.substring(0,i)+(str.charAt(i)+"B")+str.substring(i+1);
                    i++;
                }else {
                    if (str.charAt(i)=='B'){
                        str= str.substring(0,i)+("A"+"C")+str.substring(i+1);
                        i++;
                    }else {
                        if (str.charAt(i)=='C'){
                            str= str.substring(0,i)+"A"+str.substring(i+1);
                        }
                    }
                }
            }
        }
        return str.charAt(K-1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int C = in.nextInt();

        for (int i=0;i<C;i++){

            int N= in.nextInt();
            int K= in.nextInt();
            //System.out.println(transform(N,K));
            System.out.println(transform_opt(N,K));
        }
    }
}