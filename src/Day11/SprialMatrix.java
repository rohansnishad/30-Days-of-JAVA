package Day11;
import java.util.*;

public class SprialMatrix {


        public static void printSpiral(int[][] matrix, int rows, int cols) {
            int rowStart = 0;
            int rowEnd = rows - 1;
            int colStart = 0;
            int colEnd = cols - 1;

            while (rowStart <= rowEnd && colStart <= colEnd) {

                // 👉 Top Row
                for (int col = colStart; col <= colEnd; col++) {
                    System.out.print(matrix[rowStart][col] + " ");
                }
                rowStart++;

                // 👉 Right Column
                for (int row = rowStart; row <= rowEnd; row++) {
                    System.out.print(matrix[row][colEnd] + " ");
                }
                colEnd--;

                // 👉 Bottom Row
                if (rowStart <= rowEnd) {
                    for (int col = colEnd; col >= colStart; col--) {
                        System.out.print(matrix[rowEnd][col] + " ");
                    }
                    rowEnd--;
                }

                // 👉 Left Column
                if (colStart <= colEnd) {
                    for (int row = rowEnd; row >= rowStart; row--) {
                        System.out.print(matrix[row][colStart] + " ");
                    }
                    colStart++;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 🔸 Input dimensions
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            // 🔸 Input elements
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // 🔸 Print Spiral
            System.out.println("Spiral order:");
            printSpiral(matrix, rows, cols);

    }

}
