import java.util.Scanner;

public class Main {
    /*
      n=3

      #.#
      .#.

      n=5
     #...#
     .#.#.
     ..#..

      n=7

      #.....#
      .#...#.
      ..#.#..
      ...#...

     */

    static final String ALIVE= "#";
    static final String DEAD=".";

    public static void draw(int n){
        int count1=0,count2=n-2;
        for (int i=0;i<(n/2)+1;i++){
            //System.out.print(DEAD.repeat(count1));
            for (int j=0;j<count1;j++){
                System.out.print(DEAD);
            }
            System.out.print(ALIVE);
            if (count2>0){
                //System.out.print(DEAD.repeat(count2));
                for (int j=0;j<count2;j++){
                    System.out.print(DEAD);
                }
                System.out.print(ALIVE);
            }
            //System.out.print(DEAD.repeat(count1));
            for (int j=0;j<count1;j++){
                System.out.print(DEAD);
            }
            count1++;
            count2-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C= in.nextInt();
        for (int i=0;i<C;i++){
            int n=in.nextInt();
            draw(n);
        }
    }
}