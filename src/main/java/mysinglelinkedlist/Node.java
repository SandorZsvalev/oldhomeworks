package mysinglelinkedlist;

public class Node <E> {
    E item;
    Node <E> next;

    Node(E element, Node <E> next) {
        this.item = element;
        this.next = next;
    }


    @Override
    public String toString() {
        return item.toString();
    }
}