package com.teachmeskills.lessons7.task1.job_service;

import com.teachmeskills.lessons7.task1.job_service.impl.Accountant;
import com.teachmeskills.lessons7.task1.job_service.impl.Director;
import com.teachmeskills.lessons7.task1.job_service.impl.Worker;

import java.util.Scanner;

public class MenuAction {
    Accountant accountant;
    Director director;
    Worker worker;

    public void selectOperation(){
        accountant = new Accountant();
        director = new Director();
        worker = new Worker();
        String userAction;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please, select an code position at job (a number): 1-Director, 2-Accountant,"+
                    "3-Worker, or type 'exit' to quit");
            userAction = scanner.nextLine().trim().toLowerCase();

            if(!userAction.equals("exit")){
                switch (userAction){
                    case "1" : {
                        director.showPositionAtJob();
                        break;
                    }
                    case  "2" : {
                        accountant.showPositionAtJob();
                        break;
                    }
                    case "3" : {
                        worker.showPositionAtJob();
                    }
                    default:{
                        System.out.println("Incorrect operation is select. Please, try again ");
                    }
                }
            }
        }while (!userAction.equals("exit"));
    }
}
