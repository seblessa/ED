import java.util.Scanner;

public class ED231 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int N=input.nextInt();
        int[] C =read_array(input,N);
        //print_array(C);
        input.nextLine();

        int flag= input.nextInt();
        input.nextLine();

        if (flag==1){
            flag_1(C);
        }else if (flag==2){
                flag_2(C);
            }else if (flag==3){
                    flag_3(C);
                }else System.out.println("flag invalid");

    }
    public static int[] read_array(Scanner input,int n){
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        return array;
    }
    public static void print_array(int[] array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void  flag_1(int[] C){
        int max=C[1]-C[0];
        int min=C[1]-C[0];
        int prev=C[1];
        for (int i=2;i<C.length;i++){
            if (C[i]-C[i-1]>max){
                max=C[i]-C[i-1];
            }
            if (C[i]-C[i-1]<min){
                min=C[i]-C[i-1];
            }
        }
        System.out.println(min+" "+max);
    }
    public static void  flag_2(int[] C){
        double percentage;
        final double MAX_VALUE = 5.0;
        int max=0;
        int count=0;
        int count_periods=0;
        for (int i=1;i< C.length;i++){
            percentage=(((double) C[i] / (double) C[i-1])*100)-100;
            if (percentage<=MAX_VALUE){
                count++;
            }else{
                if (count!=0){
                    count_periods++;
                }
                if (count>max){
                    max=count;
                }
                count=0;
            }
        }
        if (count!=0){
            count_periods++;
        }
        if (count>max){
            max=count;
        }
        System.out.println(count_periods+" "+max);
    }
    public static int max_array(int[] C){
        int max=C[0];
        for (int i=1;i< C.length;i++){
            if (C[i]>max){
                max=C[i];
            }
        }
        return max;
    }
    public static void  flag_3(int[] C){
        int max=max_array(C)/100;
        for (int i=max;i!=0;i--){
            for (int j=0;j<C.length;j++){
                if (C[j]/100>=i){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

}