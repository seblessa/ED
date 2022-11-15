public class ED195 {
    public static boolean balanced(String s) {
        MyStack<Character> a = new LinkedListStack<>();
        for (int i=0;i<(s.length());i++){
            if (s.charAt(i) == '(' ) {
                a.push(s.charAt(i) );
            } else if(s.charAt(i) ==  '[')
                a.push(s.charAt(i) ) ;
            else if(s.charAt(i) == ']'){
                if (a.size() == 0)
                    a.push(s.charAt(i) );
                else if(a.top() == '[')
                    a.pop();
            }
            else if(s.charAt(i) == ')' ){
                if (a.size()==0)
                    a.push(s.charAt(i) );
                else if(a.top() == '(')
                    a.pop();
            }
        }
        return a.size() == 0;
    }


}