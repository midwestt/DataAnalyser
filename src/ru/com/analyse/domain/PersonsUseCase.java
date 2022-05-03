package ru.com.analyse.domain;

import ru.com.analyse.model.PersonInfo;

import java.util.List;

public class PersonsUseCase {
    private final PersonRepository repository;

    public PersonsUseCase(PersonRepository repository) {
        this.repository = repository;
    }

    public int getCountOfComments() {
        List<PersonInfo> persons = repository.getPersonsInfo();
        return persons.size();
    }

}
