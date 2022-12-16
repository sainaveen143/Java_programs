import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int size=scan.nextInt();         //Enter size of array
            int[] array = new int[size];
             for(int i = 0;i<array.length;i++){
                 array[i] = scan.nextInt();
             }
             System.out.println(array);
        }
    }
   
}
