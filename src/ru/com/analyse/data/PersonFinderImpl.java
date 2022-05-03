package ru.com.analyse.data;

import ru.com.analyse.model.PersonInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация {@link PersonFinder}
 */
public class PersonFinderImpl implements PersonFinder {
    @Override
    public List<PersonInfo> findAllPeopleByFirstName(List<PersonInfo> personInfoList, String firstName) {
        List<PersonInfo> resultPersonInfoList = new ArrayList<PersonInfo>();
        for (PersonInfo personInfo : personInfoList) {
            //System.out.println(firstName.equalsIgnoreCase(personInfo.getFirstName()));
            if (firstName.equals(personInfo.getFirstName())) {
                resultPersonInfoList.add(personInfo);
            }
        }

        System.out.println("Люди не найдены!");
        return resultPersonInfoList;
    }

    @Override
    public PersonInfo findPersonByEmail(List<PersonInfo> personInfoList, String email) {
        for (PersonInfo personInfo : personInfoList) {
            if (email.equalsIgnoreCase(personInfo.getEmail())) {
                return personInfo;
            }
        }

        System.out.println("Человек не найден");
        return null;
    }

    @Override
    public PersonInfo findPersonByPhoneNumber(List<PersonInfo> personInfoList, String phoneNumber) {
        for (PersonInfo personInfo : personInfoList) {
            if (phoneNumber.equalsIgnoreCase(personInfo.getPhoneNumber())) {
                return personInfo;
            }
        }

        System.out.println("Человек не найден");
        return null;
    }
}
