package interview150.medium;

/**
 * 74. 搜索二维矩阵
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = binarySearchCol(matrix, target);
        if (rowIndex < 0) return false;
        return binarySearchRow(matrix, target, rowIndex);
    }

    /**
     * 找到目标值可能在的行
     *
     * @param matrix
     * @param target
     * @return
     */
    private int binarySearchCol(int[][] matrix, int target) {
        int i = -1, j = matrix.length - 1, mid = 0;
        while (i < j) {
            mid = i + (j - i + 1) / 2;
            if (matrix[mid][0] <= target) {
                i = mid;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    /**
     * 在该行二分查找该元素是否存在
     *
     * @param matrix
     * @param target
     * @param rowIndex
     * @return
     */
    private boolean binarySearchRow(int[][] matrix, int target, int rowIndex) {
        int l = 0, r = matrix[0].length - 1, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (matrix[rowIndex][mid] == target) {
                return true;
            } else if (matrix[rowIndex][mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
