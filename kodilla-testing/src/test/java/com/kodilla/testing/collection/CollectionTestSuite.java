package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertTrue;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given

        ArrayList<Integer> simpleList = new ArrayList<>();
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(2);
        scoreList.add(4);
        //When
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = numbersExterminator.exterminate(simpleList);
        //Then
        System.out.println("Test na liście zawierającej elementy: " + simpleList);
        System.out.println("Poprawna lista zawiera elementy: " + scoreList);
        System.out.println("Stworzona nowa lista z elementów parzystych: " + result);
        Assert.assertEquals(scoreList, result);


    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        System.out.println("Test na pustej liście");
        ArrayList<Integer> simpleList2 = new ArrayList<>();
        ArrayList<Integer> scoreList2 = new ArrayList<>();

        //When
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = numbersExterminator.exterminate(simpleList2);
        //Then
        System.out.println("Lista wejściowa: " + simpleList2);
        System.out.println("Lista wyjściowa: " + result);
        Assert.assertEquals(scoreList2, result);
    }

}

