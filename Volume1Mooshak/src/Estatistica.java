import java.util.Scanner;

public class Estatistica {
    static Scanner input = new Scanner(System.in);

    public static void read_array(int[] array){
        for (int i = 0; i<array.length ;i++){
            array[i]=input.nextInt();
        }
    }

    public static void print_array(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static float media(int[] array){
        float total=0;
        for(int i=0;i<array.length;i++){
            total=total+array[i];
        }
        return total/array.length;
    }

    public static int amp(int[] array){
        int max=array[0],min=array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
        int size = input.nextInt();

        int[] nums = new int[size];

        read_array(nums);

        float media=media(nums);

        int amp=amp(nums);

        System.out.printf("%.2f\n",media);
        System.out.println(amp);

    }
}
