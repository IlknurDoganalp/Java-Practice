package exception;

public class IstisnaiExceptionOrnekleri {
    public static void main(String[] args) {
       /*
        try {
            int sayi = 5 / 0; // Hata veren bir işlem
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            int[] dizi = new int[5];
            dizi[6] = 10; // Dizi elemanına erişmek istediğimizde çıkan hata
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            throw new RuntimeException("Hatalı bir hata mesajı"); // Hatalı bir hata fırlatmak için
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }

        */

        try {
            int[] sayilar = {1, 2, 3, 4};
            System.out.println(sayilar[2]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi sinirlari disina cikildi");

        } catch (Exception e){
            System.out.println("Bir hata olustu: " + e.getMessage());
        }
        finally {
            System.out.println("Finally bloğu çalıştı"); // Her zaman çalışacak bloğu tanımlayabiliriz.
        }
        }
    }

