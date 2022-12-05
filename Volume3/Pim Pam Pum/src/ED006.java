import java.util.Scanner;

public class ED006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int n;
        input.nextLine();
        String frase;
        String[] palavras;

        CircularLinkedList<String> list = new CircularLinkedList<>();

        for (int i=0;i<N;i++){
            frase=input.nextLine();
            palavras=frase.split(" ");
            n=input.nextInt();
            for (int j=0;j<n;j++){
                list.addLast(input.next());
            }
            while(list.size()!=1){
                for (int j=0;j<palavras.length-1;j++){
                    list.rotate();
                }
                list.removeFirst();
            }
            if (list.getFirst().equals("Carlos")){
                System.out.println("O Carlos nao se livrou");
            }else{
                System.out.println("O Carlos livrou-se (coitado do "+list.getFirst()+"!)");
            }
            input.nextLine();
            while (!(list.isEmpty())){
                list.removeFirst();
            }
        }




    }
}