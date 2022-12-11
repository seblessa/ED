import java.util.LinkedList;
import java.util.Scanner;

public class ED172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BSTMap<String,Integer> map = new BSTMap<>();

        while(in.hasNext()){
            String word=in.next();
            if (map.get(word)==null){
                map.put(word,1);
            }else {
                map.put(word,map.get(word)+1);
            }
        }

        LinkedList<String> keys = map.keys();

        for (int i=0;i< keys.size();i++){
            System.out.println(keys.get(i)+": "+map.get(keys.get(i)));
        }


    }
}
