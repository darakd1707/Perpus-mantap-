
import java.util.ArrayList;

public class Petugas implements user {

    private ArrayList<String> namakaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas() {
        this.namakaryawan.add("Mas");
        this.alamat.add("Malang");
        this.telepon.add("12345678");

        this.namakaryawan.add("Mbak");
        this.alamat.add("Blitar");
        this.telepon.add("32165498");
    }

    @Override
    public void setnama(String nama) {
        this.namakaryawan.add(nama);
    }

    @Override
    public void setalamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void settelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getnama(int id) {
        return namakaryawan.get(id);
    }

    @Override
    public String getalamat(int id) {
        return alamat.get(id);
    }

    @Override
    public String gettelepon(int id) {
        return telepon.get(id);
    }

    public void tampilpetugas() {
        System.out.println("=============Daftar Karyawan=============");
        System.out.println("-----------------------------------------");
        System.out.println("Nama\t\tAlamat\t\tTelepon");

        for (int i = 0; i < namakaryawan.size(); i++) {
            System.out.println(namakaryawan.get(i) + "\t\t" + alamat.get(i) + "\t\t" + telepon.get(i));
        }
    }
}
