public class ImplementationLLDS {
    public static void main(String[] args) {
        MyLinkedListDS list = new MyLinkedListDS();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtStart(50);
        System.out.println();System.out.println();
        list.print();
        list.insertAt(2, 100);
        list.print();
        list.size();
        list.insertAt(6, 200);
        list.print();
        list.size();
        list.insertAt(0, 000);
        list.print();
        System.out.println(list.head.data);
        list.print();
        list.deleteElement(3);
        list.print();
        list.size();
        list.deleteElement(6);
        list.print();
        System.out.println(list.tail.data);
    }
}
