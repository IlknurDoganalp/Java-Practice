package exception;

public class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // NullPointerException oluyor, null degeri ile islem yapamıyoruz.
        }catch (java.lang.NullPointerException e){
            System.out.println("NullPointerException: Null olan bir nesneye erisilemez" + e.getMessage());

        }
    }
}
