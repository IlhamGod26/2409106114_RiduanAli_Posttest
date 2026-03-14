class Takjil {
    private String nama;
    private int harga;
    private int stok;
    protected String kategori;

    public Takjil(String nama, int harga, int stok, String kategori) {
        this.nama = nama;
        this.setHarga(harga);
        this.setStok(stok);
        this.kategori = kategori;
    }

    // Getter
    public String getNama() { return nama; }
    public int getHarga() { return harga; }
    public int getStok() { return stok; }

    // Setter
    public void setNama(String nama) { this.nama = nama; }

    public void setHarga(int harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
            this.harga = 0;
        }
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
            this.stok = 0;
        }
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}