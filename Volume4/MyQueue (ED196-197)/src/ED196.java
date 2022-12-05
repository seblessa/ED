public class ED196 {
    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
        String temp,name="";
        for (int i=0;i<q.size();i++){
            temp = q.dequeue();
            i--;
            if (!temp.equals("A")) if (!temp.equals("B")) if (!temp.equals("X")) name=temp;

            if (temp.equals("A")) a.enqueue(name);
            if (temp.equals("B")) b.enqueue(name);
            if (temp.equals("X")){
                if (a.size()!=b.size()){
                    if (a.size()>b.size()){
                        b.enqueue(name);
                    }else {
                        a.enqueue(name);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        MyQueue<String> q = new LinkedListQueue<>();
        MyQueue<String> a = new LinkedListQueue<>();
        MyQueue<String> b = new LinkedListQueue<>();

        q.enqueue("Luis");
        q.enqueue("B");
        q.enqueue("Pedro");
        q.enqueue("A");
        q.enqueue("Luisa");
        q.enqueue("B");
        q.enqueue("Joao");
        q.enqueue("X");
        q.enqueue("Jose");
        q.enqueue("X");
        q.enqueue("Miguel");
        q.enqueue("B");

        System.out.println(q.size());

        process(q,a,b);

        System.out.println("q"+q);
        System.out.println("a"+a);
        System.out.println("b"+b);

    }
}
