package com.cursor.hw20.app.runner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/discriminat")
@RestController
public class Discriminant {

    public static long discriminant(long firstNum, long secondNum, long thirdNum) {

        return (int) Math.pow(secondNum, 2) - (4 * firstNum * thirdNum);
    }
}
