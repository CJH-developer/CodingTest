package bronz5;

import java.math.BigInteger;
import java.util.Scanner;

public class No1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger totalMoney = sc.nextBigInteger();
        BigInteger count = sc.nextBigInteger();
        sc.close();

        System.out.println(totalMoney.divide(count));
        System.out.println(totalMoney.remainder(count));
    }
}
