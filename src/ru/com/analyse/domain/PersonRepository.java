package ru.com.analyse.domain;

import ru.com.analyse.model.PersonInfo;

import java.util.List;

public interface PersonRepository {
    List<PersonInfo> getPersonsInfo();
    List<PersonInfo> findAllPeopleByFirstName(String firstName);
    PersonInfo findPersonByEmail(String email);
    PersonInfo findPersonByPhoneNumber(String phoneNumber);

    void showAllStatistics();
    void showFirstNameStatistics();

    void showPhoneOperatorStatistics();

    void showOSStatistics();
}
