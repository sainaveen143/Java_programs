

import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args) {
       try (Scanner sc = new Scanner(System.in);) {
        int x = sc.nextInt();
        if(x%4==0){
            if(x%100==0&&x%400==0){
                System.out.println("leapyear");
            }
            else
            System.out.println("not leap year");
        }
        else
            System.out.println("not leap year");
       }
    }
}
