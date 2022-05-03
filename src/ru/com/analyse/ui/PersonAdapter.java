package ru.com.analyse.ui;

import ru.com.analyse.domain.PersonRepository;
import ru.com.analyse.model.PersonInfo;

import java.util.List;

public class PersonAdapter {
    private final PersonRepository repository;

    public PersonAdapter(PersonRepository repository) {
        this.repository = repository;
    }

    public void showAllPersons() {
        List<PersonInfo> personInfoList = getPersonsInfo();
        for (PersonInfo personInfo : personInfoList) {
            System.out.println(personInfo.toString());
        }
    }

    public List<PersonInfo> findAllPeopleByFirstName(String firstName) {
        return repository.findAllPeopleByFirstName(firstName);
    }

    public PersonInfo findPersonByEmail(String email) {
        return repository.findPersonByEmail(email);
    }

    public PersonInfo findPersonByPhoneNumber(String phoneNumber) {
        return repository.findPersonByPhoneNumber(phoneNumber);
    }

    public void showAllStatistics() {
        repository.showAllStatistics();
    }

    public void showFirstNameStatistics() {
        repository.showFirstNameStatistics();
    }

    public void showPhoneOperatorStatistics() {
        repository.showPhoneOperatorStatistics();
    }

    public void showOSStatistics() {
        repository.showOSStatistics();
    }

    private List<PersonInfo> getPersonsInfo() {
        return repository.getPersonsInfo();
    }
}
