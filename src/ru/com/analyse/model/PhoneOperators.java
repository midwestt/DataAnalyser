package ru.com.analyse.model;

import java.util.HashMap;
import java.util.Map;

public enum PhoneOperators {
    MTC,
    BEELINE,
    MEGAFON,
    TELE2,
    UNDEFINED;

    public PhoneOperators findPhoneOperator(String phoneNumber) {
        // Коды телефонных операторов
        Map<PhoneOperators, String[]> phoneOperatorsCodes = new HashMap<PhoneOperators, String[]>() {{
            put(MTC, new String[]{"+7901", "+7902", "+7904", "+7908", "+7917", "+7919", "+7950", "+7958",
                    "+7986", "+7987", "+7989"});
            put(BEELINE, new String[]{"+7903", "+7905", "+7906", "+7909", "+7960", "+7961", "+7962", "+7963",
                    "+7964", "+7965", "+7967", "+7969"});
            put(MEGAFON, new String[]{"+7927", "+7929", "+7937", "+7939", "+7999"});
            put(TELE2, new String[]{"+7951", "+7996"});
        }};

        PhoneOperators phoneOperator = PhoneOperators.MTC;
        for (PhoneOperators key : phoneOperatorsCodes.keySet()) {
            if (phoneNumber == null) {
                return UNDEFINED;
            }
            for (String phoneCode : phoneOperatorsCodes.get(key)) {
                if (phoneNumber.startsWith(phoneCode)) {
                    return key;
                }
            }
        }

        return UNDEFINED;
    }
}
