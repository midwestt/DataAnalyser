package ru.com.analyse.ui;

import ru.com.analyse.ServiceFactory;

import java.util.Scanner;

public class Menu {
    private final PersonAdapter personAdapter;
    private boolean isActive = true;

    public Menu() {
        this.personAdapter = ServiceFactory.createAdapter();
    }

    public void start() {
        while (isActive) {
            showOptions();
        }
    }

    public void showOptions() {
        System.out.println("******************************************");
        System.out.println("Выберите действие: \n");
        System.out.println("[1] - Показать всех людей");
        System.out.println("[2] - Показать всю статистику");
        System.out.println("[3] - Статистика по именам");
        System.out.println("[4] - Статистика по телефонным операторам");
        System.out.println("[5] - Статистика по операционным системам");
        System.out.println("[q] - Выход");

        makeChoice();
    }

    private void makeChoice() {
        System.out.print("Введите выбор: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        System.out.println();
        if (choice.equals("1")) {
            personAdapter.showAllPersons();
        }
        else if (choice.equals("2")) {
            personAdapter.showAllStatistics();
        }
        else if (choice.equals("3")) {
            personAdapter.showFirstNameStatistics();
        }
        else if (choice.equals("4")) {
            personAdapter.showPhoneOperatorStatistics();
        }
        else if (choice.equals("5")) {
            personAdapter.showOSStatistics();
        }
        else if (choice.equalsIgnoreCase("q")) {
            isActive = false;
        }
    }
}
