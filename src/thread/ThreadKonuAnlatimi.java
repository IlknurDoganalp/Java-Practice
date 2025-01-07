package thread;

public class ThreadKonuAnlatimi {
    public static void main(String[] args) {

        class SayacThread extends Thread {
            private final String isim;
            private final int baslangic;
            private final int bitis;

            public SayacThread(String isim, int baslangic, int bitis) {
                this.isim = isim;
                this.baslangic = baslangic;
                this.bitis = bitis;
            }

            @Override
            public void run() {
                try {

                    for (int i = baslangic; i <= bitis; i++) {
                        System.out.println(isim + " sayiyor: " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(isim + " thread kesildi!");
                    Thread.currentThread().interrupt();
                }
            }
        }

             class SayacRunnable implements Runnable{
         private final String isim;
         private final int baslangic;
         private final int bitis;
         public SayacRunnable(String isim, int baslangic, int bitis) {
             this.isim = isim;
             this.baslangic = baslangic;
             this.bitis = bitis;
         }

         @Override
         public void run() {
             try {

                 for (int i = baslangic; i <= bitis; i++) {
                     System.out.println(isim + " sayiyor: " + i);
                     Thread.sleep(1000);
                 }
             } catch (InterruptedException e) {
                 System.out.println(isim + " thread kesildi!");
                 Thread.currentThread().interrupt();
             }
         }

        }
        SayacThread thread1 = new SayacThread("Thread 1", 1, 5);
        SayacThread thread2 = new SayacThread("Thread 2", 6, 10);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("====Threadler baslatiliyor====");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println("Ana Thread kesildi!");
            Thread.currentThread().interrupt();
        }
        System.out.println("====Threadler bitti====");
        }

        /*
        NOT:
        - Threadlerin farklı işlevler yerine kullanabileceği, kendi işlerini bitirmesi, ve threadler arasında yada main threadler arasında senkronizasyon sağlayabileceği durumlar için Java'nın Thread'i kullanabilirsiniz.
        - Threadler, main threadin bir blok çalışmasını beklemek için join() metodunu kullanabilirsiniz.
        - Threadlerin priority'lerini set ederek işlerin ne zaman çalışacağına karar verilebilir.
        - Threadler, main threadin bir blok çalışmasını beklemek için sleep() metodunu kullanabilirsiniz.
        - Threadler, main threadin bir blok çalışmasını beklemek için wait() metodunu ve notify() metodunu kullanabilirsiniz.

        Yukaridaki classta Thread'in iki farkli seklini kullandik. Biri dogrudan Thread classindan aldigimiz,
        digeri ise Runnable classindan aldigimiz.
        - Runnable interface'ni implement ederek Thread'in ozgun metodlarini kullanabilirsiniz.
        - Runnable interface'ni implement ederek Thread'in ozgun metodlarini kullanarak Thread'i baslatmak icin new Thread(new RunnableClass()).start() seklinde bir yontem kullanabilirsiniz.
        - Runnable interface'ni implement ederek Thread'in ozgun metodlarini kullanarak Thread'i baslatmak icin new Thread(new RunnableClass()).start() seklinde bir yontem kullanabilir
       
         */


    }