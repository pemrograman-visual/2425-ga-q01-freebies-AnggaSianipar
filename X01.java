// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12S24032 - Angga Sianipar

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double pALINGMURAH, hARGA, sUM;

        sUM = 0;
        pALINGMURAH = 9999;
        hARGA = Double.parseDouble(input.nextLine());
        while (hARGA != 0) {
            if (hARGA == 0) {
            } else {
                if (hARGA < pALINGMURAH) {
                    pALINGMURAH = hARGA;
                } else {
                    hARGA = hARGA;
                }
                sUM = sUM + hARGA;
            }
            hARGA = Double.parseDouble(input.nextLine());
        }
        if (sUM >= 100) {
            sUM = sUM - pALINGMURAH;
        } else {
            sUM = sUM;
        }
        System.out.println(toFixed(sUM,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
