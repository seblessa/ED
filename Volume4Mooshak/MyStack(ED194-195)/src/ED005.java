import java.util.Scanner;
public class ED005 {           //nao acabado

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        input.nextLine();

        for (int i=0;i<n;i++){
            LinkedListStack<String> pilha = new LinkedListStack<>();

            String operation = input.nextLine();

            String[] operators = operation.split(" ");
            int iter=0,resultado=0;


            for (int j=0;j<operators.length;j++){
                pilha.push(operators[j]);
                if (iter<2 && pilha.top()==""){

                }

                iter++;
            }

            if(pilha.isEmpty()){
                System.out.println(resultado);
            }


        }
    }
}
