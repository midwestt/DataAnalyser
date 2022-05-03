package ru.com.analyse.data;

import ru.com.analyse.model.PersonInfo;

import java.util.List;

/**
 * Класс для парсинга данных в файле
 */
public interface FileParser {

    List<PersonInfo> parsePersons(List<String> persons);

}
