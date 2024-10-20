package com.teachmeskills.lessons7.task1.job_position.impl;

import com.teachmeskills.lessons7.task1.job_position.JobService;

public class Accountant implements JobService {
    String namePositionAtJob;

    @Override
    public void showPositionAtJob() {
        System.out.printf("Name position at job: %s\n",namePositionAtJob);
    }

    public Accountant() {
        this.namePositionAtJob = "ACCOUNTANT";
    }

}
