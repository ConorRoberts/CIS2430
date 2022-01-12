import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Conor {

   // Complete the aVeryBigSum function below.
   static long aVeryBigSum(long[] ar) {
    BigInteger big = BigInteger.ZERO;
    for(long i : ar){
        big.add(new BigInteger(Long.toString(i)));
    }
    return big.longValue();

}

  public static void main(String[] args){

    long[] n = {1,2,3,4,5};

    System.out.println(aVeryBigSum(n));
  }
}
