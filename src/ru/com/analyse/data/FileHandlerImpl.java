package ru.com.analyse.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Реализация {@link FileHandler}
 */
public class FileHandlerImpl implements FileHandler {

    @Override
    public List<String> loadFromFile(String path) {
        List<String> lines = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
