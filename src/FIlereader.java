import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FIlereader {
    public static void main(String[] args) throws IOException {
        List<String[]> rows = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader("D:\\JAVA PROGRAMS\\Arraylist\\src\\Myfile.txt"));
        String line;
        while ((line=bf.readLine())!=null){
            String [] cells=line.split(",");
            rows.add(cells);

        }

        for (String[] row : rows) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }



    }
    }

