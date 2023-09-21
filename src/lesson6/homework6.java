package lesson6;
//      Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут
//повторяющиеся имена с разными телефонами, их необходимо считать,
//как одного человека с разными телефонами. Вывод должен быть отсортирован
//по убыванию числа телефонов.


import lesson6.phoneBook;

public class homework6 {
    public static void main(String[] args) {
        lesson6.phoneBook phoneBook = new phoneBook();
        phoneBook.add("Алиса", "123456789" );
        phoneBook.add("Иван", "987654321");
        phoneBook.add("Владимир", "456789123");
        phoneBook.add("Давид", "321654987");
        phoneBook.add("Алексадра", "789123456");
        phoneBook.add("Сергей", "654987321");
        phoneBook.add("Иван", "234567891");
        phoneBook.add("Пётр", "876543219");
        phoneBook.add("Александра", "345678912");
        phoneBook.add("Андрей", "432165498");
        phoneBook.add("Степан", "876543219");
        phoneBook.add("Сергей", "234567891");
        phoneBook.add("Владимир", "654987321");
        phoneBook.add("Владимир", "435455423");
        phoneBook.add("Викторя", "789123446");
        phoneBook.add("Давид", "321654987");
        phoneBook.add("Виталий", "321654987");
        phoneBook.add("Виталий", "321654987");
        System.out.println(phoneBook.getPhoneNum("654987321"));
        System.out.println(phoneBook.getByName("Давид"));
        System.out.println(phoneBook.getAll());
    }
}