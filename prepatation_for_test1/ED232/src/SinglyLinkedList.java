public class SinglyLinkedList<T> {
    private Node<T> first;    // Primeiro no da lista
    private int size;         // Tamanho da lista

    // Construtor (cria lista vazia)
    SinglyLinkedList() {
        first = null;
        size = 0;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Devolve true se a lista estiver vazia ou falso caso contrario
    public boolean isEmpty() {
        return (size == 0);
    }

    // Adiciona v ao inicio da lista
    public void addFirst(T v) {
        Node<T> newNode = new Node<T>(v, first);
        first = newNode;
        size++;
    }

    // Adiciona v ao final da lista
    public void addLast(T v) {
        Node<T> newNode = new Node<T>(v, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> cur = first;
            while (cur.getNext() != null)
                cur = cur.getNext();
            cur.setNext(newNode);
        }
        size++;
    }

    // Retorna o primeiro valor da lista (ou null se a lista for vazia)
    public T getFirst() {
        if (isEmpty()) return null;
        return first.getValue();
    }

    // Retorna o ultimo valor da lista (ou null se a lista for vazia)
    public T getLast() {
        if (isEmpty()) return null;
        Node<T> cur = first;
        while (cur.getNext() != null)
            cur = cur.getNext();
        return cur.getValue();
    }

    // Remove o primeiro elemento da lista (se for vazia nao faz nada)
    public void removeFirst() {
        if (isEmpty()) return;
        first = first.getNext();
        size--;
    }

    // Remove o ultimo elemento da lista (se for vazia nao faz nada)
    public void removeLast() {
        if (isEmpty()) return;
        if (size == 1) {
            first = null;
        } else {
            // Ciclo com for e uso de de size para mostrar alternativa ao while
            Node<T> cur = first;
            for (int i=0; i<size-2; i++)
                cur = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
        size--;
    }

    // Converte a lista para uma String
    public String toString() {
        String str = "{";
        Node<T> cur = first;
        while (cur != null) {
            str += cur.getValue();
            cur = cur.getNext();
            if (cur != null) str += ",";
        }
        str += "}";
        return str;
    }
    public void add(int pos, T v) {
        if (pos == 0) {
            addFirst(v);
            return;
        }
        if (pos >= size) {
            addLast(v);
            return;
        }
        Node<T> curr = first;
        size++;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.getNext();
        }
        Node<T> next = new Node<T>(v, curr.getNext());
        curr.setNext(next);
    }
    public void duplicate() {
        Node<T> curr = first;
        for (int i = 0; i <size; i+=2) {
            add(i, curr.getValue());
            curr = curr.getNext();
        }
    }
    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> returning = new SinglyLinkedList<>();
        Node<T> node = first;
        for(int i=0;i<size;i++){
            returning.addLast(node.getValue());
            node=node.getNext();

        }
        return returning;
    }

    public SinglyLinkedList<T> reverse(){
        SinglyLinkedList<T> new_list = copy();
        SinglyLinkedList<T> final_list = new SinglyLinkedList<>();

        while(new_list.getFirst()!=null){
            final_list.addLast(new_list.getLast());
            new_list.removeLast();
        }

        return final_list;
    }

    public int[] occurrences(T elem){
        int[] array = new int[100];
        Node<T> node = first;
        int i=0,pos=0;

        while(node!=null){

            if (node.getValue()!=null && node.getValue().equals(elem)){
                array[pos]=i;
                pos++;
            }
            node=node.getNext();
            i++;
        }
        int[] final_array = new int[pos];
        for (int l=0;l<pos;l++){
            final_array[l]=array[l];
        }

        if (pos==0){
            return null;
        }
        return final_array;
    }

    public T removePos(int pos) {
        if (isEmpty() || pos >= size || pos < 0) {
            return null;
        }
        Node<T> cur = first;
        size--;
        if (pos == 0) {
            T ret = cur.getValue();
            first = cur.getNext();
            return ret;
        } else {
            for (int i = 0; i < pos - 1; i++) {
                cur = cur.getNext();
            }
            T ret = cur.getNext().getValue();
            cur.setNext(cur.getNext().getNext());
            return ret;
        }
    }
    public void removeNode(Node<T> remove_node){
        Node<T> node = first;
        if (node.equals(remove_node)){
            first=node.getNext();
            size--;
            return;
        }
        while(node.getNext()!=null){
            if (node.getNext().getValue()!=null&&(node.getNext().getValue()).equals(remove_node.getValue())){
                node.setNext(node.getNext().getNext());
                size--;
                break;
            }
            node=node.getNext();
        }

    }

    public void remove(SinglyLinkedList<T> toRemove){
        Node<T> remove_node = toRemove.first;
        while(remove_node!=null){
            int[] arr = occurrences(remove_node.getValue());
            if (arr!=null){
                for (int j=0;j<arr.length;j++){
                    removePos(arr[j]);
                    arr=subarray(arr);
                }
            }
            remove_node=remove_node.getNext();
        }
    }

    public int[] subarray(int[] arr){
        for (int i=0;i< arr.length;i++){
            arr[i]--;
        }
        return arr;
    }

    //2 ciclos while e remove cada node com valor igual ao valor dos nodes da lista para remover FUNCIONA
    /*
    public void remove(SinglyLinkedList<T> toRemove){
        Node<T> remove_node = toRemove.first;
        Node<T> list_node = first;

        while(remove_node!=null){
            while(list_node!=null){
                if (remove_node.getValue().equals(list_node.getValue())){
                    removeNode(list_node);
                }
                list_node = list_node.getNext();
            }
            list_node =first;
            remove_node=remove_node.getNext();
        }
    }
    */


}