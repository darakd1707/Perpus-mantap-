
import java.util.ArrayList;

public class Siswa implements user {

    private ArrayList<String> namasiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {
        this.namasiswa.add("Dara");
        this.alamat.add("Blitar");
        this.telepon.add("23564231");
        this.status.add(true);

        this.namasiswa.add("Kania");
        this.alamat.add("Blitar");
        this.telepon.add("65321565");
        this.status.add(true);

        this.namasiswa.add("Damanik");
        this.alamat.add("Blitar");
        this.telepon.add("12356879");
        this.status.add(true);
    }

    @Override
    public void setnama(String namasiswa) {
        this.namasiswa.add(namasiswa);
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
        return namasiswa.get(id);
    }

    @Override
    public String getalamat(int id) {
        return alamat.get(id);
    }

    @Override
    public String gettelepon(int id) {
        return telepon.get(id);
    }

    public void setstatus(int id, boolean status) {
        this.status.set(id, status);
    }

    public boolean getstatus(int id) {
        return this.status.get(id);
    }

    public void tampilsiswa() {
        for (int i = 0; i < namasiswa.size(); i++) {
            System.out.println("Nama siswa: " + namasiswa.get(i));
            System.out.println("Alamat: " + alamat.get(i));
            System.out.println("Telepon: " + telepon.get(i));
        }
    }

}
