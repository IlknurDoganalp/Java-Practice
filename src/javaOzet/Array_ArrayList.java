package javaOzet;

import java.util.ArrayList;

public class Array_ArrayList {
    public static void main(String[] args) {

        // javaOzet.Array (Sabit Boyutlu Dizi)
        //Eleman sayisi degistirilmez.
        int[] sayilar = {1, 2, 3, 4, 5};

        // ArrayList (Yeniden Boyutlanabilir Dizi)
        //javaOzet.Array List dinamik boyuttadir. add.() methodu listeye degisken eklemek icin kullanilir.
        ArrayList<Integer> sayilarListesi = new ArrayList<>();
        sayilarListesi.add(1);
        sayilarListesi.add(2);
        sayilarListesi.add(3);
        sayilarListesi.add(4);
        sayilarListesi.add(5);
        System.out.println("ArrayList: " + sayilarListesi);
        sayilarListesi.add(3,15);
        System.out.println("Yeni javaOzet.Array List: "+ sayilarListesi);

        // ArrayList'dan eleman cekmek
        int ilkEleman = sayilarListesi.get(0);
        System.out.println("Ilk Eleman: " + ilkEleman);

        // ArrayList'dan eleman silmek
        sayilarListesi.remove(0);
        System.out.println("Silinen Eleman: " + ilkEleman);

        /*
        Not: 1.	Array ile ArrayList arasındaki farklar;
        	Array sabit boyutludur, ArrayList dinamik boyutludur ve Java Collections framework'ün bir parçasıdır.
             2.	HashMap nedir? Nasıl çalışır?
     	Anahtar-değer (key-value) çiftleriyle çalışan bir koleksiyon sınıfıdır; hashing kullanarak verileri depolar.

         */

    }
}
