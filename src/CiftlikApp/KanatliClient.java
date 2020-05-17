package CiftlikApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class KanatliClient {
    static KanatliIslem kanatliIslem;
    public static void main(String[] args) {
         kanatliIslem= new KanatliIslem();
         kanatliIslem.kumestekiYumurtaSayisiniHesapla();
         kanatliIslem.asi();
    }

}
