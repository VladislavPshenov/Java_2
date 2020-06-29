package my_project;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1.");

        List<String> states = Arrays.asList("США", "Россия", "Китай", "Мексика", "Италия", "Япония",
                "Китай", "Франция", "США", "Мексика", "Франция", "Германия", "Япония");

        Set<String> uniqueWords = new HashSet<String>(states);

        System.out.println("Первоначальный массив:");
        System.out.println(states);
        System.out.println("Уникальные слова:");
        System.out.println(uniqueWords);
        System.out.println("СКолько раз встречается каждое слово:");
        for (String count : uniqueWords) {
            System.out.print(count + ": " + Collections.frequency(states, count) + "; ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Задание 2.");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "8 (900) 23-34-245, 234-234");
        phoneBook.add("Сидоров","4345345");
        phoneBook.add("Петров", "89123453450");
        phoneBook.add("Петров", "8 (922)-77-77-777");
        phoneBook.add("Иванов", "50-40-10");

        phoneBook.getSurname ("Brown");
        phoneBook.getSurname("Петров");
        phoneBook.getSurname("Иванов");








    }
}