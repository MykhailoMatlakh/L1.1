public class Main {
    public static void main(String[] args) {

        //operation with "byte"//
        byte b = 2;
        byte w = 3;
        int res0 = b + w;
        int res1 = (b + w) * (b - w);
        int res2 = w - b;
        int res3 = b * w;
        System.out.println(res0);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        //operation with "double"//
        double d = 3.14;
        double a = 5;
        double res4 = a - d;
        double res5 = a * d;
        double res6 = (a / d) - d;
        double res7 = d * (d+a) / (a-d);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);

        //operation with "float"//
        float p = 11.23f;
        float n = 232.12f;
        float res8 = p - n;
        float res9 = p * n;
        float res10 = (p / n) + (p * n);
        float res11 = (n - p) * 22;
        System.out.println(res8);
        System.out.println(res9);
        System.out.println(res10);
        System.out.println(res11);

        //operation with "int"//
        int k = 15;
        int c = 12;
        int res12 = (k + c);
        int res13 = (k - c);
        int res14 = (k * c) - (c / k);
        int res15 = (k / c) + 23 *(k +c);
        System.out.println(res12);
        System.out.println(res13);
        System.out.println(res14);
        System.out.println(res15);

        //operation with "short"//
        short kk = 2;
        short l = -3;
        short res16 = (short) (kk + l);
        short res17 = (short) (kk - l);
        short res18 = (short) (k * l);
        short res19 = (short) (kk / l);
        System.out.println(res16);
        System.out.println(res17);
        System.out.println(res18);
        System.out.println(res19);

        //operation with "long"//
        long m = 111;
        long g = 32;
        long res20 = (long) (m + g);
        long res21= (long) (m - g);
        long res22 = (long) (m * g);
        long res23 = (long) (m / g);
        System.out.println(res20);
        System.out.println(res21);
        System.out.println(res22);
        System.out.println(res23);

        //operation with "char"//
        char ll = (char) 61.12;
        char tt = (char) 12.11;
        int res24 =  ll + tt;
        int res25 = ll - tt;
        int res26 = ll * tt;
        int res27 = ll / tt;
        System.out.println(res24);
        System.out.println(res25);
        System.out.println(res26);
        System.out.println(res27);

    }
}
