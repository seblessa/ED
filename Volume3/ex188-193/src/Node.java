public class Node<T> {
    private T value;      // Valor guardado no no
    private Node<T> next; // Referencia para o proximo no da lista

    // Construtor
    Node(T v, Node<T> n) {
        value = v;
        next = n;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    // Getters e Setters
    public T getValue() { return value; }
    public Node<T> getNext()  { return next; }
    public void setValue(T v) { value=v; }
    public void setNext(Node<T> n) { next = n; }
}