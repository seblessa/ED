public class BooleanArrayIntSet implements IntSet{
    private boolean[] elem;
    private int size;
    private final int max_size;

    BooleanArrayIntSet(int max_size){
        elem= new boolean[max_size + 1];
        size=0;
        this.max_size=max_size;
    }

    @Override
    public boolean contains(int x) {
        return elem[x];
    }

    @Override
    public boolean add(int x) {
        if (contains(x)){
            return false;
        }else {
            elem[x]=true;
            size++;
            return true;
        }
    }

    @Override
    public boolean remove(int x) {
        if (contains(x)){
            elem[x]=false;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        elem= new boolean[max_size];
        size=0;
    }

    @Override
    public boolean equals(IntSet s) {
        if (s.size()==size){
            for (int i=0;i<size;i++){
                if (contains(i)&&!(s.contains(i))){
                    return false;
                }
                if (s.contains(i)&&!(contains(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public IntSet intersection(IntSet s) {
        IntSet n = new BooleanArrayIntSet(max_size);
        for (int i=0;i<max_size;i++){
            if (contains(i) && s.contains(i)){
                n.add(i);
            }
        }
        return n;
    }
}
