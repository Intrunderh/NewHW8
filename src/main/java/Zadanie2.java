public class Zadanie2 {
    public static void main(String[] args) {
//    Напишите программу, которая находит мин.макс значение в каждой строке и в общем
        int[][] array = {
                {23, 3, 5, 7, 13},
                {6, 8, 7, 12, 19},
                {4, 3, 7, 8, 14},
                {17, 2, 3, 4, 5},
        };

        int min1 = array[0][0];
        int max1 = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min1 > array[i][j]) {
                    min1 = array[i][j];
                }
                if (max1 < array[i][j]) {
                    max1 = array[i][j];
                }
            }
        }

        System.out.println("------------------------------------");

        System.out.println("Минимальное значение в строке 1: " + min1);
        System.out.println("Максимальное значение в строке 1: " + max1);

        int min2 = array[1][0];
        int max2 = 0;

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min2 > array[i][j]) {
                    min2 = array[i][j];
                }
                if (max2 < array[i][j]) {
                    max2 = array[i][j];
                }
            }
        }

        System.out.println("------------------------------------");

        System.out.println("Минимальное значение в строке 2: " + min2);
        System.out.println("Максимальное значение в строке 2: " + max2);

        int min3 = array[2][0];
        int max3 = 0;

        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min3 > array[i][j]) {
                    min3 = array[i][j];
                }
                if (max3 < array[i][j]) {
                    max3 = array[i][j];
                }
            }
        }

        System.out.println("------------------------------------");

        System.out.println("Минимальное значение в строке 3: " + min3);
        System.out.println("Максимальное значение в строке 3: " + max3);

        int min4 = array[3][0];
        int max4 = 0;

        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min4 > array[i][j]) {
                    min4 = array[i][j];
                }
                if (max4 < array[i][j]) {
                    max4 = array[i][j];
                }
            }
        }

        System.out.println("------------------------------------");

        System.out.println("Минимальное значение в строке 4: " + min4);
        System.out.println("Максимальное значение в строке 4: " + max4);

        System.out.println("------------------------------------");

        int[] all = {min1, min2, min3, min4, max1, max2, max3, max4};
        int minimalnoe = all[0];
        int maximalnoe = 0;
        for (int i = 0; i < all.length; i++) {
            if (minimalnoe > all[i]) {
                minimalnoe = all[i];
            }
            if (maximalnoe < all[i]) {
                maximalnoe = all[i];
            }
        }
        System.out.println("Минимальное значение среди всех: " + minimalnoe);
        System.out.println("Максимальное значение среди всех: " + maximalnoe);
//
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//                sum0 += array[i][j];
//            }
//            System.out.print("Сумма элементов в 1 массиве = " + sum0);
//            System.out.println();
//        }
//        for (int i = 1; i < 2; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//                sum1 += array[i][j];
//            }
//            System.out.print("Сумма элементов во 2 массиве = " + sum1);
//            System.out.println();
//        }
//        for (int i = 2; i < 3; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//                sum2 += array[i][j];
//            }
//            System.out.print("Сумма элементов в 3 массиве = " + sum2);
//            System.out.println();
//        }
//        for (int i = 3; i < 4; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//                sum3 += array[i][j];
//            }
//            System.out.print("Сумма элементов в 4 массиве = " + sum3);
//            System.out.println();
//        }


    }

}
