package com.work.search.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linux
 */
public class BBinaria extends SearchBase {

    @Override
    public int search(int nums[], int key) {
        int mid;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == key) {
                return mid;
            }

            if (nums[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    @Override
    public Integer[] searchList(int[] nums, int key) {
        List<Integer> pos = findAllOccurrences(nums, key);
        Integer[] res = new Integer[pos.size()];
        return pos.toArray(res);
    }

    private List<Integer> findAllOccurrences(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                int temp = mid;
                while (temp >= left && arr[temp] == target) {
                    indices.add(temp);
                    temp--;
                }

                temp = mid + 1;
                while (temp <= right && arr[temp] == target) {
                    indices.add(temp);
                    temp++;
                }
                
                break;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return indices;
    }

}
