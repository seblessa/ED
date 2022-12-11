import java.util.Scanner;


// NAO ACABADO


public class ED015 {
    static class Sopa{
        int rows;
        int cols;
        char[][] inicial_matrix;
        char[][] final_matrix;


        public Sopa(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
        }
        public void fill_final_matrix(){
            for (int i=0;i<rows;i++){
                for (int j=0;j<cols;j++){
                    final_matrix[i][j]='.';
                }
            }
        }
        public void readmatrix(){
            final_matrix = new char[rows][cols];
            fill_final_matrix();
            Scanner input = new Scanner(System.in);

            String str;
            inicial_matrix = new char[rows][cols];

            for (int i=0;i<rows;i++){
                str = input.nextLine();
                for (int j=0;j<cols;j++){
                    inicial_matrix[i][j]=str.charAt(j);
                }
            }

        }
        public void print_inicial(){
            for (int i = 0; i< inicial_matrix.length; i++){
                for (int j = 0; j< inicial_matrix[0].length; j++){
                    System.out.print(inicial_matrix[i][j]);
                }
                System.out.println();
            }
        }
        public void print_final(){
            for (int i = 0; i< final_matrix.length; i++){
                for (int j = 0; j< final_matrix[0].length; j++){
                    System.out.print(final_matrix[i][j]);
                }
                System.out.println();
            }
        }

        public void search(String word){
            if (up(word)){
                return;
            }
            if (down(word)){
                return;
            }
            if (right(word)){
                return;
            }
            if (left(word)){
                return;
            }
        }

        public boolean up(String word){
            boolean flag=false;
            int final_i=0;
            int final_j=0;
            int n=0;
            for (int j=0;j<cols;j++){
                for (int i=rows-1;i<word.length()-1;i--){
                    System.out.println(i);
                    if (inicial_matrix[i][j] == word.charAt(n)){
                        int k=i;
                        n++;
                        while(n<word.length()){
                            i--;
                            if (inicial_matrix[i][j] != word.charAt(n)){
                                break;
                            }
                            n++;
                        }
                        if (n==word.length()){
                            final_i=i;
                            final_j=j;
                            flag=true;
                            break;
                        }else{
                            n=0;
                            i=k;
                        }
                    }
                }
                if (flag){
                    break;
                }
            }
            if (flag){
                int l=word.length()-1;
                for (int i=final_i;i<word.length();i++){
                    final_matrix[i][final_j]=word.charAt(l);
                    l--;
                }
                return true;
            }
            return false;
        }
        public boolean down(String word){
            boolean flag=false;
            int final_i=0;
            int final_j=0;
            int n=0;
            for (int j=0;j<cols;j++){
                for (int i=0;i<word.length();i++){
                    if (inicial_matrix[i][j] == word.charAt(n)){
                        n++;
                        while(n<word.length()){
                            i++;
                            System.out.println(i);
                            System.out.println(n);
                            if (inicial_matrix[i][j] != word.charAt(n)){
                                break;
                            }
                            n++;
                        }
                        if (n==word.length()){
                            final_i=i;
                            final_j=j;
                            flag=true;
                            break;
                        }else{
                            n=0;
                        }
                    }
                }
                if (flag){
                    break;
                }
            }
            if (flag){
                for (int i=final_i;i<word.length();i++){
                    final_matrix[i][final_j]=word.charAt(i);
                }
                return true;
            }
            return false;
        }
        public boolean right(String word){



            return false;
        }
        public boolean left(String word){



            return false;
        }



    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r= Integer.parseInt(input.next());
        int c= Integer.parseInt(input.next());



        while (r!=0 && c!=0){
            Sopa caldoverde = new Sopa(r,c);

            System.out.println("matrix:");

            caldoverde.readmatrix();

            System.out.println("n_words:");

            int n= input.nextInt();

            System.out.println("words:");
            for (int i=0;i<n;i++){
                input.nextLine();
                String word = input.nextLine();

                caldoverde.search(word);
            }

            System.out.println("\nfinal:");
            caldoverde.print_final();

            //caldo.print_inicial();


            r= Integer.parseInt(input.next());
            c= Integer.parseInt(input.next());
        }
    }
}
