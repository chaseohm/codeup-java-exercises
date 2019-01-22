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
        System.out.println("Please enter an integer between 5 and 10: ");
        System.out.println(Input.getInt(5, 10));
        System.out.println("Please enter a hexidecimal number");
        System.out.println(Input.getIntHex());
        System.out.println("Please enter a binary number");
        System.out.println(Input.getBinary());
    }
}
