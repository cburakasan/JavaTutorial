package JavaEgzersiz.IfElse;

public class IfElse {
    public static void main(String[] args) {
//        alistirma();
//        alistirma2();
        alistirma3();
    }

    public static void alistirma() {
        Integer x = 7;
        Integer y = 7;
        if (x > y) {
            System.out.println("Nesos Buraki seviyor");
        } else {
            System.out.println("burak nesosu seviyor");
        }


    }

    public static void alistirma2() {
        Integer time = 16;
        if (time > 18) {
            System.out.println("hayirli aksamlar");
        } else {
            System.out.println("hayirli gunler");
        }
    }

    public static void alistirma3() {
        Integer time = 15;
        if (time < 10) {
            System.out.println("hayirli sabahlar");
        } else if (time > 10 && time < 18) {
            System.out.println("hayirli gunler");
        }else {
            System.out.println("hayirli aksamlar");
        }
        if(time>5){
            System.out.println("hayirli zamanlar");
        }

    }
}
