public class ED197 {
    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
        MyQueue<Integer> q = new LinkedListQueue<>();
        while(a.first()!=null || b.first()!=null){
            if (a.first()==null){
                q.enqueue(b.dequeue());
            }else if(b.first()==null){
                q.enqueue(a.dequeue());
            }else if (a.first()>b.first()){
                q.enqueue(b.dequeue());
            }else {
                q.enqueue(a.dequeue());
            }
        }
        return q;
    }
    public static void main(String[] args) {
        MyQueue<Integer> a = new LinkedListQueue<>();
        MyQueue<Integer> b = new LinkedListQueue<>();

        a.enqueue(2);
        a.enqueue(4);
        a.enqueue(8);
        a.enqueue(10);


        b.enqueue(1);
        b.enqueue(4);
        b.enqueue(9);

        /*
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        a.enqueue(40);
        a.enqueue(50);
        a.enqueue(60);
        a.enqueue(70);

        b.enqueue(1);
        b.enqueue(2);
        b.enqueue(3);
        b.enqueue(44);
        b.enqueue(50);
        b.enqueue(60);
        b.enqueue(70);
        b.enqueue(90);
         */

        MyQueue<Integer> q = merge(a,b);

        System.out.println(q);


    }
}
