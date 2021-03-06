package com.efb;

import java.util.ArrayList;
import java.util.List;

public class Fibonachi {

    public void exec(long num) {
        List<Long> list = new ArrayList<>();
        if (num < 0) {
            System.out.println("number > 0");
            return;
        }
        if (num < 2) {
            System.out.println(num);
            return;
        }
        list.add(1L);
        list.add(1L);
        for (int i = 1; i <= num; i++) {
            list.add(list.get(i - 1) + list.get(i));
        }
        System.out.println(list);
    }

    public void pF(long num){
        for (int i = 0; i <num ; i++) {
            System.out.println(execBackFun(num));;
        }
    }
    public long execBackFun(long num) {
        if (num < 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return execBackFun(num - 1) + execBackFun(num - 2);
    }
}
