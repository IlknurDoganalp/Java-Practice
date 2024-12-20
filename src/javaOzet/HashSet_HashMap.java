package javaOzet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashSet_HashMap {

    public static void main(String[] args) {
/*     ---------------HASH SET----------------
        HashSet<Integer>sayilar=new HashSet<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(45);
        sayilar.add(45);

        System.out.println("Sayilar= "+ sayilar);
        System.out.println("Olusturulan listede 20 var mi? "+sayilar.contains(20));
        sayilar.remove(45);// Sadece verdigimiz degiskeni siler.
        sayilar.clear(); // Tum elemanlari siler.

 */


        // -------------------HASH MAP--------------

        // Key-Value pair seklinde saklanir.
        // Keyler unique olmalidir.
        // Keyler ve valueslerin data tipi ayni olmalidir.
        // Keyler hashcode ve equals metodu ile hashmap'e kaydedilir.
        // Keyler hashcode'i ayni olacak sekilde olmalidir.
        // Keyler hashcode'i ayni olunca equals metodu ile de ayni olacak sekilde olmalidir.
        // HashMap'in key-value pair'larini siralama sirasina gore siralar.

        // Hash sette degiskenler `add(). methoduyle eklenirken.
        // HashMapte degiskenler `put() methoduyle eklenirken.


        HashMap<String,Integer> isimler=new HashMap<>();
        isimler.put("Ali",10);
        isimler.put("Veli",25);
        isimler.put("Ayse",35);
        isimler.put("Fatma",30);

        System.out.println("Ali'nin yasi; "+isimler.get("Ali"));

        if (isimler.containsKey("Ayse")){
            System.out.println("Ayse listede var");
        }
        if (isimler.containsValue(35)){
            System.out.println("35 yasinda biri var");
        }

        for (String isim: isimler.keySet()){
            System.out.println("isim: "+isim);
        }

        // keySet() methodu hashMap'teki tum dokumu set olarak dondurur.

        for (Map.Entry<String,Integer>entry: isimler.entrySet()){
            System.out.println("isim: "+entry.getKey()+" Yasi: "+entry.getValue());
        }




    }
}
