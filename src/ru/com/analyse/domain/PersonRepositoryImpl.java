package ru.com.analyse.domain;

import ru.com.analyse.data.FileHandler;
import ru.com.analyse.data.FileParser;
import ru.com.analyse.data.FileStatistics;
import ru.com.analyse.data.PersonFinder;
import ru.com.analyse.model.PersonInfo;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    private final FileHandler fileHandler;
    private final FileParser fileParser;
    private final PersonFinder personFinder;
    private final FileStatistics fileStatistics;

    private static final String PATH = "C:\\Users\\elnur.geriyev\\Downloads\\Telegram Desktop\\data_yandex\\ufa.csv";
    private final List<PersonInfo> personInfoList;

    public PersonRepositoryImpl(FileHandler fileHandler, FileParser fileParser, PersonFinder personFinder,
                                FileStatistics fileStatistics) {
        this.fileHandler = fileHandler;
        this.fileParser = fileParser;
        this.personFinder = personFinder;
        this.fileStatistics = fileStatistics;
        List<String> lines = fileHandler.loadFromFile(PATH);
        personInfoList = fileParser.parsePersons(lines);
    }

    @Override
    public List<PersonInfo> getPersonsInfo() {
        List<String> lines = fileHandler.loadFromFile(PATH);
        return fileParser.parsePersons(lines);
    }

    @Override
    public List<PersonInfo> findAllPeopleByFirstName(String firstName) {
        return personFinder.findAllPeopleByFirstName(personInfoList, firstName);
    }

    @Override
    public PersonInfo findPersonByEmail(String email) {
        return personFinder.findPersonByEmail(personInfoList, email);
    }

    @Override
    public PersonInfo findPersonByPhoneNumber(String phoneNumber) {
        return personFinder.findPersonByPhoneNumber(personInfoList, phoneNumber);
    }

    @Override
    public void showAllStatistics() {
        fileStatistics.showAllStatistics(personInfoList);
    }

    @Override
    public void showFirstNameStatistics() {
        fileStatistics.showFirstNameStatistics(personInfoList);
    }

    @Override
    public void showPhoneOperatorStatistics() {
        fileStatistics.showPhoneOperatorStatistics(personInfoList);
    }

    @Override
    public void showOSStatistics() {
        fileStatistics.showOSStatistics(personInfoList);
    }
}
