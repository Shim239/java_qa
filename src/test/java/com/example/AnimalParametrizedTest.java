package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Параметризованные тесты проверки корректности работы методов класса Animal
 *
 * @see Animal
 */
@RunWith(Parameterized.class)
public class AnimalParametrizedTest {

    private final String animalKind;
    private final List<String> animalFood;

    public AnimalParametrizedTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFood() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodMethodDefiniteAnimalKindBranches() throws Exception {
        Animal animal = new Animal();
        assertEquals(animal.getFood(animalKind), animalFood);
    }
}
