package streamAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class StreamAndLAmbdaOrnekleri {
    public class Urun{
        //Aslinda burada bir kapsulleme islemi yapiyoruz.
        private String isim;
        private double fiyat;
        private String kategori;
        public Urun(String isim, double fiyat, String kategori) {
            this.isim = isim;
            this.fiyat = fiyat;
            this.kategori = kategori;
        }

        public String getIsim() {
            return isim;
        }

        public double getFiyat() {
            return fiyat;
        }

        public String getKategori() {
            return kategori;
        }




        }
    }

