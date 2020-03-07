package com.cursor.hw20.service;

import com.cursor.hw20.app.runner.Discriminant;
import com.cursor.hw20.numbers.DiscriminantNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DiscriminantService {

    @GetMapping("/method")
    @Autowired
    public static void showDiscriminant(@RequestBody DiscriminantNumbers numbers) {

        long discriminantResult = Discriminant.discriminant(numbers.firstNum, numbers.secondNum, numbers.thirdNum);

        if (discriminantResult > 0) {
            System.out.println("Discriminant is " + discriminantResult + " which is Positive");
            System.out.println("Hence Two Solutions");
        } else if (discriminantResult == 0) {
            System.out.println("Discriminant is " + discriminantResult + " which is Zero");
            System.out.println("Hence One Solution");
        } else {
            System.out.println("Discriminant is " + discriminantResult + " which is Negative");
            System.out.println("Hence No Real Solutions");
        }
    }
}
