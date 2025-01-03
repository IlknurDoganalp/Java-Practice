package oop.Polymorphisim;

public class HayvanSesleri {
    public class Hayvan {
        public void sesCikar() {
            System.out.println("Hayvan ses cikar");
        }
    }

    public class Kedi extends Hayvan {
        @Override
        public void sesCikar() {
            System.out.println("Kedi: Miyav Miyav!");
        }
    }

        public class Kopek extends Hayvan{
            @Override
            public void sesCikar() {
                System.out.println("Kopek: Hav Hav!");
            }
        }

    public static void main(String[] args) {
        HayvanSesleri hs=new HayvanSesleri(); //HayvanSesleri adli bir nesne olisturduk.
        Hayvan[] hayvanlar=new Hayvan[2]; // hayvan turunde biri dizi tanimladik. dizinin boyutunu [2] olarak belirledik.
        hayvanlar[0]=hs.new Kedi();
        hayvanlar[1]=hs.new Kopek();
        for (Hayvan hayvan:hayvanlar) { // for dongusunde dizideki tum hayvanlari sira sira cagirip yazdiracak.
            hayvan.sesCikar(); // burada her sinif her hayvan turu kendi ozelligini dondurecek.
        }

        /*
         Output:
         Kedi: Miyav Miyav!
         Kopek: Hav Hav!
         Hayvan ses cikar
         Hayvan ses cikar

         Bu sekilde polymorfisme uygulandigi ve her hayvanin kendi sesini cikarabilmesini sagladik.
         Bu da bize yeni hayvanlar eklenebilir ve ses cikarilacak hayvanlarin tipine gore ses cikarilmasini saglayacaktir.
         Bu sekilde de programin daha okunabilir ve genisletilebilir hale gelecektir.
         */
    }
    }


