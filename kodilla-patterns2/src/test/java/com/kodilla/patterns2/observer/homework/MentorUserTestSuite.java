package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        CourseTask courseTask = new CourseTask("Stream");
        CourseTask courseTask1 = new CourseTask("Spring");
        MentorUser johnSmith = new MentorUser("John Smith");
        MentorUser ianVald = new MentorUser("Ian Vald");
        StudentUser michaelWiky = new StudentUser("Michael Wiky");
        StudentUser jesicaAlba = new StudentUser("Jesica Alba");
        StudentUser kateMaslow = new StudentUser("Kate Maslow");
        //When
        courseTask.registerObserver(johnSmith);
        courseTask1.registerObserver(ianVald);

        courseTask.addStudent(michaelWiky);
        courseTask.addStudent(jesicaAlba);
        courseTask1.addStudent(kateMaslow);
        //Then
        assertEquals(2,johnSmith.getUpdateCount());
        assertEquals(1, ianVald.getUpdateCount());

    }
}