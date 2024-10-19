package com.teachmeskills.lessons7.task1.job_service.impl;

import com.teachmeskills.lessons7.task1.job_service.JobService;

public class Director implements JobService {
    int idPosition;
    String namePositionAtJob;

    @Override
    public void showPositionAtJob() {
        System.out.printf("Nane position at job: %s\n",namePositionAtJob);
    }

    public Director() {
        this.idPosition = 1;
        this.namePositionAtJob = "DIRECTOR";
    }

}
