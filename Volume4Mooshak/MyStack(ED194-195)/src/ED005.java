import java.util.Scanner;
public class ED005 {           //nao acabado



    public static boolean isInt(String number){
        if (number==null){
            return false;
        }
        for (int i=0;i<number.length();i++){
            if ((number.charAt(i)) < '0' || (number.charAt(i)) > '9'){
                return false;
            }
        }
        return true;
    }

    private static boolean isOperator(String operator) {
        if (operator.equals("+") || operator.equals("-")|| operator.equals("*")|| operator.equals("/")){
            return true;
        }
        return false;
    }
    public static String add(int a,int b){
        return  String.valueOf(a+b);

    }
    public static String sub(int a,int b){
        return  String.valueOf(a-b);

    }
    public static String times(int a,int b){
        return  String.valueOf(a*b);

    }
    public static String divide(int a,int b){
        return  String.valueOf(a/b);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        input.nextLine();

        for (int k=0;k<n;k++){
            LinkedListStack<String> pilha = new LinkedListStack<>();
            String operation = input.nextLine();

            String[] chars = operation.split(" ");



            int iter=0;
            String resultado="";

            if (isInt(chars[iter])){
                pilha.push(chars[iter++]);
            }else{
                System.out.println("Expressao Incorrecta");
                continue;
            }
            if (isInt(chars[iter])){
                pilha.push(chars[iter++]);
            }else{
                System.out.println("Expressao Incorrecta");
                continue;
            }
            int int_count=0,op_count=0;
            while (pilha.size()!=1 || iter==chars.length-1){
                if (isInt(chars[iter])){
                    int_count++;
                    pilha.push(chars[iter]);
                }else if (isOperator(chars[iter])){
                    op_count++;
                          int b=Integer.parseInt(pilha.pop());
                          int a=Integer.parseInt(pilha.pop());
                          if (chars[iter].equals("+")) resultado=add(a,b);
                          if (chars[iter].equals("-")) resultado=sub(a,b);
                          if (chars[iter].equals("*")) resultado=times(a,b);
                          if (chars[iter].equals("/")) resultado=divide(a,b);
                          pilha.push(resultado);
                      }else{
                         System.out.println("Expressao Incorrecta");
                         break;
                      }
/*
                if (int_count - op_count != 1) {
                    System.out.println("Expressao Incorrecta");
                    break;
                }

 */

                if (pilha.size()==2 && iter==chars.length-1){
                    break;
                }

                iter++;
            }

            if(pilha.size()==1){
                System.out.println(resultado);
            }else{
                System.out.println("Expressao Incorrecta");
            }



        }

    }



}
