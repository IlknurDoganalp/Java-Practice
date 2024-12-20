package javaOzet;

public class Operatörler {
    public static void main(String[] args) {


        int sayi1=10;
        int sayi2=5;

        /*
        int toplam = sayi1 + sayi2;
        System.out.println("sayilarin toplami : "+ toplam);
        int cikarma = sayi1 - sayi2;
        System.out.println("Sayilarin farki : "+ cikarma);
        int carpma = sayi1 * sayi2;
        System.out.println("Sayilarin carpimi : "+ carpma);
        int bolme = sayi1 / sayi2;
        System.out.println("Sayilarin bolumu : "+ bolme);


        Not: Mod Operatoru: iki sayinin bolumunden kalanini alip konsola yazdirir.

        int mod = sayi1 % sayi2;
        System.out.println("Sayilarin modu : "+ mod);


        Not: Unary Operatorler: Bir tamsayinin bir isaret karakteri veya bir isaretli kosul icin kullanilan bir operator.


        int negatifSayi = -sayi1;
        System.out.println("Negatif sayi : "+ negatifSayi);

        boolean trueOrFalse = sayi1 > sayi2;
        System.out.println("sayi1 > sayi2 : "+ trueOrFalse);
        trueOrFalse = sayi1 < sayi2;
        System.out.println("sayi1 < sayi2 : "+ trueOrFalse);
        trueOrFalse = sayi1 == sayi2;


        int sayi=10;
        sayi++; // ++ sayiyi 1 arttirir.
        System.out.println("sayi : "+sayi);
        sayi--; // -- sayiyi 1 eksiltir.
        System.out.println("sayi : "+sayi);


       */

        // ---------- MANTIK OPERATORLERI
        // && ve (AND) operatörü: iki operandin true olması gerekiyor. VE
        boolean trueOrFalse1 = (sayi1 > 5) && (sayi2 < 10);
        System.out.println("sayi1 > 5 && sayi2 < 10 : "+ trueOrFalse1);

        // || veya (OR) operatörü: iki operandin true olması ya da biri true olması gerekiyor. VEYA
        boolean trueOrFalse2 = (sayi1 > 5) || (sayi2 < 10);
        System.out.println("sayi1 > 5 || sayi2 < 10 : "+ trueOrFalse2);

        //! veya NOT operatörü: bir operandin true olup olmadığını kontrol eder.


        //--------- KARSILASTIRMA OPERATORLERI
        // blooen bir variable tanimlayarak da esitlik kontrolu saglanabilir.
        int sayi3 = 10;
        int sayi4 = 5;

        System.out.println("sayi3 == sayi4 esit mi? "+ (sayi3 == sayi4)); // eşitlik kontrolü
        System.out.println("sayi3!= sayi4"+( sayi3!= sayi4)); // eşitlik değil kontrolü
        System.out.println("sayi3 > sayi4"+ (sayi3 > sayi4));  // büyüktür kontrolü
        System.out.println("sayi3 < sayi4 "+ (sayi3 < sayi4));// küçüktür kontrolü



    }

}
