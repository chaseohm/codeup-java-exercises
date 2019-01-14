package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        System.out.println("Please enter an integer: ");
        System.out.println(Input.getInt());
        System.out.println("Enter a double: ");
        System.out.println(Input.getDouble());
    }
}
