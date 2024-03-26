import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        // Найдите сумму элементов в каждой строке двумерного массива размером 4x4.
        // также найди сумме всех массивов
        int[][] array = {
                {1, 3, 5, 7, 13},
                {6, 8, 7, 12, 19},
                {4, 3, 7, 8, 14},
                {1, 2, 3, 4, 5},
        };

        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sumAll = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum0 += array[i][j];
            }
            System.out.print("Сумма элементов в 1 массиве = " + sum0);
            System.out.println();
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum1 += array[i][j];
            }
            System.out.print("Сумма элементов во 2 массиве = " + sum1);
            System.out.println();
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum2 += array[i][j];
            }
            System.out.print("Сумма элементов в 3 массиве = " + sum2);
            System.out.println();
        }
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum3 += array[i][j];
            }
            System.out.print("Сумма элементов в 4 массиве = " + sum3);
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumAll += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов двойного массива = " + sumAll);

    }
}
