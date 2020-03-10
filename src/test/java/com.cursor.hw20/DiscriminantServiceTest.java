package com.cursor.hw20;

import com.cursor.hw20.app.runner.Discriminant;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DiscriminantServiceTest {

    @Test
    void showDiscriminant() {

        long firstNum = 10;
        long secondNum = 10;
        long thirdNum = 10;

        int expectedResult = -300;

        //WHEN

        //GIVEN
        long realResult = Discriminant.discriminant(firstNum, secondNum, thirdNum);

        Assert.assertEquals(expectedResult, realResult);
    }

}
