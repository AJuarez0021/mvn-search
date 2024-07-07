package com.work.search.algorithms;

import java.text.DecimalFormat;

/**
 *
 * @author linux
 */
public abstract class SearchBase {


    public abstract Integer[] searchList(int[] nums, int key);
    
    public abstract int search(int nums[], int key);

    public void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void print(int nums[], int pos) {
        System.out.println("Array    Posicion");
        DecimalFormat d = new DecimalFormat("00");

        for (int i = 0; i < nums.length; i++) {
            if (i == pos) {
                System.out.println(d.format(nums[i]) + "  -->  " + d.format((i + 1)));
            } else {
                System.out.println(d.format(nums[i]) + "       " + d.format((i + 1)));
            }
        }
    }

    public void print(int nums[], Integer pos[]) {
        System.out.println("Array    Posicion");
        DecimalFormat d = new DecimalFormat("00");
        boolean bFind;
        for (int i = 0; i < nums.length; i++) {
            bFind = false;
            for (int j = 0; j < pos.length; j++) {
                if (i == pos[j]) {
                    System.out.println(d.format(nums[i]) + "  -->  " + d.format((i + 1)));
                    bFind = true;
                }
            }
            if (!bFind) {
                System.out.println(d.format(nums[i]) + "       " + d.format((i + 1)));
            }
        }
    }
}
