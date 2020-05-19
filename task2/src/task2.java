/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по нему циклом, и числа, меньшие 6, умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;
5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
7. *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами.*/
public class task2 {
    public static void main(String args[]){
        int arr[] = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int arr1[] = new int[8];
        int arr2[] = new int[] { 2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int arr3[][] = new int[4][4];
        int arr4[] = new int[] { 1, 1, 1, 0, 1, 0, 1, 0, 2, 1 };
        int arr5[] = new int[] { 2, 1, 1, 2, 1 };
        int arr6[] = new int[] { 10, 10  };
        int arr7[] = new int[] { 1, 1, 1, 2, 1 };
        int arr8[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int arr9[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int n = 3;
        int m = -1;

        one(arr);
        two(arr1);
        three(arr2);
        four(arr3);
        five(arr2);
        System.out.println(six(arr7));
        System.out.println(six(arr5));
        System.out.println(six(arr6));
        seven(arr8, n);
        System.out.println();
        seven(arr9, m);
    }
    private static void one(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    private static void two(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] +=(3*i);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    private static void three(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<6)
                arr[i] *=2;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    private static void four(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = 0;
                if(i == j)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    private static void five(int arr[]){
        int a = 0, b = 0;
        for(int i = 0; i < arr.length; i++){
            b = arr[0];
            if(arr[i] > a)
                a = arr[i];
            else if(arr[i] < b)
                b = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + a + " - максимальное число");
        System.out.println(b + " - минимальное число");
    }
    private static boolean six(int arr[]){
        int leftsum = 0, rightsum = 0;
        boolean result = false;
        if(arr.length > 1) {
            for (int i = 0; i < arr.length / 2; i++) {
                leftsum += arr[i];
                rightsum += arr[arr.length - 1 - i];
                if (i == (arr.length / 2 - 1) && arr.length % 2 != 0) {
                    rightsum = +arr[arr.length - 2 - i];
                }
            }
            if (rightsum > leftsum) {
                for (int i = arr.length / 2; i < arr.length; i++) {
                    leftsum += arr[i];
                    rightsum -= arr[i];
                    if (rightsum == leftsum) {
                        result = true;
                        printtxt(arr, i);
                        break;
                    }
                }
            } else if (rightsum < leftsum) {
                for (int i = arr.length / 2; i < arr.length; i++) {
                    leftsum -= arr[i];
                    rightsum += arr[i];
                    if (rightsum == leftsum) {
                        result = true;
                        printtxt(arr, i);
                        break;
                    }
                }
            } else {
                result = true;
                printtxt(arr, arr.length/2 - 1);
            }
        }
           else
               System.err.println("Передан слишком короткий массив");
        return result;
        }
    private static void seven(int arr[], int delta) {
        if (delta != 0) {
            if (delta > arr.length) {
                delta = Math.abs(delta % (arr.length - 1));
            }
                if (delta > 0) {
                    for (int i = 0; i < delta; i++) {
                        int buffer = arr[0];
                        arr[0] = arr[arr.length - 1];
                        for (int j = 1; j < arr.length - 1; j++) {
                            arr[arr.length - j] = arr[arr.length - j - 1];
                        }
                        arr[1] = buffer;
                    }
                    printarr(arr);
                }
                else if (delta < 0) {
                    for (int i = 0; i > delta; delta++) {
                        int buffer = arr[arr.length - 1];
                        arr[arr.length - 1] = arr[0];
                        for (int j = 1; j < arr.length - 1; j++) {
                            arr[j - 1] = arr[j];
                        }
                        arr[arr.length - 2] = buffer;
                    }
                    printarr(arr);
                }
            }
        }
    private static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void printtxt(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if(i == num)
                System.out.print(arr[i] + "||");
            else
            System.out.print(arr[i] + " ");
        }
    }


}
