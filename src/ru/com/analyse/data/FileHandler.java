package ru.com.analyse.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Интерфейс для загрузки из текстового файла построчно
 */
public interface FileHandler {
    /** метод возвращающий список строк из файла */
    List<String> loadFromFile(String path);
}
