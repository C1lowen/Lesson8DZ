import java.io.FileReader;
import java.io.IOException;

public class Level2Task2 {
    public static void main(String[] args) {

        FileReader fileReader = null;
        String str = "qwertyuiopasdfghjklzxcvbnm";
        int[] arr = new int [str.length()];

        try {

            fileReader = new FileReader("D:\\checkDz\\t.txt");

            int character;
            while ((character = fileReader.read()) != -1) {
                char ch = (char) character;
                for(int i = 0; i < str.length();i++){
                    if(Character.toLowerCase(ch) == str.charAt(i)){
                        arr[i]++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        countSymbol(str, arr);

    }

    public static void countSymbol(String str, int [] arr){
        for(int i = 0; i < str.length(); i++){
            int max = 0;
            for(int j = 0; j < str.length(); j++) {
                if(arr[j] >= arr[max]){
                    max = j;
                }
            }

            System.out.println(str.charAt(max) + " => " + arr[max]);
            arr[max] = -1;

        }
    }
}
