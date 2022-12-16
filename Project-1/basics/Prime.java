

import java.util.Scanner;

public class Prime {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
        int number = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(number+"prime number");
        }
        else
        System.out.println(number+"not prime number");
        System.out.println();
     }
     }
        
    }

