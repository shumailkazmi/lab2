public class Calculator {

     public static float ADD(float a, float b) {
        return a + b;
    }

    public static int ADD(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return num1 + num2;
    }

    public static int ADD(int a, int b) {
        return a + b;
    }
       public static int ADD(String[] arr) {
        int sum = 0;
        for (String str : arr) {
            int num = Integer.parseInt(str);
            sum += num;
        }
        return sum;
    }

    public static int ADD(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int ADD(Integer... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Addition of integers: " + ADD(5, 5));
        System.out.println("Addition of float: " + ADD(5.0f, 5.0f));
        System.out.println("Addition of string: " + ADD("5", "5"));

        int[] intArray = {5, 5, 5};
        System.out.println("Addition of integer array: " + ADD(intArray));

        System.out.println("Addition of string array: " + ADD(5, 5, 5));

        String[] strArray = {"5", "5", "5"};
        System.out.println("String Array Addition: " + ADD(strArray));
    }
}
