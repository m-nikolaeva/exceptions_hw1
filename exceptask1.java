/*
 Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class exceptask1 {
    public static void main(String[] args) {
        int[] array = {1, 6, 9, 5, 8, 10};
        int minLength = 7;
        checkNull(array);
        checkNegative(array);
        checkLength(array, minLength);
    }

    public static void checkNull(int[] array) {
        if (array == null) {
            throw new RuntimeException("Array is null!");
        }
    }

    public static void checkNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                throw new RuntimeException("Array must not contain a negative value!");
            }
        }
    }

    public static void checkLength(int[] array, int miLength) {
        if (array.length < miLength) {
            throw new RuntimeException("Array size must not be less than " + miLength + "!");
        }
    }
    
}

