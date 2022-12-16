import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int count =20;
            for(int i = 1;i<=count;i++){
                System.out.println(x+"*"+i+"="+i*x);
            }
        }
    }
}
