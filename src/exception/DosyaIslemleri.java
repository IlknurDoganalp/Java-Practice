package exception;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class DosyaIslemleri {
    public static void main(String[] args) {
        // File I/O işlemleri
        // Örnek: Dosya Okuma, Yazma, Silme, Bilgi ��ekme...
        // Bu işlemler java.io paketinde yer almaktadır.

        // Dosya Yazma
        try (FileWriter yazici = new FileWriter("deneme.txt")) {
            ;// sol alt satirda yeni bir dosya klasoru acti.
            yazici.write("Bu bir yeni dosya.");

            yazici.write("Javaya dair ders notlari bu alana yazilabilir.");
        } catch (IOException e) {
            System.out.println("Dosya yazılamadı: " + e.getMessage());
        }

        // Dosya Okuma
        try (BufferedReader okuyucu = new BufferedReader(new java.io.FileReader("deneme.txt"))) {
            String satir;
            while ((satir = okuyucu.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            System.out.println("Dosya okunamadı: " + e.getMessage());
        }
    }

        // Files Class'i ile Dosya islemleri
        // Örnek: Dosya var mi yok mu, boyutu, silme...
        // Bu işlemler java.nio.file paketinde yer almaktadır.
        try {
            Path dosyaYolu= Paths.get("yeni.txt");

        List<String> satirlar= Arrays.asList("Satir 1, Satir 2");
            Files.write(dosyaYolu,satirlar);

            List<String> okunanSatirlar=Files.readAllLines(dosyaYolu);
            okunanSatirlar.forEach(System.out::println);
            Files.copy(dosyaYolu,Paths.get("yedek text"), StandardCopyOption.REPLACE_EXISTING);
            Files.delete(dosyaYolu);


        }catch

    }
    }

