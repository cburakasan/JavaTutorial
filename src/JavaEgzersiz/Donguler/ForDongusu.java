package JavaEgzersiz.Donguler;

public class ForDongusu {
    public static void main(String[] args) {
//        donguCalisma1();
//        donguCalisma2();
//        donguCalisma3();
//        donguCalisma4();
//        donguCalisma5();
          donguCalismasi6();  }

    public static void donguCalisma1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("selam");
        }
    }

    public static void donguCalisma2() {
        for (int i = 20; i <= 30; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void donguCalisma3() {
        //100 ile 500 arasindaki sayilardan 200den kucuk olanlari "bu sayi 200den kucuktur" ve sayinin degerini yazalim.
        //200den buyuk olan icinde ayni islem yapilsin.

        for (int i = 100; i < 500; i++) {
            if (i < 200) {
                System.out.println("bu sayi 200den kucuktur=" + " " + i);
            } else if (i > 200 && i < 300) {
                System.out.println("bu sayi 200 ile 300 arasindadir=" + "  " + i);
            } else {
                System.out.println("bu sayi 300den buyuktur=" + " " + i);
            }
        }
    }

    public static void donguCalisma4() {
//        0 ile 100 arasindaki butun sayilari topla.
        Integer i = 0;
        Integer toplam = 0;
        for (i = 0; i < 100; i++) {
            toplam = toplam + i;
            System.out.println(toplam);
        }

    }
    public static void donguCalisma5(){
//        50 ile 100 arasinda 2 ile bolunebilen sayilari topla!
        Integer toplam =0;
        for (int i=50; i<100; i++){
            if (i%2==0){
                toplam=toplam+i;
            }
        }
        System.out.println("bu sayilarin toplami="+ " "+ toplam);
    }
    public static void donguCalismasi6(){
//        100 den 0 a kadar olan sayilari ekrana yazdir.
        for (int i=100; i>=0; i--){
            System.out.println(i);
        }
    }

}
