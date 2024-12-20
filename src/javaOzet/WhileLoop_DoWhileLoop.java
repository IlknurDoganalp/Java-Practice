package javaOzet;

public class WhileLoop_DoWhileLoop {
    public static void main(String[] args) {
        /* While dongusu
        int i = 0;
        while (i <= 5) {
            System.out.println("Sayi: " + i);
            i++;
        }

        // Do-While dongusu
        i = 0;
        do {
            System.out.println("Sayi: " + i);
            i++;
        } while (i <= 5);

         */


        int sayac=0;
       while (sayac<=5){
           System.out.println("Sayac: "+sayac);
           sayac++;
       }
/*
       int i=0;
       while(true){
           System.out.println("i "+i);
           i++;
           if(i==5){ // if kosulumuz 5 olana kadar calisir.
               break; // break sartimiz saglaninca calismayi durdurur.
                      // Break koymazsak dongu sonsuza kadar calisir.
           }
       }

 */
        /*
    // tek sayilarin yazimi isternirse kiullanilacak kod blogu
       int i=0;
       while(i<10){
           i++;

           if(i%2==0){
               continue; // continue sartimiz saglaninca dongunun bu iterasyonuna devam eder.
                        // Continue koymazsak dongu ikinci iterasyonu devam eder.

           }
           System.out.println("tek sayilar "+i);
       }

         */

        // cift sayilarin yazimi isternirse kiullanilacak kod blogu
        int i=0;
        while(i<10){
            i++;

            if(i%2==1){
                continue; // continue sartimiz saglaninca dongunun bu iterasyonuna devam eder.
                // Continue koymazsak dongu ikinci iterasyonu devam eder.

            }
            System.out.println("cift sayilar:  "+i);
        }
    }
}
