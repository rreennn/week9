package week9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Silahkan Pilih Bangun");
            System.out.println("=====================================");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Kubus");
            System.out.println("5. Balok");
            System.out.println("6. Tabung");
            System.out.println("0. Exit");
            System.out.println("=====================================");
            System.out.print("Pilihan Anda : ");
            int choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Persegi");
                    System.out.print("Masukkan sisi : ");
                    int s = inp.nextInt();
                    BangunDatar persegi = new BangunDatar(s);
                    System.out.println("Keliling persegi : " + persegi.keliling(s));
                    System.out.println("Luas persegi : " + persegi.luas(s));
                    break;

                case 2:
                    System.out.println("Persegi Panjang");
                    System.out.print("Masukkan Panjang : ");
                    int p = inp.nextInt();
                    System.out.print("Masukkan Lebar : ");
                    int l = inp.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(p, l);
                    System.out.println("Keliling persegi panjang : " + persegiPanjang.keliling(p, l));
                    System.out.println("Luas persegi panjang : " + persegiPanjang.luas(p, l));
                    break;

                case 3:
                    System.out.println("Lingkaran");
                    System.out.print("Masukkan diameter (desimal) : ");
                    double d = inp.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(d);
                    System.out.println("Keliling lingkaran : " + lingkaran.keliling(d));
                    System.out.println("Luas lingkaran : " + lingkaran.luas(d));
                    break;

                case 4:
                    System.out.println("Kubus");
                    System.out.println("Masukkan rusuk kubus : ");
                    int rusuk = inp.nextInt();
                    BangunRuang kubus = new BangunRuang(rusuk);
                    System.out.println("Volume Kubus : " + kubus.volume(rusuk));
                    break;

                case 5:
                    System.out.println("Balok");
                    System.out.println("Masukkan panjang balok : ");
                    int pv = inp.nextInt();
                    System.out.println("Masukkan lebar balok : ");
                    int lv = inp.nextInt();
                    System.out.println("Masukkan tinggi balok : ");
                    int t = inp.nextInt();
                    BangunRuang balok = new BangunRuang(pv, lv, t);
                    System.out.println("Volume Balok : " + balok.volume(pv, lv, t) );
                    break;

                case 6:
                    System.out.println("Tabung");
                    System.out.println("Masukkan rusuk alas tabung (desimal)");
                    double rt = inp.nextDouble();
                    System.out.println("Masukkan tinggi tabung");
                    int tg = inp.nextInt();
                    BangunRuang tabung = new BangunRuang(rt, tg);
                    System.out.println("Volume Tabung : " + tabung.volume(rt, tg));
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    loop = false;
                    break;

                default:
                    System.out.println("Pilihan kamu tidak ada, ulang? (ya/tidak)");
                    inp.nextLine();
                    String ulang = inp.nextLine();
                    if(ulang == "ya" || ulang == "Ya") {
                        continue;
                    } else if (ulang.equalsIgnoreCase("tidak")) {
                        loop = false;
                        break;
                    }
            }
        }
    }
}
