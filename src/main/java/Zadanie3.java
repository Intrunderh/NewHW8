public class Zadanie3 {
    public static void main(String[] args) {
//        Найдите среднее значение элементов в каждом столбце и общее
//        присуствует ли опр элемент в дв массиве
        int[][] array = {
                {23, 3, 5, 7, 13},
                {6, 8, 7, 12, 19},
                {4, 3, 7, 8, 14},
                {17, 2, 3, 4, 5},
        };


        int sum0 = 0; double average0 = 0;
        int sum1 = 0; double average1 = 0;
        int sum2 = 0; double average2 = 0;
        int sum3 = 0; double average3 = 0;
        int sum = 0;  double average = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum0 += array[i][j];
                average0 = (double) sum0 / array[i].length;
            }
            System.out.println("Сумма элементов в 1 массиве = " + sum0);
            System.out.println("Среднее значение элементов в 1 массиве = " + average0);
            System.out.println();
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum1 += array[i][j];
                average1 = (double) sum1 / array[i].length;
            }
            System.out.println("Сумма элементов во 2 массиве = " + sum1);
            System.out.println("Среднее значение элементов во 2 массиве = " + average1);
            System.out.println();
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum2 += array[i][j];
                average2 = (double) sum2 / array[i].length;
            }
            System.out.println("Сумма элементов в 3 массиве = " + sum2);
            System.out.println("Среднее значение элементов в 3 массиве = " + average2);
            System.out.println();
        }
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum3 += array[i][j];
                average3 = (double) sum3 / array[i].length;
            }
            System.out.println("Сумма элементов в 4 массиве = " + sum3);
            System.out.println("Среднее значение элементов в 4 массиве = " + average3);
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                average = (double) sum / array[i].length;
            }
        }
        System.out.println("Сумма всех элементов двойного массива = " + sum);
        System.out.println("Среднее значение всех элементов двойного массива = " + average);



    }
}
