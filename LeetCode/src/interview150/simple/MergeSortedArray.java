package interview150.simple;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] sorted = new int[m + n];
        int k = 0;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                sorted[k++] = nums2[p2++];
            } else if (p2 == n) {
                sorted[k++] = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                sorted[k++] = nums1[p1++];
            } else {
                sorted[k++] = nums2[p2++];
            }
        }
        for (int i = 0; i != m + n; i++) {
            nums1[i] = sorted[i];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        mergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
