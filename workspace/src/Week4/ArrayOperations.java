package Week4;

public class ArrayOperations {
    public static int scalarProduct(int[] v) {
        int result = 0;
        for (int i = 0; i < v.length; i++)
            result += v[i] * v[i];
        return result;
    }

    public static int[][] scalarMultiplication(int[][] m, int s) {
        if (m.length == 0)
            return new int[0][0];

        int[][] result = new int[m.length][m[0].length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                result[i][j] = m[i][j] * s;
        return result;
    }

    public static int[][] transpose(int[][] m) {
        if (m.length == 0)
            return new int[0][0];
        int[][] result = new int[m[0].length][m.length];
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[0].length; j++)
                result[i][j] = m[j][i];
        return result;
    }

    public static void printmat(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println("| ");
        }
    }
}