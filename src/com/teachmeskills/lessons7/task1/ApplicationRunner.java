package com.teachmeskills.lessons7.task1;

import com.teachmeskills.lessons7.task1.job_service.MenuAction;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        MenuAction menu = new MenuAction();
        menu.selectOperation();
    }
}
