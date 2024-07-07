package com.work.search.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linux
 */
public class BLineal extends SearchBase {

    @Override
    public int search(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer[] searchList(int[] nums, int key) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                pos.add(i);
            }
        }
        Integer[] res = new Integer[pos.size()];
        return pos.toArray(res);
    }

}
