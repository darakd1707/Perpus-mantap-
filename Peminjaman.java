
import java.util.ArrayList;

public class Peminjaman {

    private ArrayList<Integer> idsiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idbuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Buku buku = new Buku();
    public Siswa siswa = new Siswa();

    public Peminjaman() {
        this.idsiswa.add(1);
        this.idsiswa.add(2);
        this.idsiswa.add(3);

        for (int i = 0; i < buku.size(); i++) {
            this.idbuku.add(i);
        }
    }

    public void setsiswa(int id) {
        this.idsiswa.add(id);
    }

    public int getidsiswa(int id) {
        return this.idsiswa.indexOf(id);
    }

    public void setbuku(int id) {
        this.idbuku.add(id);
    }

    public int getbuku(int id) {
        return this.idbuku.indexOf(id);
    }

    public void setbanyak(int banyak) {
        this.banyak.add(banyak);
    }

    public int getidbanyak(int banyak) {
        return this.banyak.indexOf(banyak);
    }

    public int getbanyak(int id) {
        return this.banyak.get(id);
    }
}
