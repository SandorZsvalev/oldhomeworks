package mysinglelinkedlist;

import java.util.ArrayList;
import java.util.Collections;

            /*
        First level: Написать свой класс LinkedList , только в отличие от штатной реализации ,
        сделать его как Single Linked List , где каждый текущий элемент имеет ссылку только на следующий.
        Задать 5 элементов этого списка.

        Second level: Сделать вывод списка, в прямом и обратном порядке.
         */

public class SingleLinkedList<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public SingleLinkedList() {
    }

    public void add(E element) {
        addLast(element);
    }

    public void addFirst(E element) {
        Node<E> n = new Node<>(element, null);
        if (!isEmpty()) {
            Node<E> oldFirst = first;
            first = n;
            n.next = oldFirst;
        } else {
            first = n;
            last = n;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> n = new Node<>(element, null);
        if (!isEmpty()) {
            Node<E> oldLast = last;
            last = n;
            oldLast.next = last;
        } else {
            first = n;
            last = n;
        }
        size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Node<E> neuFirst = first.next;
            first = neuFirst;
            size--;
        } else {
            System.out.println("List is empty");
        }
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Node<E> elForPrint = first;
        for (int i = 0; i < size; i++) {
            System.out.println(elForPrint);
            elForPrint = elForPrint.next;
        }
    }

    public void reversePrintList() {
        Node<E> elForPrint = first;
        ArrayList<Node<E>> reversedList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            reversedList.add(elForPrint);
            elForPrint = elForPrint.next;
        }
        Collections.reverse(reversedList);
        reversedList.forEach(e -> System.out.println(e.item));
    }
}


