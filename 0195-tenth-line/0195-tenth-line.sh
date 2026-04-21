import java.io.*;

public class TenthLine {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                count++;
                if (count == 10) {
                    System.out.println(line);
                    break;
                }
            }

            if (count < 10) {
                System.out.println("File has less than 10 lines.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}