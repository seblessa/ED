public class ArrayListIntSet implements IntSet{
    private int size;   // Numero de elementos do conjunto
    private int elem[]; // Array que contem os elementos em si

    ArrayListIntSet(int maxSize) {
        elem = new int[maxSize];
        size = 0;
    }

    public boolean add(int x) {
        if (!contains(x)) {
            if (size == elem.length)
                throw new RuntimeException("Maximum size of set reached");
            elem[size] =  x;
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(int x) {
        if (contains(x)) {
            int pos = 0;
            while (elem[pos] != x) pos++;
            size--;
            elem[pos] = elem[size]; // Trocar ultimo elemento
            return true;            // com o que se removeu
        }
        return false;
    }
    public boolean contains(int x) {
        for (int i=0; i<size; i++)
            if (elem[i] == x)
                return true;
        return false;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String res = "{";
        for (int i=0; i<size; i++) {
            if (i>0) res += ",";
            res += elem[i];
        }
        res += "}";
        return res;
    }

    @Override
    public boolean equals(IntSet s) {
        if (s.size()==size){
            for (int i=0;i<size;i++){
                if (!(s.contains(elem[i]))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public IntSet intersection(IntSet s) {
        IntSet n = new ArrayListIntSet(100);
        for (int i=0;i<size;i++){
            if (s.contains(elem[i])){
                n.add(elem[i]);
            }
        }
        return n;
    }
}
