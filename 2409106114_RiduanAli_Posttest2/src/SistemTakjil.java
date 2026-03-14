import java.util.ArrayList;
import java.util.Scanner;

public class SistemTakjil {
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
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Takjil : ");
                    String nama = input.nextLine();
                    System.out.print("Harga       : ");
                    int harga = input.nextInt();
                    System.out.print("Stok        : ");
                    int stok = input.nextInt();
                    input.nextLine();
                    System.out.print("Kategori    : ");
                    String kategori = input.nextLine();
                    Takjil t = new Takjil(nama, harga, stok, kategori);
                    daftar.add(t);
                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    if (daftar.isEmpty()) {
                        System.out.println("Data masih kosong.");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            Takjil item = daftar.get(i);
                            System.out.println("\n[Data ke-" + (i + 1) + "]");
                            System.out.println("Nama     : " + item.getNama());
                            System.out.println("Harga    : " + item.getHarga());
                            System.out.println("Stok     : " + item.getStok());
                            System.out.println("Kategori : " + item.kategori);
                        }
                    }
                    break;


                case 3:
                    if (daftar.isEmpty()) {
                        System.out.println("Data kosong.");
                        break;
                    }
                    System.out.print("Pilih nomor data: ");
                    int index = input.nextInt() - 1;
                    input.nextLine();

                    if (index >= 0 && index < daftar.size()) {
                        System.out.print("Nama baru     : ");
                        String nBaru = input.nextLine();
                        System.out.print("Harga baru    : ");
                        int hBaru = input.nextInt();
                        System.out.print("Stok baru     : ");
                        int sBaru = input.nextInt();
                        input.nextLine();
                        System.out.print("Kategori baru : ");
                        String kBaru = input.nextLine();

                        Takjil update = daftar.get(index);
                        update.setNama(nBaru);
                        update.setHarga(hBaru);
                        update.setStok(sBaru);
                        update.setKategori(kBaru);

                        System.out.println("Data berhasil diupdate.");
                    } else {
                        System.out.println("Nomor data tidak valid.");
                    }
                    break;

                case 4:
                    System.out.print("Pilih nomor data: ");
                    int hapus = input.nextInt() - 1;
                    if (hapus >= 0 && hapus < daftar.size()) {
                        daftar.remove(hapus);
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Gagal menghapus, nomor salah.");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
        input.close();
    }
}