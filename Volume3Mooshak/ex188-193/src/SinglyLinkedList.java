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
            for (int i = 0; i < size - 2; i++)
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

    //Recebe o valor da posição pos
    public T get(int pos) {
        Node<T> cur = first;
        if (isEmpty() || pos >= size() || pos < 0) {
            return null;
        }
        for (int i = 0; i < pos; i++) {
            cur = cur.getNext();
        }
        return cur.getValue();
    }

    //Adiciona um valor a seguir a posição pos
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

    //Remove o valor da posição pos e recebe o valor eliminado
    public T remove(int pos) {
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

    //Recebe uma copia da lista
    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> list = new SinglyLinkedList<T>();
        if (size == 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            list.addLast(this.get(i));
        }
        return list;
    }

    //duplica cada valor da lista
    public void duplicate() {
        Node<T> curr = first;
        for (int i = 0; i <size; i+=2) {
            add(i, curr.getValue());
            curr = curr.getNext();
        }
    }

    //conta o valor  v da lista
    public int count(T v){
        Node<T> curr = first;
        int count=0;
        for (int i=0;i<size;i++){
            if (curr.getValue().equals(v)){
                count++;
            }
            curr=curr.getNext();
        }
        return count;
    }

    //remove todas as repetições de v da lista
    public void removeAll(T v){
        Node<T> curr = first;
        for (int i=0;i<size;i++){
            if (curr.getValue().equals(v)){
                remove(i);
                i--;
            }
            curr=curr.getNext();
        }
    }
}