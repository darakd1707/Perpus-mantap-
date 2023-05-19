
import java.util.Scanner;
import java.time.LocalDate;

public class main {

    Scanner input = new Scanner(System.in);
    Buku b = new Buku();
    Peminjaman pinjam = new Peminjaman();
    Petugas tugas = new Petugas();
    Siswa s = new Siswa();
    LocalDate tanggal = LocalDate.now();
    int pilihbuku = 0;
    int id;

    public void tanggal() {
        System.out.println(tanggal);
        System.out.println("-----------------");
    }

    public void identitas() {
        System.out.println("Masukkan ID Siswa");
        id = input.nextInt();
        System.out.println("Selamat datang " + s.getnama(pinjam.getidsiswa(id)));
        System.out.println("");
    }

    public void proses() {

        System.out.println("------Perpustakaan-----");
        System.out.println("1. List Buku");
        System.out.println("2. List Pegawai");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Mengembalikan Buku");
        System.out.println("5. Beli buku");
        System.out.println("6. Exit");
        int pilihaksi = input.nextInt();

        if (pilihaksi == 1) {
            b.tampilbuku();
            System.out.println("Mau lihat menu lain? [1.ya/2.tidak]");
            int answer = input.nextInt();
            if (answer == 1) {
                System.out.println("----------------------------");
                proses();
            }
        } else if (pilihaksi == 2) {
            tugas.tampilpetugas();
            System.out.println("Mau lihat menu lain? [1.ya/2.tidak]");
            int g = input.nextInt();
            if (g == 1) {
                System.out.println("----------------------------");
                proses();
            }
        } else if (pilihaksi == 3) {
            b.tampilbuku();
            System.out.println("");
            System.out.println("Silakan memilih buku");
            pilihbuku = input.nextInt();
            if (s.getstatus(pilihbuku) == true) {                
                b.setstok(pilihbuku, b.getstok(pilihbuku) - 1);
                s.setstatus(pinjam.getidsiswa(pilihbuku), false);
                System.out.println("");
                if (pilihbuku == 1) {
                    System.out.println("Anda memilih buku " + b.getnamabuku(pilihbuku - 1));
                    System.out.println("Rincian buku yang akan dipinjam");
                    System.out.println("Judul Buku: " + b.getnamabuku(pilihbuku - 1));
                    System.out.println("Harga Buku: " + b.getharga(pilihbuku - 1));
                    System.out.println("Stok: " + b.getstok(pilihbuku - 1));
                } else if (pilihbuku == 2) {
                    System.out.println("Anda memilih buku " + b.getnamabuku(pilihbuku - 1));
                    System.out.println("Rincian buku yang akan dipinjam");
                    System.out.println("Judul Buku: " + b.getnamabuku(pilihbuku - 1));
                    System.out.println("Harga Buku: " + b.getharga(pilihbuku - 1));
                    System.out.println("Stok: " + b.getstok(pilihbuku - 1));
                } else if (pilihbuku == 3) {
                    System.out.println("Anda memilih buku " + b.getnamabuku(pilihbuku - 1));
                    System.out.println("Rincian buku yang akan dipinjam");
                    System.out.println("Judul Buku: " + b.getnamabuku(pilihbuku - 1));
                    System.out.println("Harga Buku: " + b.getharga(pilihbuku - 1));
                    System.out.println("Stok: " + b.getstok(pilihbuku - 1));
                }
            } else if (s.getstatus(pilihbuku) == false) {
                System.out.println("Anda sudah meminjam buku sebelumnya");
            }

            System.out.println("Apakah Anda yakin akan meminjam? [1.ya/2.tidak]");
            int sure = input.nextInt();
            if (sure == 1) {
                System.out.println("Anda tidak boleh meminjam buku sebelum buku ini dikembalikan");
                System.out.println("Mau lihat menu lain? [1.ya/2.tidak]");
                int y = input.nextInt();
                if (y == 1) {
                    System.out.println("----------------------------");
                    proses();
                }
            }
            if (sure == 2) {
                System.out.println("Mau lihat menu lain? [1.ya/2.tidak]");
                int jawab = input.nextInt();
                if (jawab == 1) {
                    System.out.println("----------------------------");
                    proses();
                }
            }
        } else if (pilihaksi == 5) {
            int total;
            b.tampilbuku();
            System.out.println("Silakan pilih buku yang akan dibeli");
            int pilih = input.nextInt();
            System.out.print("Jumlah beli: ");
            int jumlah = input.nextInt();
            pinjam.setbanyak(jumlah);
            if (pinjam.getbanyak(pinjam.getidbanyak(jumlah)) <= b.getstok(pilih - 1)) {
                b.setstok(pilih, b.getstok(pilih) - jumlah);
                System.out.println("Anda membeli buku " + b.getnamabuku(pilih - 1));
                if (pilih == 1) {
                    total = jumlah * 15000;
                    System.out.println("Jumlah yang harus dibayarkan: " + total);
                    System.out.print("Uang anda: ");
                    int uang = input.nextInt();
                    if (uang < total) {
                        System.out.println("Uang anda kurang");
                    } else if (uang == total) {
                        System.out.println("Uang anda pas");
                    } else if (uang > total) {
                        int kembalian = uang - total;
                        System.out.println("Kembalian anda: " + kembalian);
                    }
                } else if (pilih == 2) {
                    total = jumlah * 20000;
                    System.out.println("Jumlah yang harus dibayarkan: " + total);
                    System.out.print("Uang anda: ");
                    int uang = input.nextInt();
                    if (uang < total) {
                        System.out.println("Uang anda kurang");
                    } else if (uang == total) {
                        System.out.println("Uang anda pas");
                    } else if (uang > total) {
                        int kembalian = uang - total;
                        System.out.println("Kembalian anda: " + kembalian);
                    }
                } else if (pilih == 3) {
                    total = jumlah * 25000;
                    System.out.println("Jumlah yang harus dibayarkan: " + total);
                    System.out.print("Uang anda: ");
                    int uang = input.nextInt();
                    if (uang < total) {
                        System.out.println("Uang anda kurang");
                    } else if (uang == total) {
                        System.out.println("Uang anda pas");
                    } else if (uang > total) {
                        int kembalian = uang - total;
                        System.out.println("Kembalian anda: " + kembalian);
                    }
                }
                System.out.println("Apakah mau melihat menu lain? [1.ya/2.tidak]");
                int abc = input.nextInt();
                if (abc == 1) {
                    System.out.println("----------------------------");
                    proses();
                }
            } else {
                System.out.println("Jumlah yang anda inginkan melebihi stok yang ada");
            }
        } else if (pilihaksi == 4) {

            System.out.println("Masukkan id buku yang ingin anda kembalikan");
            int balik = input.nextInt();
            if (s.getstatus(pinjam.getidsiswa(id)) == false) {
                if (pilihbuku == balik) {
                    b.setstok(pilihbuku, b.getstok(pilihbuku) + 1);
                    s.setstatus(pinjam.getidsiswa(pilihbuku), true);
                    System.out.println("Terima kasih telah mengembalikan buku " + b.getnamabuku(balik - 1));
                } else {
                    System.out.println("Buku yang anda kembalikan tidak sesuai");
                    System.out.println("Apakah mau melihat menu lain? [1.ya/2.tidak]");
                    int k = input.nextInt();
                    if (k == 1) {
                        System.out.println("----------------------------");
                        proses();
                    }
                }
                System.out.println("Apakah mau meminjam buku lain? [1.ya/2.tidak]");
                int ya = input.nextInt();
                if (ya == 1) {
                    System.out.println("----------------------------");
                    proses();
                }
            } else {
                System.out.println("Anda belum meminjam buku");
                System.out.println("Apakah mau melihat menu lain? [1.ya/2.tidak]");
                int gatau = input.nextInt();
                if (gatau == 1) {
                    System.out.println("----------------------------");
                    proses();
                }
            }
        }
    }
}
