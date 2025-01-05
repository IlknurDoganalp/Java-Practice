package exception;

public class ExceptionOrnek2 {
    public static void main(String[] args) {

        try {
            String sayi="123";
            int x=Integer.parseInt(sayi); // parseInt degerimizi Stringden int. cevirir.
            System.out.println("x="+x);
        }
        catch (NumberFormatException e){
            System.out.println("Sayi donusum hatasi: " + e.getMessage());
            e.printStackTrace(); // Hata mesajını ve hatanın oluştuğu stack trace'ı ekrana yazdırır.
        }
        catch (Exception e){
            System.out.println("Genel Hata! ");
        }

    }
}
