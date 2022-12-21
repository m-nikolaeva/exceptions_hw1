import java.util.Arrays;

/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. */

public class exceptask2 {

    public static void main(String[] args) {
        int[] array1 = { 23, 3, 56, 4, 32, 44 };
        int[] array2 = { 12, 1, 32, 6, 55, 25 };
        int[] result = getSub(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getSub(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("One of the arrays is NULL.");
        } else if (arr1.length != arr2.length) {
            throw new RuntimeException("Operation aborted. Arrays of different lengths.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}