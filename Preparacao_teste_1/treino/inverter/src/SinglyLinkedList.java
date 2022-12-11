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

    // inverte as a lista da posição x ate y
    public void inverter(int x,int y){
        if (x<0) x=0;
        if (y>=size()) y=size()-1;

        SinglyLinkedList<T> list = new SinglyLinkedList<>();

        Node<T> node = first;

        for (int i=0;i<x;i++){
            node=node.getNext();
        }
        for (int i=x;i<=y;i++){
            list.addLast(node.getValue());
            node=node.getNext();
        }

        node=list.first;
        SinglyLinkedList<T> inverted_list = new SinglyLinkedList<>();

        for (int i=x;i<=y;i++){
            inverted_list.addFirst(node.getValue());
            node=node.getNext();
        }

        node=first;
        for (int i=0;i<x;i++){
            node=node.getNext();
        }

        Node<T> inverted = inverted_list.first;

        for (int i=x;i<=y;i++){
           node.setValue(inverted.getValue());
           node=node.getNext();
           inverted=inverted.getNext();
        }


    }
}