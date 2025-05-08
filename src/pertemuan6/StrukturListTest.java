package Tugas6;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        StrukturList list2 = new StrukturList();
        StrukturList list3 = new StrukturList();

        list.addTail(5);
        list.addTail(4);
        list.addTail(6);

        System.out.println("Elemen list : ");
        list.displayElement();

        System.out.println("\n");
        System.out.println(list.find(6));

        System.out.println("\n");

        list2.addTail(7);
        list2.addTail(6);
        list2.addTail(4);
        list2.addTail(2);
        list2.addTail(3);
        System.out.println("Element list : ");
        list2.displayElement();

        System.out.println("\n");
        System.out.println(list2.size());

        System.out.println("\n");

        list3.addTail(4);
        list3.addTail(3);
        list3.addTail(7);
        list3.addTail(8);
        list3.addTail(1);
        list3.addTail(9);
        System.out.println("Elemen list : ");
        list3.displayElement();
        System.out.println("\n");
        list3.clear();
        list3.displayElement();
    }
}
