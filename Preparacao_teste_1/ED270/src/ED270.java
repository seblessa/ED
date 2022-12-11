import java.util.Scanner;

public class ED270 {
    public static class Student{
        String name;
        int doutbs_left;
        int doutbs_today;

        public Student(String name, int doutbs_left) {
            this.name = name;
            this.doutbs_left = doutbs_left;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDoutbs_left() {
            return doutbs_left;
        }

        public void setDoutbs_left(int doutbs_left) {
            this.doutbs_left = doutbs_left;
        }

        public int getDoutbs_today() {
            return doutbs_today;
        }

        public void setDoutbs_today(int doutbs_today) {
            this.doutbs_today = doutbs_today;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // total de duvidas por dia
        int X = in.nextInt(); // max duvidas por aluno por dia
        int N = in.nextInt(); // n de alunos
        in.nextLine();        // preparar para receber strings
        int day=1;
        int R = T;            // duvidas restantes no dia

        MyQueue<Student> queue = new LinkedListQueue<>();

        for (int i=0;i<N;i++){
            Student s= new Student(in.next(), in.nextInt());
            in.nextLine();
            queue.enqueue(s);
        }
        while(!(queue.isEmpty())){
           if (R>0 && queue.first().doutbs_today<X){
               R--;
               Student cur = queue.dequeue();
               cur.setDoutbs_left(cur.getDoutbs_left()-1);
               cur.setDoutbs_today(cur.getDoutbs_today()+1);

               if (cur.doutbs_left==0){
                   System.out.println(cur.getName()+" "+day+" "+R);
               }else{
                   queue.enqueue(cur);
               }
           }else{
               day++;
               R=T;
               for (int i=0;i< queue.size();i++){
                   Student cur = queue.dequeue();
                   cur.setDoutbs_today(0);
                   queue.enqueue(cur);
               }
           }
        }
    }
}