package oop;

public class Araba {
    String marka;
    String model;
    int yil;

    public void bilgileriGoster(){
        System.out.println("Araba Marka: " + marka);
        System.out.println("Araba Model: " + model);
        System.out.println("Araba Yil: " + yil);
    }

    public void MarkaliArabaCalisti(){
        System.out.println(marka +"Markali araba calisiyor...");
    }
}
