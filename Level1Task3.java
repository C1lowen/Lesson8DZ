import java.io.File;
import java.util.Scanner;

public class Level1Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к каталогу: ");
        String nameFile = sc.nextLine();

        File folderFile = new File(nameFile);
        folderFileCheck(folderFile);
    }

    static void folderFileCheck(File folder){

        File[] files = folder.listFiles();
        for(var file : files){
            if(file.isDirectory()){
                System.out.println(file + " => Каталог");
                folderFileCheck(file);
            };
        }

    }
}
