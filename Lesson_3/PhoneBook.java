package my_project;

import java.util.*;

public class PhoneBook {

//    Set<String> number1 = new HashSet<>("345896", "8933288900");
//    List<String> number2 = Arrays.asList("8921443423");
//    List<String> number3 = Arrays.asList("305872", "8921443767", "862534");
//    List<String> number4 = Arrays.asList("345896", "8921443423", "89245762010");
//    List<String> number5 = Arrays.asList("385086");
//    List<String> number6 = Arrays.asList("745096", "8920448423", "8-932-876-34-12");
//    List<String> number7 = Arrays.asList("76-98-90", "8 (921) 440-34-23");
//    List<String> number8 = Arrays.asList("34-58-96", "8921443423");
//    List<String> number9 = Arrays.asList("8-901-00-34-231");
//    List<String> number10 = Arrays.asList("77-77-77", "89222222222");
//
//    Map<String, List> phoneBook = Map.of("Иванов", number1, "Петров", number2, "Иванова", number3, "Сидорова", number4,
//            "Котов", number5, "Котова", number6, "Собакин", number7, "Собакина", number8,
//            "Рыбкин", number9, "Рыбкина", number10);

////    public void add(String a, String b) {
////        List<String> x = Arrays.asList(b);
////        phoneBook.put(a, x);
////    }
////
////    public String get (String surname) {
////        if (phoneBook.containsKey(surname)) {
////            return phoneBook.get(surname);
////        } else {
////            System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
////            return null;
////        }
//


    HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook (){
    this.phoneBook = new HashMap<>();
    }

    public void add (String surname, String number) {
        HashSet<String> book = phoneBook.getOrDefault(surname, new HashSet<>());
        book.add(number);
        phoneBook.put (surname, book);
    }

    public void getSurname (String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.println(phoneBook.get(surname));
        } else {
            System.out.println("Фамилия: " + surname + " не найдена!");
        }
    }
}




