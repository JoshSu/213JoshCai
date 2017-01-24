/**
 * Created by sujiaxu on 2016/10/23.
 */


public class haha {
    public static int[][] Solution(int[][] matrix, int flag) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return matrix;
        //int m = matrix.length, n = matrix[0].length;
        int[][] rvalue;
        rvalue = transpose(matrix);
        print(rvalue);

        flip(rvalue, flag);
        return rvalue;
    }

    public static void print(int [][] ret){
        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[0].length; j++) {
                System.out.print(ret[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");

    }

    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] rvalue = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                rvalue[i][j] = matrix[j][i];
        return rvalue;
    }

    private static void flip(int[][] matrix, int flag) {//一个是竖着换，一个是横着换
        int m = matrix.length, n = matrix[0].length;
        if (flag == 1) {
            for (int i = 0; i < m; i++) {
                int start = 0;
                int end = matrix[i].length - 1;
                while (start < end) {
                    int temp = matrix[i][start];
                    matrix[i][start] = matrix[i][end];
                    matrix[i][end] = temp;
                    start++;
                    end--;
                }
            }

        } else {
            int start = 0;
            int end = matrix.length -1;
            while (start < end){
                int [] temp = matrix[start];
                matrix[start] = matrix[end];
                matrix[end] = temp;
                start++;end--;
            }


        }
    }
    /*
    * 1415
    * 2653
    * 8979
    * */

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 1},{6,7,8},{0,3,5}};

        int[][] ret = Solution(arr, 1);

        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[0].length; j++) {
                System.out.print(ret[i][j]);
            }
            System.out.println();
        }


    }
}
