import java.util.Arrays;

/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */

public class exceptask3 {
    public static void main(String[] args) {
        try {
            int[] array_1 = { 23, 3, 56, 4, 32, 44, 34 };
            int[] array_2 = { 12, 1, 23, 6, 55, 25 };
            int[] result = getDiv(array_1, array_2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int[] getDiv(int[] arr_1, int[] arr_2) {
        if (arr_1 == null || arr_2 == null) {
            throw new RuntimeException("One of the arrays is NULL.");
        } else if (arr_1.length != arr_2.length) {
            throw new RuntimeException("Operation aborted. Arrays of different lengths.");
        }
        int[] result = new int[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            if (arr_2[i] == 0) {
                throw new RuntimeException("Сan't divide by zero.");
            }
            result[i] = arr_1[i] / arr_2[i];
        }
        return result;
    }
}