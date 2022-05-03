package ru.com.analyse.data;

import ru.com.analyse.model.PersonInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Реализация {@link FileParser}
 */
public class FileParserImpl implements FileParser {
    @Override
    public List<PersonInfo> parsePersons(List<String> persons) {
        List<PersonInfo> resultList = new ArrayList<>();
        for (String person : persons)
            resultList.add(parseLine(person));

        return resultList;
    }

    // Take the line from csv file then parse it in PersonInfo
    private PersonInfo parseLine(String line) {
        // Иногда встречаются данные, в которых есть запятая, поэтому split(",") работает некорректно
        String[] res = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

        // Также встречаются битые данные
        if (res.length < 7)
            return new PersonInfo();

        PersonInfo personInfo = new PersonInfo(res[1], res[2], res[3], res[4], res[5], res[6]);
        if (res.length >= 17) {
            personInfo.setUserAgent(res[16]);
        }

        return personInfo;
    }
}
