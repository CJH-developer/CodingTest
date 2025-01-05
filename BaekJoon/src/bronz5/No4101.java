package bronz5;

import java.util.Scanner;

public class No4101 {

    private void solution(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 == 0 && num2 == 0){
                break;
            }
            if(num1 > num2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }

    public static void main(String[] args) {
        new No4101().solution();
    }
}
