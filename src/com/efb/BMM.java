package com.efb;

public class BMM {
    /*   n=30   , m=20       30/20 = 10    , 20/10 =2     ,  10/2 =0   =>   b.m.m = 10
     *
     *    1    2
     * --------------------------
     *   30   20   10   0               => b.m.m = 10
     * --------------------------
     *   20   10   0
     *
     * */
    public long bmm(long n, long m) {
        long r;
        do {
            r = n % m;
            System.out.println(n + "    " + m + "   " + r);
            n = m;
            m = r;

        } while (r != 0);
        return n;
    }

    public long bmmBazgashti(long n, long m) {
        if (n % m != 0)
            return bmmBazgashti(m, n % m);
        return m;
    }
}
