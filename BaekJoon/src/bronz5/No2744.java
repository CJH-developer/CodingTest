package bronz5;

import java.util.Scanner;

public class No2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            char b = str.charAt(i);

            if(Character.isLowerCase(b)){
                b = Character.toUpperCase(b);
            }else if(Character.isUpperCase(b)){
                b = Character.toLowerCase(b);
            }
            System.out.print(b);
        }

        }
    }

