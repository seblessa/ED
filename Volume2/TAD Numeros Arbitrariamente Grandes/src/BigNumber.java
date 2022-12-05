import java.util.Objects;

public class BigNumber {
    private int[] num;
    private int size;
    public BigNumber(String n) {
        size=n.length();
        num=new int[1000];
        for (int i=size;i>0;i--){
            num[size-i]=Character.getNumericValue(n.charAt(i-1));
        }
    }

    public void print_array(){
        for (int i=0;i<size;i++){
            System.out.print(num[i]);
        }
        System.out.println();
    }




    @Override
    public String toString(){
        String res = "";
        for (int i = size-1; i>=0;i--){
            res+=(num[i]);
        }
        return res;
    }

    public boolean equals(BigNumber n){
        return Objects.equals(toString(), n.toString());
    }

    public BigNumber copy(){
        BigNumber n = new BigNumber(toString());
        for (int i=0;i<size;i++){
            n.num[i]=num[i];
        }
        return n;
    }

    public void clear(){
        for(int i=0;i<size;i++){
            num[i]=0;
        }
    }


    public BigNumber add(BigNumber n){
        BigNumber k;
        int math=0,rest=0,max_size;
        boolean flag=false;

        if (size>n.size){
            k=this.copy();
            max_size=size;
            k.clear();
        }else{
            k=n.copy();
            max_size=n.size;
            k.clear();
        }

        for (int i=0;i<max_size;i++){
            math = num[i] +n.num[i];
            if (flag){
                math+=1;
                if (math>9){
                    rest=math-10;
                    k.num[i]=rest;
                }else{
                    k.num[i]=math;
                    flag=false;
                }
            }else{
                if (math>9){
                    rest=math-10;
                    k.num[i]=rest;
                    flag=true;
                }else{
                    k.num[i]=math;
                }
            }

        }

        if (flag){
            return  new BigNumber("1"+toString());
        }
        return k;
    }



}
