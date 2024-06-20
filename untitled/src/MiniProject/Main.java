package MiniProject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>(10);
        { for (int i = 0; i < 10; i++) contacts.add(null);}

        while (true) {
            printMenu();
            int itemMenu = returnNumber();
            if (itemMenu == 1) {
                createContact(contacts);
            } else if (itemMenu == 2) {
                editContacts(contacts);
            } else if (itemMenu == 3) {
                deleteContact(contacts);
            } else if (itemMenu == 4) {
                break;
            } else {
                System.out.println("Вы выбрали несуществующий пункт меню.");
            }
            printContacts(contacts);
        }
    }
// Главное меню
    public static void printMenu() {
        System.out.println("""
                Для продолжения, введите цифру, соответствующую одному из пунктов меню.
                Меню:
                1. Новый контакт
                2. Редактировать список контактов
                3. Удалить контакт
                4. Выйти""");
    }
// Меню изменения списка контактов
    public static void menuEditContacts() {
        System.out.println("""
                Выберите действие, которое вы хотите совершить:
                1. Изменить контакт
                2. Поменять контакты местами
                """);
    }
// Меню изменения выбраного контакта
    public static void menuChangeContact() {
        System.out.println("""
                Выберите, что именно вы бы хотели изменить:
                1. Изменить имя контакта
                2. Изменить номер контакта
                3. Изменить и имя, и номер
                """);
    }
// Возвращает число
    public static int returnNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
// Возвращает строку
    public static String returnString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
// Печатает список контактов
    public static void printContacts(ArrayList<Contact> contacts) {
        System.out.println("Список контактов:");
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) != null) {
                System.out.printf("%d. %s %s\n", i+1, contacts.get(i).getName(), contacts.get(i).getValue());
            } else {
                System.out.println(i+1 + ". ...");
            }
        }
        System.out.println();
    }
// Создание нового контакта
    public static void createContact(ArrayList<Contact> contacts) {
        System.out.println("Введите имя контакта:");
        String name = returnString();
        System.out.println("Введите номер контакта:");
        String phone = returnString();
        int index = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) == null) {
                index = i;
                break;
            } else {
                System.out.println("Список контактов заполнен");
            }
        }
        if (!Objects.equals(name, "") && !Objects.equals(phone, "")) {
            contacts.set(index, new Contact(name, phone));
            System.out.println("Контакт успешно добален.");
        } else {
            System.out.println("Вы ввели некорректные данные.");
        }
        System.out.println();
    }
// Изменение списка контактов
    public static void editContacts(ArrayList<Contact> contacts) {
        menuEditContacts();
        int itemMenu = returnNumber();
        if (itemMenu == 1) {
            changeContact(contacts);
        } else if (itemMenu == 2) {
            replaceContact(contacts);
        } else {
            System.out.println("Вы выбрали несуществующий пункт меню.");
        }
    }
// Изменение выбранного контакта
    public static void changeContact(ArrayList<Contact> contacts) {
        System.out.println("Укажите номер контакта в списке, который вы хотели бы изменить.");
        int index = returnNumber() - 1;
        if (index >= 0 && index <= contacts.size() && contacts.get(index) != null) {
            menuChangeContact();
            int itemMenu = returnNumber();
            if (itemMenu == 1) {
                changeNameContact(contacts, index);
            } else if (itemMenu == 2) {
                changePhoneContact(contacts, index);
            } else if (itemMenu == 3) {
                changeFullContact(contacts, index);
            } else {
                System.out.println("Вы выбрали несуществующий пункт меню.");
            }
        } else {
            System.out.println("Такого контакта не существует.");
        }
        System.out.println();
    }
// Изменение имени контакта
    public static void changeNameContact(ArrayList<Contact> contacts, int index) {
        System.out.println("Укажите новое имя контакта:");
        String name = returnString();
        if (!Objects.equals(name, "")) {
            contacts.get(index).setName(name);
            System.out.println("Контакт успешно отредактирован.");
        } else {
            System.out.println("Вы ввели некорректные имя.");
        }
    }
// Изменение телефона контакта
public static void changePhoneContact(ArrayList<Contact> contacts, int index) {
        System.out.println("Укажите новый номер контакта:");
        String phone = returnString();
        if (!Objects.equals(phone, "")) {
            contacts.get(index).setValue(phone);
            System.out.println("Контакт успешно отредактирован.");
        } else {
            System.out.println("Вы ввели некорректные номер.");
        }
    }
// Изменение всех данных контакта
    public static void changeFullContact(ArrayList<Contact> contacts, int index) {
        System.out.println("Укажите новое имя контакта:");
        String name = returnString();
        System.out.println("Укажите новый номер контакта:");
        String phone = returnString();
        if (!Objects.equals(name, "") && !Objects.equals(phone, "")) {
            contacts.get(index).setName(name);
            contacts.get(index).setValue(phone);
            System.out.println("Контакт успешно отредактирован.");
        } else {
            System.out.println("Вы ввели некорректные данные.");
        }
    }
// Поменять контакты местами
    public static void replaceContact(ArrayList<Contact> contacts) {
        System.out.println("Укажите номера контактов из списка, которые вы хотите поменять местами:");
        int index_1 = returnNumber() - 1;
        int index_2 = returnNumber() - 1;
        if (index_1 >= 0 && index_1 <= contacts.size() && contacts.get(index_1) != null &&
                index_2 >= 0 && index_2 <= contacts.size() && contacts.get(index_2) != null && index_1 != index_2) {
            Contact temp = contacts.get(index_1);
            contacts.set(index_1, contacts.get(index_2));
            contacts.set(index_2, temp);
            System.out.println("Список контактов успешно изменен");
        } else {
            System.out.println("Введены некорректные значения.");
        }
        System.out.println();
    }
// Удаляет контакт
    public static void deleteContact(ArrayList<Contact> contacts) {
        System.out.println("Укажите номер контакта в списке, который вы хотели бы удалить.");
        int index = returnNumber() - 1;
        if (index >= 0 && index <= contacts.size() && contacts.get(index) != null) {
            contacts.remove(index);
            contacts.add(null);
            System.out.println("Контакт успешно удален.");
        } else {
            System.out.println("Такого контакта не существует.");
        }
        System.out.println();
    }
}
