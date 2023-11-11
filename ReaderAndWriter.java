import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class ReaderAndWriter {

        public static void main(String[] args) {
            try {
                FileWriter writer = new FileWriter("MyFile.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                bufferedWriter.write("Hello World");
                bufferedWriter.newLine();
                bufferedWriter.write("See You Again!");

                bufferedWriter.close();
                FileReader reader = new FileReader("MyFile.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);

                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }