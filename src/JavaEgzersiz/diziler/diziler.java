package JavaEgzersiz.diziler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class diziler {
    static Random random = new Random();

    public static void main(String[] args) {

//        dizi1 ();
//        dizi2();
//        dizi3();
        dizi4();

    }

    public static void dizi1() {
        Integer[] intDizi = new Integer[5];
        intDizi[0]=random.nextInt(20);
        intDizi[1]=random.nextInt(20);
        intDizi[2]=random.nextInt(20);
        intDizi[3]=random.nextInt(20);
        intDizi[4]=random.nextInt(20);
        for (Integer integer : intDizi) {
            System.out.println(integer);
        }
    }

    private static void dizi2() {
    Integer[] dizicik = new Integer[15];
        for (int i = 0; i < dizicik.length ; i++) {
            dizicik[i]= random.nextInt (15);
            System.out.println (dizicik[i]);
        }
        int toplamcik = dizicik[4] + dizicik[8];
        System.out.println ("toplamcik="+toplamcik);
    }

    private static void dizi3() {
        String[] stringDizi ={"java","egitim","dizi"};
        String newMetin= "" ;
        String[] yeniDizi= new String[stringDizi.length];
        Integer sayac=0;
        for (String s : stringDizi) {
            char[] chars = s.toCharArray ();
            int length = chars.length-1;
            for (int i = length; i >=0 ; i--) {
                char aChar = chars[i];
                newMetin+=aChar;
            }
            yeniDizi[sayac]=newMetin;
            sayac++;
            newMetin="";
         }
        for (String yeniMetin : yeniDizi) {
            System.out.println ("yeni metin ="+yeniMetin);
        }
    }

    private static void dizi4() {
        Ogrenci[] ogrenciDizisi = new Ogrenci[random.nextInt (100)];
        List<Ogrenci> sinifiGecenler = new ArrayList<> ();
        for (int i = 0; i < ogrenciDizisi.length; i++) {

            Ogrenci ogrenci = new Ogrenci ();
            int vizeNotu = random.nextInt (100);
            int finalNotu = random.nextInt (100);
            ogrenci.setVizeNotu (vizeNotu);
            ogrenci.setFinalNotu (finalNotu);
            double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
            ogrenci.setOrtalama (ortalama);
            ogrenciDizisi[i] = ogrenci;
        }
        for (Ogrenci ogrenci : ogrenciDizisi) {
            if (ogrenci.getOrtalama ()<50){
                continue;

            }
            sinifiGecenler.add (ogrenci);
            System.out.println (sinifiGecenler.size ());

        }

    }
}


