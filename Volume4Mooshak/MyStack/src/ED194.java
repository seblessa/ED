public class ED194 {

    public static void reverse(MyStack<Integer> s, int n){
        Integer[] array=new Integer[n];
        for (int i=0;i<n;i++){
            array[i]= s.pop();
        }
        for (int i=0;i<n;i++){
            s.push(array[i]);
        }
    }
}
