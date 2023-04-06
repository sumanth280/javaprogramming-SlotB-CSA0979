import java.io.*;

class matrixsum {
    public static void main(String arg[]) {
        int mat1[][] = { { 1, 2 }, { 5, 3 } };
        int mat2[][] = { { 2, 3 }, { 4, 1 } };
        int matsum[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matsum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Mat1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Mat2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Mat Sum:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matsum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}