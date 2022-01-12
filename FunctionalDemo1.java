/*
The intention of this assignment is to teach you how functions can be treated as objects in Java.

Create a program that, given 2 strings, combines them in a zipper pattern. A zipper pattern is when the first
character of the first string is followed by the first character of the second string, then the second character
of the first string, then the second character of the second string, and so on...

This must be done using a higher order function called BinaryOperator. The BinaryOperator may be implemented
however you like, but it must take 2 strings as arguments and return the zippered string. Your BinaryOperator
must be passed to the zip method shown below and you must print the returned String from main.

Example:
Input: "HloWrd", "el_ol!"
Output: "Hello_World!"

Constraints:
- The string parameters will be passed in as command line arguments.
- Do not modify the zip method.
- You must use lambda notation to create the BinaryOperator as a first class object.
- The strings will always be of equal length.
- Do not worry about error-checking (no null arguments or weird characters).

Useful resources:
http://tutorials.jenkov.com/java-functional-programming/index.html
http://tutorials.jenkov.com/java-functional-programming/functional-interfaces.html
*/

import java.util.function.BinaryOperator;

public class FunctionalDemo1 {

    public static void main(String[] args) {
        FunctionalDemo1 obj = new FunctionalDemo1();
        String one="1234";
        String two="5678";

        BinaryOperator<String> conor = 

        System.out.println(obj.zip(conor(),one,two));
    }

    private static BinaryOperator<String> conor(){
        return null;
    }

    private String zip(BinaryOperator<String> operator, String a, String b) {
        return operator.apply(a, b);
    }
}
