package ua.trainings.utils;

public interface RegexConstants {
    String NAME_REGEX = "^[A-Z][a-z]+\\s[A-Z]$";
    String NICKNAME_REGEX = "^[A-Za-z]\\w+";
    String MOBILEPHONE_REGEX = "\\+?\\d{3}?(\\(?\\d{3}\\)?)?((\\s|-)?\\d{2,4}){0,4}";
    String HOMEPHONE_REGEX = "^(\\d+)((\\s|-)\\d+)*";
    String EMAIL_REGEX = "^([A-za-z]+)((\\.|\\+)?\\w+)*@[a-z]+(\\.\\w+)?\\.(ua|com|net|ru)$";
}
