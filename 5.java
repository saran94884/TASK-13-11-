1.ArrayIndexOutOfBoundsException


public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            int index = 6; // Index is out of bounds
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}


2.StringIndexOutOfBoundsException


public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        String str = "Hello, World";

        try {
            char ch = str.charAt(15); // Index is out of bounds
            System.out.println("Character at index 15: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
