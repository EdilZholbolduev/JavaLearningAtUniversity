import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("studentSEN.txt"));
            FileWriter fw = new FileWriter("studentSENwith5")){
        String line;
        while((line = bufferedReader.readLine()) !=null){
            String[] words = line.split("\\s");
            String surname = words[0].trim();
            String name = words[1].trim();
            String score = words[2].trim();
            if(score.equals("5")){
                fw.write(surname + "\s" + name + "\s" + score + "\n");
            }

        }

        }catch (IOException e){
            System.out.println("Error IO");
        }

    }
}