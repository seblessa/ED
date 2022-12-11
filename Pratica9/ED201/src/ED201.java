import java.util.Scanner;

public class ED201 {
    private static int[] read_array(Scanner in, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    // Escrever todos os subconjuntos do array v[]
    public static void sets(int[] v) {
    // array de booleanos para representar o conjunto
        boolean[] used = new boolean[v.length ];
        goSets (0, v, used); // chamar funçãoo recursiva

    }

    static int max=0;
    static int T;

    // Gera todos os subconjuntos a partir da posic¸˜ao ’cur’
    public static void goSets(int cur , int[] v, boolean[] used) {
        int sum=0;
        if (cur == v.length) { // Caso base: terminamos o conjunto
            for(int i=0; i<v.length; i++) { // Escrever conjunto
                if (used[i]){
                    sum+=v[i];
                }
            }
            if (sum<=T){
                max=Math.max(max,sum);
            }
            sum=0;
        }else{                              // Se não terminamos, continuar a gerar
            used[cur] = true ;              // Subconjuntos que incluem o elemento actual
            goSets(cur+1, v, used);    // Chamada recursiva
            used[cur] = false ;             // Subconjuntos que n˜ao incluem o el. actual
            goSets(cur+1, v, used);    // Chamada recursiva
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        int n= in.nextInt();
        in.nextLine();
        int[] arr=read_array(in, n);
        sets(arr);
        System.out.println(max);

    }


}