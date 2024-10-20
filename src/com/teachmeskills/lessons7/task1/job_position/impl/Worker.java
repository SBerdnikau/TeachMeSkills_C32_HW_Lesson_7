package com.teachmeskills.lessons7.task1.job_position.impl;

import com.teachmeskills.lessons7.task1.job_position.JobService;

public class Worker implements JobService {

    String namePositionAtJob;

    public Worker() {
        this.namePositionAtJob = "WORKER";
    }

    @Override
    public void showPositionAtJob() {
        System.out.printf("Name position at job: %s\n",namePositionAtJob);
    }

}
