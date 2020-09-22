import java.io.File;
import java.io.PrintWriter;
public class PrintWriter {
public static void main(String[] args) throws Exception {
//Data to write on Console using PrintWriter
PrintWriter writer = new PrintWriter(System.out);
writer.write("You can see the text visible in output screen.\n");
writer.flush();
writer.close();
//Data to write in File using PrintWriter
PrintWriter writers =null;
writers = new PrintWriter(new File("/home/elcot/Desktop/test.txt"));
writers.write("Happy Learning! \n The text is printed in the targeted file.");
writers.flush();
writers.close();
} }
