import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Level1Task2 {
    public static void main(String[] args) {
        File file = new File("p.txt");
        int arr[][] = new int [5][5];

        Random rd = new Random();


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = rd.nextInt(0, 50);
            }
        }
        String text = saveString(arr);
        saveInfoForFile(file, text);

    }

    static void saveInfoForFile(File file, String text){
        try(PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        } catch(IOException e){
            System.out.println(e);
        }
    }

    static String saveString(int[][] arr){
        StringBuilder sb = new StringBuilder();

        for(int[] rows : arr){
            for(int colm : rows){
                sb.append(String.format("%-6.6s\t", colm));
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
