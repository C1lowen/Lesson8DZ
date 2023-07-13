import java.io.File;

public class Level1Task3 {
    public static void main(String[] args) {
        File folderFile = new File(".");
        File[] files = folderFile.listFiles();
        for(var file : files){
            if(!file.isFile()){
                System.out.println(file + " => Каталог");
                folderFileCheck(file);
            }
        }
    }

    static void folderFileCheck(File folder){

        File[] files = folder.listFiles();
        for(var file : files){
            if(!file.isFile()){
                System.out.println(file + " => Каталог");
                folderFileCheck(file);
            };
        }


    }
}
