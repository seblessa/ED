import java.util.Scanner;

public class ED215 {

    static class Offer implements Comparable<Offer>{
        String name;
        int money;

        public Offer(String name,int money){
            this.name=name;
            this.money=money;
        }
        public String getName(){
            return name;
        }
        public int getMoney(){
            return money;
        }
        @Override
        public String toString() {
            return money + " " + name;
        }

        @Override
        public int compareTo(Offer o) {
            return o.money - money;
        }
    }

    static final String venda = "VENDA";
    static final String oferta = "OFERTA";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        MinHeap<Offer> offers = new MinHeap<>(n);
        for (int i=0;i<n;i++){
            String[] line = in.nextLine().split(" ");

            if (line[0].equals(oferta)){
                offers.insert(new Offer(line[1],Integer.parseInt(line[2])));
            }else if (line[0].equals(venda)){
                System.out.println(offers.removeMin());
            }
        }
    }




}