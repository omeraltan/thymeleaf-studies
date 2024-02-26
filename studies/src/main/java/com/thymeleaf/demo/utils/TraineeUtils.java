package com.thymeleaf.demo.utils;

import com.thymeleaf.demo.model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TraineeUtils {

    private static List<Trainee> trainees = new ArrayList<>();

    public static List<Trainee> buildStudents(){
        if (trainees.isEmpty()){
            Trainee trainee1 = new Trainee();
            trainee1.setId(1001);
            trainee1.setName("John Smith");
            trainee1.setGender('M');
            trainee1.setPercentage(Float.valueOf("80.45"));

            trainees.add(trainee1);

            Trainee trainee2 = new Trainee();
            trainee1.setId(1002);
            trainee1.setName("Jane Williams");
            trainee1.setGender('F');
            trainee1.setPercentage(Float.valueOf("60.25"));

            trainees.add(trainee2);

        }
        return trainees;
    }

}
