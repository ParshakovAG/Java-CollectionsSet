package practice;

import java.util.*;

public class EmailList {
    private static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    Collection<String> setOfEmails = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод

        email = email.toLowerCase();
        if (email.matches("\\D+@\\D+\\.\\D+")) {
            setOfEmails.add(email);
            System.out.println(email + " добавлен");
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        ArrayList<String> arrayListOfEmails = new ArrayList<>(setOfEmails);

        System.out.println(arrayListOfEmails);
        return arrayListOfEmails;
    }

}
