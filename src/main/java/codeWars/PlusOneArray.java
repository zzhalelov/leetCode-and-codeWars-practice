package codeWars;

public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        for (int i : arr) {
            if (i < 0 || i > 9) {
                return null;
            }
        }

        int[] result = new int[arr.length];

        System.arraycopy(arr, 0, result, 0, arr.length);

        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] < 9) {
                result[i]++;
                return result;
            } else {
                result[i] = 0;
            }
        }

        int[] newResult = new int[result.length + 1];
        newResult[0] = 1; // Переносим 1 в старший разряд
        return newResult;
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 7};
//        int[] arr =
//        System.out.println(Arrays.toString(upArray(arr)));
    }
}