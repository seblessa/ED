import java.util.LinkedList;
import java.util.Scanner;

public class ED241 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int N = in.nextInt();
        in.nextLine();
        if (F==1){
            flag1(N,in);
        }else if (F==2){
            flag2(N,in);
        }else if (F==3){
            flag3(N,in);
        } else if (F==4) {
            flag4(N,in);
        }
    }
    private static void flag1(int n, Scanner in) {
        BSTree<String> tree = new BSTree<>();
        for (int i=0;i<n;i++){
            String[] line= in.nextLine().split(" ");
            tree.insert(line[0]);
        }
        System.out.println(tree.numberNodes());
    }

    private static void flag2(int n, Scanner in) {
        BSTMap<String,Integer> map = new BSTMap<>();
        for (int i=0;i<n;i++){
            String[] line= in.nextLine().split(" ");
            if (map.get(line[1])!=null){
                map.put(line[1],map.get(line[1])+1);
            }else map.put(line[1],1);
        }

        LinkedList<String> keys = map.keys();

        int max=0;
        String max_name="";
        for (String k:keys){
            if (Math.max(map.get(k),max)!=max){
                max=Math.max(map.get(k),max);
                max_name=k;
            }

        }

        System.out.println(max_name+" "+max);
    }
    private static void flag3(int n, Scanner in) {
        BSTMap<String,Integer> map_number = new BSTMap<>();
        BSTMap<String,Integer> map_total = new BSTMap<>();
        for (int i=0;i<n;i++){
            String[] line= in.nextLine().split(" ");
            if (map_total.get(line[1])!=null){
                map_total.put(line[1],map_total.get(line[1])+1);
            }else map_total.put(line[1],1);
            if (line[2].equals("Accepted")){
                if (map_number.get(line[1])!=null){
                    map_number.put(line[1],map_number.get(line[1])+1);
                }else map_number.put(line[1],1);
            }
        }
        LinkedList<String> keys = map_total.keys();
        for (String k:keys){
            if (((float)map_number.get(k)/map_total.get(k))>=0.5) System.out.println(k);
        }

    }
    // mapa: key = nome, value= conjunto de ex aceites
    private static void flag4(int n, Scanner in) {
        String[] tudo=new String[n];
        for (int i=0;i<n;i++){
            tudo[i] = in.nextLine();
        }


        BSTMap<String, BSTree<String>> map = new BSTMap<>();

        for (int i=0;i<n;i++){
            String[] line = tudo[i].split(" ");
            if (line[2].equals("Accepted")){
                if (map.get(line[0])!=null){
                    map.get(line[0]).insert(line[1]);
                    map.put(line[0],map.get(line[0]));
                }else{
                    BSTree<String> tree = new BSTree<>();
                    tree.insert(line[1]);
                    map.put(line[0],tree);
                }
            }
        }

        BSTMap<String,Integer> map_n = create_map(tudo);
        LinkedList<String> keys = map_n.keys();
        for (String k :map.keys()){
            if (map.get(k).numberNodes()==keys.size()) System.out.println(k);
        }



    }
    private static BSTMap<String,Integer> create_map(String[] lines){
        BSTMap<String,Integer> map = new BSTMap<>();
        for (String s : lines) {
            String[] line = s.split(" ");
            if (map.get(line[1]) != null) {
                map.put(line[1], map.get(line[1]) + 1);
            } else map.put(line[1], 1);
        }
        return map;
    }
}