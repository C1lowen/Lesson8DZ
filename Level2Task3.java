import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Level2Task3 {
    public static void main(String[] args) {
        File file = new File("m.txt");
        String text = saveToString();

        try(PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        }catch (IOException e){
            System.out.println(e);
        }
    }



    static String saveToString(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 40; j++){
                sb.append("* ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
