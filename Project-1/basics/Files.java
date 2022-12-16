import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {
        File f = new File("c://java//files.txt");
        if(f.createNewFile()){
            System.out.println("true");
        }
        try (FileWriter fw = new FileWriter("c://java//files.txt")) {
            fw.write("Akula Sai Naveen");
        }
        try (Scanner s = new Scanner(f)) {
            System.out.println(s.nextLine());
        }
    }
}
