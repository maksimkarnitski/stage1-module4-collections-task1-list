package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}


class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (function(a) > function(b)) {
            return 1;
        } else if (function(a) < function(b)) {
            return -1;
        } else if (function(a) == function(b)) {
            if (Integer.valueOf(a) > Integer.valueOf(b)) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }

    }

    public int function(String a) {
        int ai = Integer.parseInt(a);
        return (int) Math.pow(5 * ai, 2) + 3;
    }


}
