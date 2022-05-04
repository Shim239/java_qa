package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты проверки корректности работы методов класса Animal
 *
 * @see Animal
 */
public class AnimalTest {

    @Test(expected = Exception.class)
    public void getFoodMethodExceptionBranch() throws Exception {
        Animal animal = new Animal();
        animal.getFood("qwerty");
    }

    @Test
    public void getFamilyPositiveResult() {
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}
