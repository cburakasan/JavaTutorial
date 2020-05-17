package JavaEgzersiz.BreakContinue;

public class BreakContinue {
    public static void main(String[] args) {
       egzersiz1();
//       egzersiz2();
//        egzersiz3();

    }

    public static void egzersiz1() {
//        78112 den 99990 ye kadar olan sayilarin ilk 3 e tam bolunen sayiyi bul.
        for (int i = 78112; i < 99990; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                break;

            }
        }
    }

    public static void egzersiz2() {
//        78112 ile 99990 arasinda kac tane 3 e bolunebilen sayi vardir?
        Integer adet = 0;
        for (int i = 78112; i < 99990; i++) {
            if ((i % 3 == 0)) {
                adet = adet + 1;
            }
        }
        System.out.println(adet + " " +"adet sayi 3 ile tam bolunebilir.");

    }
    public static void egzersiz3(){
//        veritabanından alinan 15 deger icerisinde 5. deger disindakileri gosteren kod.

        Integer veriTabanindanAlinanDeger = 15;

        for (int i =0;i<=veriTabanindanAlinanDeger;i++){
            if (i==5){
                continue;
            }
            System.out.print( " "+i+ " ");
        }


    }
}