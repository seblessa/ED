import java.util.LinkedList;
import java.util.Scanner;

public class ED234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int N = in.nextInt();
        in.nextLine();

        if (F==1){
            flag1(N,in);
        }else{
            if (F==2){
                flag2(N,in);
            }else{
                if (F==3){
                    flag3(N,in);
                }
            }
        }
    }

    public static void flag1(int N,Scanner in){
        BSTMap<String,Integer> map = new BSTMap<>();
        for (int i=0;i<N;i++){
            map.put(in.next(),in.nextInt());
            in.nextLine();
        }

        System.out.println(map.keys().size());
    }


    public static void flag2(int N,Scanner in){
        BSTMap<String,Integer> map = new BSTMap<>();
        for (int i=0;i<N;i++){
            String[] movie = in.nextLine().split(" ");
            if (map.get(movie[0])!=null){
                map.put(movie[0],map.get(movie[0])+1);
            }else map.put(movie[0],1);
        }

        LinkedList<String> keys = map.keys();
        int max=0;
        String movie_name="";
        for (String k:keys){
           int cur = map.get(k);
           if (cur>max){
               max=cur;
               movie_name=k;
           }
        }

        System.out.println(movie_name+" "+max);

    }

    public static void flag3(int N,Scanner in){
        BSTMap<String,Integer> map_total = new BSTMap<>();
        BSTMap<String,Integer> map_n = new BSTMap<>();
        for (int i=0;i<N;i++){
            String[] movie = {in.next(), String.valueOf(in.nextInt())};
            in.nextLine();
            if (map_total.get(movie[0])!=null){
                map_total.put(movie[0], map_total.get(movie[0])+Integer.valueOf(movie[1]));
            }else map_total.put(movie[0],Integer.valueOf(movie[1]));
            if (map_n.get(movie[0])!=null){
                map_n.put(movie[0],map_n.get(movie[0])+1);
            }else map_n.put(movie[0],1);
        }


        LinkedList<String> keys_total = map_total.keys();
        LinkedList<String> keys_n = map_n.keys();


        for (int i=0;i<keys_n.size();i++){
            if (map_total.get(keys_total.get(i)) / map_n.get(keys_n.get(i))>= 5){
                System.out.println(keys_n.get(i));
            }
        }

    }




}