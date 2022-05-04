package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тесты проверки корректности работы методов класса Feline
 *
 * @see Feline
 */
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Animal animal;

    @Test
    public void eatMeatMethodPositiveResult() throws Exception {
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = animal.getFood("Хищник");
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
