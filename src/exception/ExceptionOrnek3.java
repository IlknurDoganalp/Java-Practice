package exception;

public class ExceptionOrnek3 {
    public static void main(String[] args) {
        try {
            yasKontrol(15);
        } catch (YasHatasi e) {
            System.out.println("Geçersiz yas girdiniz: " + e.getMessage());
        }
    }

    public static void yasKontrol(int yas) throws YasHatasi {
    if (yas < 0) {
        throw new YasHatasi("Yas sıfırdan küçük olamaz!");
    } else {
        System.out.println("Yas dogru: " + yas);
    }
        }
static class YasHatasi extends Exception{
    public YasHatasi(String message) {
        super(message);
    }
}

    }

