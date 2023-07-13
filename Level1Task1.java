import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Level1Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("t.txt");

        System.out.println("Текстовый документ готов к использыванию: ");
        String str = sc.nextLine();

        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
