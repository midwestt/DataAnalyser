package ru.com.analyse.data;

import ru.com.analyse.model.OS;
import ru.com.analyse.model.PersonInfo;
import ru.com.analyse.model.PhoneOperators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация {@link FileStatistics}
 */

public class FileStatisticsImpl implements FileStatistics {
    public FileStatisticsImpl() {
        firstNamesStatistic = new HashMap<String, Integer>();
        phoneOperatorsStatistic = new HashMap<PhoneOperators, Integer>();
        osStatistic = new HashMap<OS, Integer>();
    }
    @Override
    public void showAllStatistics(List<PersonInfo> personInfoList) {
        showFirstNameStatistics(personInfoList);
        showPhoneOperatorStatistics(personInfoList);
        showOSStatistics(personInfoList);
    }
    @Override
    public void showFirstNameStatistics(List<PersonInfo> personInfoList) {
        System.out.println("**************Статистика имен**************");
        if (!firstNamesStatistic.isEmpty()) {
            for (String key : firstNamesStatistic.keySet()) {
                System.out.println(key + " - " + firstNamesStatistic.get(key));
            }
            return;
        }

        for (PersonInfo personInfo : personInfoList) {
            int count = firstNamesStatistic.containsKey(personInfo.getFirstName())
                    ? firstNamesStatistic.get(personInfo.getFirstName())
                    : 0;

            firstNamesStatistic.put(personInfo.getFirstName(), ++count);
        }

        for (String key : firstNamesStatistic.keySet()) {
            System.out.println(key + " - " + firstNamesStatistic.get(key));
        }
    }
    @Override
    public void showPhoneOperatorStatistics(List<PersonInfo> personInfoList) {
        System.out.println("**************Статистика телефонных операторов**************");
        if (!phoneOperatorsStatistic.isEmpty()) {
            for (PhoneOperators key : phoneOperatorsStatistic.keySet()) {
                System.out.println(key.name() + " - " + phoneOperatorsStatistic.get(key));
            }
            return;
        }

        for (PersonInfo personInfo : personInfoList) {
            PhoneOperators phoneOperators = PhoneOperators.MTC;
            phoneOperators = phoneOperators.findPhoneOperator(personInfo.getPhoneNumber());
            int count = phoneOperatorsStatistic.containsKey(phoneOperators)
                    ? phoneOperatorsStatistic.get(phoneOperators)
                    : 0;

            phoneOperatorsStatistic.put(phoneOperators, ++count);
        }

        for (PhoneOperators key : phoneOperatorsStatistic.keySet()) {
            System.out.println(key.name() + " - " + phoneOperatorsStatistic.get(key));
        }
    }

    @Override
    public void showOSStatistics(List<PersonInfo> personInfoList) {
        System.out.println("**************Статистика по операционным системам**************");
        if (!osStatistic.isEmpty()) {
            for (OS key : osStatistic.keySet()) {
                System.out.println(key.name() + " - " + osStatistic.get(key));
            }
            return;
        }

        for (PersonInfo personInfo : personInfoList) {
            OS os = OS.UNDEFINED;
            String currentOS = personInfo.getUserAgent();
            if (currentOS == null) {
                os = OS.UNDEFINED;
            }
            else if (currentOS.toUpperCase().contains(OS.ANDROID.name())) {
                os = OS.ANDROID;
            }
            else if (currentOS.toUpperCase().contains(OS.WINDOWS.name())) {
                os = OS.WINDOWS;
            }
            else if (currentOS.toUpperCase().contains(OS.IOS.name())) {
                os = OS.IOS;
            }

            int count = osStatistic.containsKey(os)
                    ? osStatistic.get(os)
                    : 0;

            osStatistic.put(os, ++count);
        }

        for (OS key: osStatistic.keySet()) {
            System.out.println(key.name() + " - " + osStatistic.get(key));
        }
    }

    Map<String, Integer> firstNamesStatistic;
    Map<PhoneOperators, Integer> phoneOperatorsStatistic;
    Map<OS, Integer> osStatistic;
}
