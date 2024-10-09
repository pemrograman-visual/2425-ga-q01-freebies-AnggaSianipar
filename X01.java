// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12S24032 - Angga Sianipar

import java.util.*;
import java.lang.Math;

public class X01{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, total, i, hasilakhir;

        total = 0;
        hargabuku = Double.parseDouble(input.nextLine());
        i = hargabuku;
        while (hargabuku != 0) {
            if (i < hargabuku) {
                i = i;
            } else {
                i = hargabuku;
            }
            total = total + hargabuku;
            hargabuku = Double.parseDouble(input.nextLine());
        }
        if (total >= 100) {
            hasilakhir = total - i;
        } else {
            hasilakhir = hasilakhir;
        }
        System.out.println(toFixed(hasilakhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

