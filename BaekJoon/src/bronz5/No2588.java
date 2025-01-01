package bronz5;

import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        // 첫번째 숫자
        int b1 = Character.getNumericValue(b.charAt(0));
        int b2 = Character.getNumericValue(b.charAt(1));
        int b3 = Character.getNumericValue(b.charAt(2));

        System.out.println(a * b3);
        System.out.println(a * b2);
        System.out.println(a * b1);

        System.out.println(a * Integer.parseInt(b));
    }
}
