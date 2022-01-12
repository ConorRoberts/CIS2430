package demo;

/*
The intention of this assignment is to introduce you to the Java Streams library, a powerful tool for functional
programming in a clean, scalable, and easy to read way. You will also learn how to exceed the bounds of primitive
numbers.

Create a program that, given an ArrayList of Strings, creates a stream and then:
1. filters out all non-numeric and negative values
2. prints the remaining contents in order
3. converts the stream of Strings to a DoubleStream
4. ceilings all values (rounds them up to an integer)
5. converts the DoubleStream to an IntStream
6. combines all digits of every int to a single BigInteger object
7. prints the BigInteger object

Restrictions:
- The operations listed above must happen in the order given.
- Functions you intend to pass as stream parameters must be written in a separate method and called via lambda.
- Except printing the final value, program functionality must be done entirely with Stream methods and lambda functions.
    * your main method can technically be written in 1 long line (but don't do that)

How to cleanly write chained stream methods:
object.stream()
        .method1(args) // Note that this spacing is TWO indents
        .method2(args)
        .method3(args)...

Resources:
Use Google ;)
 */

import java.util.ArrayList;

public class FunctionalDemo2 {

    // This is an example of the kind of input you may receive.
    // The BigInteger resulting from this input is 1234528937214567245810056.
    private static ArrayList<String> list = new ArrayList<>();
    static {
        list.add("asd");
        list.add("12345");
        list.add("28937");
        list.add(" ");
        list.add("");
        list.add("1.57");
        list.add("-999");
        list.add("145672458");
        list.add("00000100");
        list.add("12asd3");
        list.add("55.6");
    }

    public static void main(String[] args) {

    }
}
