package oop;

public class ArabaTest {

    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.marka = "Volvo";
        araba1.model = "XC90";
        araba1.yil = 2020;

        Araba araba2 = new Araba();
        araba2.marka = "Ford";
        araba2.model = "Mustang";
        araba2.yil = 2015;

        araba1.bilgileriGoster();
        araba2.bilgileriGoster();
        araba1.MarkaliArabaCalisti();
    }
}
