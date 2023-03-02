package ciklusok;

import java.util.Random;
import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin2");
        System.out.print("Hogyan jelenjelnek meg a számok (ismétlés/nemismétlés): ");
        String valasz = sc.nextLine();
        if (valasz == "ismétlés") {
            for (int a = 2; a <= 4; a++) {
                for (int i = 2; i <= 4; i++) {
                    for (int x = 2; x <= 4; x++) {
                        System.out.print(a + "" + i + "" + x + "\n");
                    }
                }
            }
        } else {
            for (int a = 2; a <= 4; a++) {
                for (int i = 2; i <= 4; i++) {
                    for (int x = 2; x <= 4; x++) {
                        System.out.print(a + "" + i + "" + x + "\n");
                    }
                }
            }
        }

    }
}
