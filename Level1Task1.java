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

        System.out.print("Очитить тестовый документ?(y/n): ");
        String strChoice = sc.nextLine();

        choice(file, str, strChoice.charAt(0));

    }

    public static void saveText(File file, String str){
        try(FileWriter writer = new FileWriter(file, true)){
            writer.write(str);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void deleteText(File file, String str){
        try(FileWriter writer = new FileWriter(file)){
            writer.write(str);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void choice(File file, String str, char resChoice){
        Character.toLowerCase(resChoice);
        switch(resChoice){
            case 'y' -> deleteText(file, str);
            case 'n' -> saveText(file, str);
            default -> System.out.println("Нету такого варианта!");
        }
    }

}
