import java.util.Scanner;

public class ED237 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        input.nextLine();
        int n = input.nextInt();
        input.nextLine();

        MyQueue<Process> processes = new LinkedListQueue<>();

        for (int i=0;i<n;i++){
            String name=input.next();
            int time=input.nextInt();
            input.nextLine();
            processes.enqueue(new Process(name, time));
        }

        int sec=0;
        int iter=0;

        while(!(processes.isEmpty())){
            iter++;
            //System.out.println(processes);
            if (processes.first().getTime()<=T) {
                System.out.println(processes.first().getName()+" "+(sec+processes.first().getTime())+" "+iter);
                sec+=processes.first().getTime();
                processes.dequeue();
            }else {
                processes.first().setTime(processes.first().getTime()-T);
                processes.enqueue(processes.first());
                processes.dequeue();
                sec+=T;
            }

        }
    }
    public static class Process {
        private String name;
        private int time;

        Process(String name,int time){
            this.name=name;
            this.time=time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return name+" "+time;
        }
    }
}