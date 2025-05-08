package Tugas7;

public class StrukturListTest {
    public static void main(String[] args) {
        ListMataKuliah list = new ListMataKuliah();

        list.addTail(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        list.AddMid(new MataKuliah("IF002", "Pemrograman Web", 3), 1);
        list.AddMid(new MataKuliah("IF003", "Struktur Diskrit", 3), 1);
        list.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addHead(new MataKuliah("IF005", "Basis Data", 3));
        list.addHead(new MataKuliah("IF006", "Infrastruktur Jaringan", 2));
        list.displayElement();
        System.out.println("\nJumlah matakuliah: " + list.count());
    }
}





