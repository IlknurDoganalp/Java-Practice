package oop.Inheritance;

//Alt Sinif
public class Motor extends Arac{
    private int vitesSayisi;

    public Motor(String marka, String model, int yil,int vitesSayisi) {
        super(marka, model, yil); //Ust sinifin Constructor'ini cagirir.
        this.vitesSayisi = vitesSayisi; //Motorun vites sayisini burada tanimliyoruz.
    }

    public int getVitesSayisi() {
        return vitesSayisi;
    }

    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }

    public void surusDeneyimi(){
        System.out.println(getMarka()+ " "+getModel()+" "+getVitesSayisi()+" vitesli bir motorlu surus deneyimini gor");  //Motorun surus deneyimi basladi.

    }

    @Override
    public void aracinKisaBilgileri() {
        super.aracinKisaBilgileri(); //ust sinifta olusturdugumuz aracinKisaBilgileri adli methodu
                                     // override sayesinde cagiriyoruz.
        System.out.println("Motorun Vites Sayisi: " + vitesSayisi);  //Motorun vites sayisini cikaracak.
    }
}
