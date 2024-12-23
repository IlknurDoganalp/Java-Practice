package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

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

    public static void main(String[] args) {
        listORnekleri(); // yukarida olusturdugumuz method static oldugu icin direkt ismi ile cagirabiliyoruz.
    }
    //

}
