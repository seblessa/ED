import java.util.Scanner;
import static java.lang.Math.max;

public class ED198 {
    public static int[] read_array(int n,Scanner input){
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static int kadaneAlg(int[] arr,int size){
        int cur_sum=arr[0];
        int best_sum=arr[0];
        for (int i=1;i<size;i++){
            cur_sum=max(0,cur_sum+arr[i]);
            best_sum=max(cur_sum,best_sum);
        }
        return best_sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = read_array(n,input);
        int maxsoma=kadaneAlg(arr,n);
        System.out.println(maxsoma);
    }
}