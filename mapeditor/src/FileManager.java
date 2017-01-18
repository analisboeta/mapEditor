

import java.io.*;

/**
 * Created by Ana Lourenço on 25/10/16.
 */
public class FileManager {


    public char[] readFile(String filePath) throws IOException {


        FileReader reader= null;
        BufferedReader bReader = null;
        String line = "";
        String result = "";


        try {
            reader = new FileReader(filePath);
            bReader = new BufferedReader(reader);

            while ((line = bReader.readLine()) != null) {
                result += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            bReader.close();
        }

        return result.toCharArray();

    }


    public void writeFile(char[] chars, String path) throws IOException {


        FileWriter writer = null;
        BufferedWriter bWriter = null;

        try {

            writer = new FileWriter(path);
            bWriter = new BufferedWriter(writer);
            bWriter.write(chars);

            bWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bWriter.close();
        }


    }
}

