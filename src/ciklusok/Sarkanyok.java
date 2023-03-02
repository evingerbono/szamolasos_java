package ciklusok;

public class Sarkanyok {

    public static void main(String[] args) {

        int x = 0, y = 0;
        int eredmeny = 145;
        boolean igaz = true;
        while (!igaz) {
            x++;
            y++;
            if ((7 * x )+ (11 * y )== eredmeny) {
                igaz = false;
            }
        }
        System.out.printf("7x%d + 11y%d = %d\n", x, y, eredmeny);
    }
}
