package MiniProject;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        while (true) {
            printMenu();
            int itemMenu = selectedItemMenu();
            if (itemMenu == 1) {
                createContact(contacts);
            } else if (itemMenu == 2) {
                editContact(contacts);
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

    public static void printMenu() {
        System.out.println("Для продолжения, введите цифру, соответствующую одному из пунктов меню.");
        System.out.println("Меню:");
        System.out.println("1. Новый контакт");
        System.out.println("2. Редактировать контакт");
        System.out.println("3. Удалить контакт");
        System.out.println("4. Выйти");
    }

    public static int selectedItemMenu() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void printContacts(Contact[] contacts) {
        System.out.println("Список контактов:");
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.printf("%d. %s %s\n", i+1, contacts[i].getName(), contacts[i].getValue());
            } else {
                System.out.println(i+1 + ". ...");
            }
        }
        System.out.println();
    }

    public static void createContact(Contact[] contacts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String name = sc.nextLine();
        System.out.println("Введите номер контакта:");
        String phone = sc.nextLine();
        int index = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                index = i;
                break;
            }
        }
        if (!Objects.equals(name, "") && !Objects.equals(phone, "")) {
            contacts[index] = new Contact(name, phone);
            System.out.println("Контакт успешно добален.");
        } else {
            System.out.println("Вы ввели некорректные данные.");
        }
        System.out.println();
    }

    public static void editContact(Contact[] contacts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите номер контакта в списке, который вы хотели бы изменить.");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if (index >= 0 && index <= contacts.length && contacts[index] != null) {
            System.out.println("Укажите новое имя контакта:");
            String name = sc.nextLine();
            System.out.println("Укажите новый номер контакта:");
            String phone = sc.nextLine();
            if (!Objects.equals(name, "") && !Objects.equals(phone, "")) {
                contacts[index].setName(name);
                contacts[index].setValue(phone);
                System.out.println("Контакт успешно отредактирован.");
            } else {
                System.out.println("Вы ввели некорректные данные.");
            }
        } else {
            System.out.println("Такого контакта не существует.");
        }
        System.out.println();
    }

    public static void deleteContact(Contact[] contacts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите номер контакта в списке, который вы хотели бы удалить.");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index <= contacts.length && contacts[index] != null) {
            contacts[index] = null;
            System.out.println("Контакт успешно удален.");
        } else {
            System.out.println("Такого контакта не существует.");
        }
        System.out.println();
    }
}
