package com.teachmeskills.lessons7.task2;

import com.teachmeskills.lessons7.task2.figure.Circle;
import com.teachmeskills.lessons7.task2.figure.Figure;
import com.teachmeskills.lessons7.task2.figure.Rectangle;
import com.teachmeskills.lessons7.task2.figure.Triangle;
import com.teachmeskills.lessons7.task2.figure_service.FigureOption;

/**
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
 * Создать массив из 5 разных фигур.
 * Пройтись циклом по массиву и вывести информацию о каждой фигуре.
 * Вывести на экран сумму периметров всех фигур в массиве.
 */
public class ApplicationRunner {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Rectangle rectangle1 =  new Rectangle(4,2);
        Triangle triangle1 = new Triangle(6,5,2.2);
        Circle circle2 = new Circle(7.8);
        Triangle triangle2 = new Triangle(18,15, 8);

        Figure[] figures = {circle1, rectangle1, triangle1, circle2, triangle2};

        FigureOption.showInfoAboutFigure(figures);

        FigureOption.showSumAllPerimeter(figures);
    }

}
