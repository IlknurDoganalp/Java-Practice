package oop.Encapsulation;

public class KamyonTest {
    public static void main(String[] args) {
        Kamyon kamyon1 = new Kamyon("Ford", "Mustang", 25);
        kamyon1.kamyonBilgileriniGoster();

        System.out.println("Mevcut Kapasite "+kamyon1.getKapasite()+" ton");

        kamyon1.setKapasite(35); // kapasiteyi guncelledik.
        System.out.println("Yeni Kapasite "+kamyon1.getKapasite()+" ton");

        System.out.println("==========================");

        kamyon1.setKapasite(-10);
        kamyon1.kamyonBilgileriniGoster();
    }
}
