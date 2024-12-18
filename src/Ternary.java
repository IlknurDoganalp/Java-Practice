public class Ternary {

    public static void main(String[] args) {

        int yas = 17;
        String sonuc = (yas >= 18) ? "Yetiskin" : "Cocuk";
      //  System.out.println("Durum: " + sonuc);


        if (yas >= 18) {
           sonuc="Yetiskin";
        } else {
            sonuc="Cocuk";
        }
        System.out.println("Sonuc : "+sonuc);

    }
}
