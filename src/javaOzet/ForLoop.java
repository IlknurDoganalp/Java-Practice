package javaOzet;

public class ForLoop {

    public static void main(String[] args) {

        for ( int i =0; i<=5;i++) {
         //   System.out.println("Sayi: "+i);
        }

        int[] sayilar={1,2,3,4,5};
        for (int i=0; i< sayilar.length;){
         //   System.out.println("Dizi Elemani: "+sayilar[i]);
            i++;
        }

        for (int sayi: sayilar){
          //  System.out.println("for each: "+sayi);
        }

        // ic ice for dongusu. iki ayri for dongusu olusturulur.

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println(i +"x" + j + "="+ (i*j));

            }
        }

    }
}
