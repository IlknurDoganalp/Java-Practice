package oop.Inheritance;


// ust sinif (Base Class)
public class Arac {
    private String marka;
    private String model;
    private int yil;

    // Constructor (Yapici Method)

    public Arac(String marka, String model, int yil){
        this.marka = marka;
        this.model = model;
        this.yil = yil;
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

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

 public void aracinKisaBilgileri(){
         System.out.println("Marka: " + marka);
         System.out.println("Model: " + model);
         System.out.println("Yil: " + yil);

}

}
