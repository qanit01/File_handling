import java.io.*;

public class utility {
    public String readFromFile(File file){
        String data = "";
        String text;
        try {
            BufferedReader r = new BufferedReader(new FileReader(file));
            while((text=r.readLine())!=null){
                data+=text + "\n";
            }
            r.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return data;

    }



    public void writeToFile(File file, String text){
        try {
            BufferedWriter w= new BufferedWriter(new FileWriter(file));
            w.write(text);
            w.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void appendToFile(File file, String text){
        try {
            BufferedWriter w= new BufferedWriter(new FileWriter(file,true));
            w.write(text);
            w.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
