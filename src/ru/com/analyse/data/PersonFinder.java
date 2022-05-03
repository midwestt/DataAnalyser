package ru.com.analyse.data;

import ru.com.analyse.model.PersonInfo;

import java.util.List;

/**
 * Класс для поиска людей
 */

public interface PersonFinder {
    // Функция, которая находит всех людей по определенному имени
    List<PersonInfo> findAllPeopleByFirstName(List<PersonInfo> personInfoList, String firstName);
    // Поиск человека по email адресу
    PersonInfo findPersonByEmail(List<PersonInfo> personInfoList, String email);
    // Поиск человека по телефонному номеру
    PersonInfo findPersonByPhoneNumber(List<PersonInfo> personInfoList, String phoneNumber);
}
