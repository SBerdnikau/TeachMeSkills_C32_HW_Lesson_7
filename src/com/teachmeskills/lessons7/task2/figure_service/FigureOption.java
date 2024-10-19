package com.teachmeskills.lessons7.task2.figure_service;

import com.teachmeskills.lessons7.task2.figure.Figure;

public class FigureOption {

    public  static void showInfoAboutFigure(Figure[] figures){
        for (Figure figure : figures) {
            System.out.printf("Area of %s : %.2f\n",figure.name ,figure.getAreaOfFigure());
            System.out.printf("Perimeter of %s : %.2f\n",figure.name,  figure.getPerimeterOfFigure());
            System.out.println();
        }
    }

    public static void showSumAllPerimeter(Figure[] figures) {
        double sumPerimeterAllFigure = 0;
        for (Figure figure : figures) {
            sumPerimeterAllFigure += figure.getPerimeterOfFigure();
        }
        System.out.printf("Sum of all perimeters: %.2f\n", sumPerimeterAllFigure);
    }

}
