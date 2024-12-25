package collections;

import java.util.*;

public class Collections_DetayliOrnek {

    public static void listORnekleri(){
        // static method olustiurma sebebimiz; sinif adi ile cagirabiliyor olmamiz.
        // methodun amaci list ara yuzunun farkli uygulamalarini gostermek.
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        System.out.println("Array List'in ilk hali: "+arrayList);

        arrayList.addAll(Arrays.asList("C++","Ruby","Go"));
        System.out.println("Array List'in son hali: "+arrayList);

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1); //ilk siraya ekler.
        linkedList.addLast(5); // sona ekler.
        linkedList.add(1,3); // belirtilen indexe ekler.
        linkedList.offer(100); // bu methodda sona ekler.

        Integer ilkEleman=linkedList.poll(); // konsolda ilk elemani yazdirir.
        System.out.println("Ilk eleman: "+ilkEleman);
        System.out.println("Linked List'in ilk hali: "+linkedList);

      //  linkedList.removeLast(); // son elemani siler.
      //  System.out.println("Linked List'in son hali: "+linkedList);
       // System.out.println("Linked List'in eleman sayisi: "+linkedList.size());
     //   linkedList.clear(); // tum elemanlari siler.

        Vector<Double> vector=new Vector<>();
        vector.add(1.555555);
        vector.add(2.7222);
        vector.add(3.222);
        vector.setSize(10);// boyutunu belirledik.
        System.out.println("Vector'in ilk hali: "+vector);

    }
     public static void setOrnekleri() {

         HashSet<String> hashSet = new HashSet<>();
         hashSet.add("Elma");
         hashSet.add("Armut");
         hashSet.add("Portakal");
         hashSet.add("Kivi");
         hashSet.add("Elma");
         System.out.println("HashSet'in ilk hali: " + hashSet);
         // has sette yazdirma islemi olusturdugumuz siraya uygun olmayabilir.LinkedHashsette olusturdugumuz
         // sirayla yazdirilacak.

         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
         linkedHashSet.add(1);
         linkedHashSet.add(6);
         linkedHashSet.add(3);
         linkedHashSet.add(8);
         linkedHashSet.add(8);
         System.out.println("LinkedHashSet'in ilk hali: " + linkedHashSet);
         // Tekrar eden degiskenler 1 kez yazilir.

         TreeSet<String> treeSet=new TreeSet<>();
         treeSet.add("Elma");
         treeSet.add("Armut");
         treeSet.add("Portakal");
         treeSet.add("Kivi");
         treeSet.add("Elma");
         System.out.println("TreeSet'in ilk hali: " + treeSet);
         // Tree set; dogal bir siralama yapar. Siralama ya alfabetik siraya gore ya da buyukten kucuge gore gerceklesir.

     }

     public static void HashMapOrnekleri() {
         HashMap<String, String> hashMap = new HashMap<>();
         hashMap.put("Elma", "300");
         hashMap.put("Armut", "250");
         hashMap.put("Portakal", "400");
         hashMap.put("Kivi", "200");
         hashMap.put("Elma", "250");
         System.out.println("HashMap'in ilk hali: " + hashMap);

         LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
         linkedHashMap.put("Elma", 300);
         linkedHashMap.put("Armut", 250);
         linkedHashMap.put("Portakal", 400);
         linkedHashMap.put("Kivi", 200);
         linkedHashMap.put("Elma", 250);
     }




    public static void main(String[] args) {
        listORnekleri(); // yukarida olusturdugumuz method static oldugu icin direkt ismi ile cagirip yazdiriyoruz.
           // Egerki buradan cagirmazsak konsolda yazdirma islemi gerceklesmez.
        setOrnekleri();



    }
    //

}
