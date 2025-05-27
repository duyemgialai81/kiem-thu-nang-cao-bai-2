package vn.fpoly.kiemthunangcao02.kiemthunangcaobai2;

import java.util.List;

public class TestService {

    public static int testSoNguyen(int a, int b) {
        return a * b;
    }

    public static int chiaHaiSo(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static double tinhTB(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) throw new ArithmeticException("List is empty");
        return numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }

    public static int getElementAtIndex(int[] array, int index) {
        return array[index];
    }




    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    private static String name;
    public TestService(String name) {
        this.name = name;
    }
    public static String getName() {
        if (name == null) {
            throw new NullPointerException("Name is null");
        }
        return name;
    }
}
