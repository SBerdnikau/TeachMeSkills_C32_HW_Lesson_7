package com.teachmeskills.lessons7.task1.job_service.impl;

import com.teachmeskills.lessons7.task1.job_service.JobService;

public class Worker implements JobService {
    int idPosition;
    String namePositionAtJob;

    @Override
    public void showPositionAtJob() {
        System.out.printf("Nane position at job: %s\n",namePositionAtJob);
    }

    public Worker() {
        this.idPosition = 3;
        this.namePositionAtJob = "WORKER";
    }

}
