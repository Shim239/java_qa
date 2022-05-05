package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тесты проверки корректности работы методов класса Lion
 *
 * @see Lion
 */
public class LionTest {

    @Mock
    Feline mockFeline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittensMethodPositiveResult() throws Exception {
        int expectedResult = 1;
        Lion lion = new Lion("Самец", mockFeline);
        Mockito.when(mockFeline.getKittens()).thenReturn(expectedResult);
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodMethodPositiveResult() throws Exception {
        Lion lion = new Lion("Самка", mockFeline);
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = List.of("Животные", "Птицы", "Рыба");
        List<String> expectedResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = Exception.class)
    public void createLionWithMissingSexExpectException() throws Exception {
        Lion lion = new Lion("qwerty", mockFeline);
    }
}
