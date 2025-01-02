package oop.Encapsulation;

public class Kamyon {

    private String marka;
    private String model;
    private int kapasite;

    public Kamyon(String marka, String model, int kapasite) {
        this.marka = marka;
        this.model = model;
        this.kapasite = kapasite;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
        if (kapasite < 0) {
            this.kapasite = 0; // hata girisini engellemek icin default deger atandi.
            System.out.println("Kapasite negatif olamaz!");
        }else {
            this.kapasite=kapasite;
        }
    }

    public void kamyonBilgileriniGoster() {
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Kapasite: "+kapasite);
    }
}
