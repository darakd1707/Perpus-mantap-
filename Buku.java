
import java.util.ArrayList;

public class Buku {

    private ArrayList<String> namabuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.namabuku.add("Conan");
        this.stok.add(10);
        this.harga.add(15000);

        this.namabuku.add("Naruto");
        this.stok.add(15);
        this.harga.add(20000);

        this.namabuku.add("Spy Kid");
        this.stok.add(20);
        this.harga.add(25000);
    }

    public int size() {
        return this.namabuku.size();
    }

    public String getnamabuku(int id) {
        return this.namabuku.get(id);
    }

    public int getstok(int id) {
        return this.stok.get(id);
    }
    
    public int getharga(int id) {
        return this.harga.get(id);
    }

    public void setnama(String nama) {
        this.namabuku.add(nama);
    }

    public void setstok(int id, int stok) {
        this.stok.set(id, stok);
    }

    public void setharga(int harga) {
        this.harga.add(harga);
    }

    public void tampilbuku() {
        System.out.println("=============Daftar Buku=============");
        System.out.println("-------------------------------------");
        System.out.println("No\tNama Buku\tHarga\t\tStok");
        for (int i = 0; i < namabuku.size(); i++) {
            System.out.println((i + 1) + "\t" + getnamabuku(i) + "\t\t" + getharga(i) + "\t\t" + getstok(i));
        }
    }
}
