package Tugas7;

import java.util.Scanner;

public class MenuMataKuliah {
    public static void main(String[] args) {
        ListMataKuliah list = new ListMataKuliah();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Menu Mata Kuliah ===");
            System.out.println("1. Tambah Mata Kuliah di Awal");
            System.out.println("2. Tambah Mata Kuliah di Akhir");
            System.out.println("3. Tambah Mata Kuliah di Tengah");
            System.out.println("4. Hapus Mata Kuliah dari Awal");
            System.out.println("5. Hapus Mata Kuliah dari Akhir");
            System.out.println("6. Hapus Mata Kuliah Berdasarkan SKS");
            System.out.println("7. Tampilkan Semua Mata Kuliah");
            System.out.println("8. Hitung Jumlah Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Tambah di Awal
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeAwal = scanner.nextLine();
                    System.out.print("Masukkan Nama Mata Kuliah: ");
                    String namaAwal = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sksAwal = scanner.nextInt();
                    list.addHead(new MataKuliah(kodeAwal, namaAwal, sksAwal));
                    break;

                case 2:
                    // Tambah di Akhir
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeAkhir = scanner.nextLine();
                    System.out.print("Masukkan Nama Mata Kuliah: ");
                    String namaAkhir = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sksAkhir = scanner.nextInt();
                    list.addTail(new MataKuliah(kodeAkhir, namaAkhir, sksAkhir));
                    break;

                case 3:
                    // Tambah di Tengah
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeTengah = scanner.nextLine();
                    System.out.print("Masukkan Nama Mata Kuliah: ");
                    String namaTengah = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sksTengah = scanner.nextInt();
                    System.out.print("Masukkan Posisi: ");
                    int posisi = scanner.nextInt();
                    list.AddMid(new MataKuliah(kodeTengah, namaTengah, sksTengah), posisi);
                    break;

                case 4:
                    // Hapus dari Awal
                    list.removeHead();
                    break;

                case 5:
                    // Hapus dari Akhir
                    list.removeTail();
                    break;

                case 6:
                    // Hapus Berdasarkan SKS
                    System.out.print("Masukkan SKS Mata Kuliah yang ingin dihapus: ");
                    int sksHapus = scanner.nextInt();
                    list.removeMid(sksHapus);
                    break;

                case 7:
                    // Tampilkan Semua Mata Kuliah
                    list.displayElement();
                    break;

                case 8:
                    // Hitung Jumlah Mata Kuliah
                    System.out.println("Jumlah mata kuliah: " + list.count());
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
