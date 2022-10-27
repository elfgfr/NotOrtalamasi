import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımla
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scaanner sınıfını tanımladık
        // Scaanner sınıfını kullanabilmemiz için bir nesne üretmemiz lazım
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam /6;
        System.out.println("Ortalamanız : " + sonuc);


        boolean durum = sonuc >= 60;
        System.out.println(durum ? "Sınıfı Geçti." : "Sınıfta Kaldı.");

    }
}
