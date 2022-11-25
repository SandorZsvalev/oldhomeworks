package mysinglelinkedlist;

public class ListApp {

    public static void main(String[] args) {

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        System.out.println(" Добавление элементов в лист и вывод листа ");
        singleLinkedList.add("Alex");
        singleLinkedList.add("Petr");
        singleLinkedList.add("Ivan");
        singleLinkedList.add("Nick");
        singleLinkedList.add("Max");
        singleLinkedList.printList();
        System.out.println(" <----> ");

        System.out.println(" Добавление первого элемента в лист и вывод листа ");
        singleLinkedList.addFirst("Vasily");
        singleLinkedList.printList();
        System.out.println(" <----> ");

        System.out.println(" Добавление последнего элемента в лист и вывод листа ");
        singleLinkedList.addLast("Anna");
        singleLinkedList.printList();
        System.out.println(" <----> ");

        System.out.println(" Удаление первого элемента из листа и вывод листа ");
        singleLinkedList.removeFirst();
        singleLinkedList.printList();
        System.out.println(" <----> ");

        System.out.println(" Вывод размера листа");
        System.out.println(singleLinkedList.size());
        System.out.println(" <----> ");

        System.out.println(" Прямой вывод элементов листа");
        singleLinkedList.printList();
        System.out.println(" <----> ");

        System.out.println(" Обратный вывод элементов листа");
        singleLinkedList.reversePrintList();
    }

}
