import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Takjil> daftar = new ArrayList<>();

        int pilihan = 0;

        while (pilihan != 5) {

            System.out.println("\n=== SISTEM PEMBELIAN TAKJIL ===");
            System.out.println("1. Tambah Takjil");
            System.out.println("2. Lihat Takjil");
            System.out.println("3. Ubah Takjil");
            System.out.println("4. Hapus Takjil");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("Nama Takjil : ");
                    String nama = input.nextLine();

                    System.out.print("Harga : ");
                    int harga = input.nextInt();

                    System.out.print("Stok : ");
                    int stok = input.nextInt();
                    input.nextLine();

                    Takjil t = new Takjil(nama, harga, stok);
                    daftar.add(t);

                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:

                    if (daftar.isEmpty()) {
                        System.out.println("Data kosong");
                    } else {

                        for (int i = 0; i < daftar.size(); i++) {

                            System.out.println("\nData ke-" + (i + 1));
                            System.out.println("Nama : " + daftar.get(i).nama);
                            System.out.println("Harga : " + daftar.get(i).harga);
                            System.out.println("Stok : " + daftar.get(i).stok);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Pilih nomor data: ");
                    int index = input.nextInt() - 1;
                    input.nextLine();

                    System.out.print("Nama baru : ");
                    String namaBaru = input.nextLine();

                    System.out.print("Harga baru : ");
                    int hargaBaru = input.nextInt();

                    System.out.print("Stok baru : ");
                    int stokBaru = input.nextInt();
                    input.nextLine();

                    daftar.set(index, new Takjil(namaBaru, hargaBaru, stokBaru));

                    System.out.println("Data berhasil diupdate");
                    break;

                case 4:

                    System.out.print("Pilih nomor data: ");
                    int hapus = input.nextInt() - 1;

                    daftar.remove(hapus);

                    System.out.println("Data berhasil dihapus");
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }
}