public class data_types {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        String name = "Baeldung Blog";
        char toggler = 'Y';
        boolean isVerified = true;

        int[] numbers = new int[100];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        int thirdElement = numbers[2];

        int lengthOfNumbersArray = numbers.length;

        System.out.println(name + toggler + isVerified + thirdElement + lengthOfNumbersArray);
    }
}
