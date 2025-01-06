package dosyaISlemleri;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class DosyaIslemleri01 {
    public static void main(String[] args) {
        // File I/O işlemleri
        // Örnek: Dosya Okuma, Yazma, Silme, Bilgi ��ekme...
        // Bu işlemler java.io paketinde yer almaktadır.

        // Dosya Yazma---- bu islem icin FileWriter classindan yardim almamiz gerekir!
        try (FileWriter yazici = new FileWriter("deneme.txt")) {
            ;// sol alt satirda yeni bir dosya klasoru acti.
            yazici.write("Merhaba\n");
            yazici.write("Javaya dair dosya islemleri.\n");
            yazici.write("Deneme giris satiri");
        } catch (IOException e) {
            System.out.println("Dosya yazim hatasi: " + e.getMessage());
        }


        // Dosya Okuma
        /*
        FileReader: Dosya ICERIGINI okuma islemi icin kullanilir.
        BufferedReader: GENEL DOSYA OKUMA ISLEMI ICIN KULLANILIR.
        FileReader'dan gelen satirlarin okunmasini saglayan bir classdir.
         */

        try (BufferedReader okuyucu = new BufferedReader(new FileReader("deneme.txt"))) {
            String satir;
            while ((satir = okuyucu.readLine()) != null) { //WHILE DONGUSU BURADA HER SATIRI SIRASIYLA OKUR VE YAZDIRIR.
                System.out.println(satir);
            }
        } catch (IOException e) {
            System.out.println("Dosya okunamadı: " + e.getMessage());
        }

        // Files Class'i ile Dosya islemleri
        // Örnek: Dosya var mi yok mu, boyutu, silme...
        // Bu işlemler java.nio.file paketinde yer almaktadır.

        try {
            Path dosyaYolu = Paths.get("yeni.txt");

            List<String> satirlar = Arrays.asList("Satir 1", "Satir 2", "Satir 3");
            Files.write(dosyaYolu, satirlar);


            List<String> okunanSatirlar = Files.readAllLines(dosyaYolu); // Bu satirda tum dosya icerigini bir list seklinde donduruyoruz.
            okunanSatirlar.forEach(System.out::println);

            // Asagi satirda dosya copyalama islemi yaptik, egerki yedek text varsa uzerine yazacak.
            Files.copy(dosyaYolu, Paths.get("yedek text"), StandardCopyOption.REPLACE_EXISTING);
            Files.delete(dosyaYolu);

        } catch (IOException e) {
            System.out.println("Dosya islemleri hatasi: " + e.getMessage());
        }
    }
}