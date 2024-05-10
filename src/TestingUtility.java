import java.io.File;

public class TestingUtility {
    public static void main(String[] args) {
        utility u = new utility();
        u.writeToFile(new File("D:\\JAVA PROGRAMS\\Arraylist\\src\\Myfile.txt"),"My name is Qanit");
        String data=u.readFromFile(new File("D:\\JAVA PROGRAMS\\Arraylist\\src\\Myfile.txt"));
        System.out.println(data);
        u.appendToFile(new File("D:\\JAVA PROGRAMS\\Arraylist\\src\\Myfile.txt")," I am 18");
        data=u.readFromFile(new File("D:\\JAVA PROGRAMS\\Arraylist\\src\\Myfile.txt"));
        System.out.println(data);
    }
}
