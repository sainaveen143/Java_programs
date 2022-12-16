import java.util.Scanner;

public class ScanningElment {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
             int sum = 0;
             int a;
             while((a = sc.nextInt()) != number){
                sum = sum+a;
             }     
             System.out.println(sum);
        }  
    }
}
