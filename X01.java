// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12S24032 - Angga Sianipar

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, total, i, transaksi;

        total = 0;
        hargabuku = Double.parseDouble(input.nextLine());
        i = hargabuku;
        while (hargabuku != 0) {
            total = total + hargabuku;
            if (i < hargabuku) {
                i = i;
            } else {
                i = hargabuku;
            }
            hargabuku = Double.parseDouble(input.nextLine());
        }
        if (total >= 100) {
            transaksi = total - i;
        } else {
            transaksi = transaksi;
        }
        System.out.println(transaksi);
    }
}
