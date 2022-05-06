package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тесты проверки корректности работы методов класса Feline
 *
 * @see Feline
 */
public class FelineTest {

    @Test
    public void eatMeatMethodPositiveResult() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyMethodPositiveResult() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensMethodPositiveResult() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensMethodWithKittenCount() {
        Feline feline = new Feline();
        int kittensCount = 1;
        int actualResult = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actualResult);
    }
}
