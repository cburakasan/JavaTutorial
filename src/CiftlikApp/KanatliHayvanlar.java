package CiftlikApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class  KanatliHayvanlar extends Hayvanlar{

    @Override
    public void beslenme() {
        System.out.println("Kanatli hayvanlar hem etcil hem de otcul beslenebilirler");
    }
    public static void yumurtlar(){
        System.out.println("Bütün kanatli hayvanlar yumurtlar");

    }
    public static void ucar(){
        System.out.println("Bütün kanatli hayvanlar ucar");

    }
}
