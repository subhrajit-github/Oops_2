package com.Sorting;

import java.util.Comparator;

public class SalComp implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        if (e1.sal > e2.sal) return 1;
        if (e1.sal < e2.sal) return -1;
        return 0;
    }
}

