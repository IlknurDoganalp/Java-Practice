package javaOzet;

public class IFElse {
    public static void main(String[] args) {

        // if-else if-else kontrol yapısı
        int sayi = 10;
        if (sayi == 5) {
            System.out.println("Sayi 5'e esittir.");
        } else if (sayi > 5) {
            System.out.println("Sayi 5'den buyuktur.");
        } else {
            System.out.println("Sayi 5'den kucuktur.");
        }

        // Soru: Ogrencinin aldigi not 60'dan buyukse basarili, 60'dan kucukse basarisiz olacak sekilde konsolda yazdiriniz.

        int not=90;
        if (not>=60){
            System.out.println("Basarili. Aldiginiz Not: "+ not);
        }else {
            System.out.println("Basarisiz. Aldiginiz Not: "+ not);
        }

        if (not>=90){
            System.out.println("AA ");
        } else if (not>=80) {
            System.out.println("BB ");
        } else if (not>=60) {
            System.out.println("CC ");
        }else {
            System.out.println("FF ");
        }


        // switch-case kontrol yapısı
        //int gun = 5;





    }
}
