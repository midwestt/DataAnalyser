package ru.com.analyse.data;

import ru.com.analyse.model.PersonInfo;

import java.util.List;

/**
 * Класс, который отвечает за сбор статистики с файла
 */
public interface FileStatistics {
    void showAllStatistics(List<PersonInfo> personInfoList);

    void showFirstNameStatistics(List<PersonInfo> personInfoList);

    void showPhoneOperatorStatistics(List<PersonInfo> personInfoList);

    void showOSStatistics(List<PersonInfo> personInfoList);
}
