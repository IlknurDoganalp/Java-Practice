import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String>isimler=new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");
        isimler.add("Fatma");
        System.out.println("Array List: "+isimler);

        isimler.add(2,"Ahmet");
        System.out.println("Yeni Array List: "+isimler);

        isimler.remove(2);
        System.out.println(isimler);

        isimler.set(1,"Selim");
        System.out.println(isimler);

        System.out.println("0. indexteki isim: "+isimler.get(0));
        System.out.println("Isimler listesi uzunlugu: "+isimler.size());
        System.out.println("Isimler listesi bos mu? "+isimler.isEmpty());

        for (String isim: isimler){
            System.out.println("For Loop'ta isimler dongusu: "+isim);
        }



    }
}
