import java.util.Scanner;

public class Main {

    /*
    draw:

    n=3

    #.#
    .#.
    #..

    n=5

    #...#
    .#.#.
    ..#..
    .#...
    #....

    n=7

    #.....#
    .#...#.
    ..#.#..
    ...#...
    ..#....
    .#.....
    #......

     */

    final static String ALIVE="#";
    final static String DEAD=".";

    public static void draw(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i<n/2 && i==j){
                    System.out.print(ALIVE);
                }
                if (j==(n-1)-i){
                    System.out.print(ALIVE);
                }else System.out.print(DEAD);
                }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int C = in.nextInt();
        for (int i=0;i<C;i++){
            int n= in.nextInt();
            draw(n);
        }
    }

}