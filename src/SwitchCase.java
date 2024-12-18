public class SwitchCase {
    public static void main(String[] args) {

        // switchCase Kontrol Yapilari
        int gun = 2;
        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun numarasi girildi");
        }
    }
}


    /* Java 14 ile birlikte breakler cikti.
    String gunAdi = switch (gun) {
        case 1 -> "Pazartesi";
        case 2 -> "Sali";
        case 3 -> "Carsamba";
        case 4 -> "Persembe";
        case 5 -> "Cuma";
        case 6 -> "Cumartesi";
        case 7 -> "Pazar";
        default -> "Gecersiz gun numarasi girildi";
    }

     */


