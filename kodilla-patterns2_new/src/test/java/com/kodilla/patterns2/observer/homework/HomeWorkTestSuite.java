package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeWorkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkTask agaHomeworkTasks = new KodillaUserHomeworkTasks();
        HomeworkTask paulinaHomeworkTasks = new KodillaUserHomeworkTasks();
        HomeworkTask adamHomeworkTasks = new KodillaUserHomeworkTasks();
        Mentor malgorzataKozlowska = new Mentor("Magorzata Kozlowska");
        Mentor adrianPazucha = new Mentor("Adrian Pazucha");
        agaHomeworkTasks.registerObserverTask(malgorzataKozlowska);
        paulinaHomeworkTasks.registerObserverTask(adrianPazucha);
        adamHomeworkTasks.registerObserverTask(adrianPazucha);
        //When
        agaHomeworkTasks.addTask("Create architecture of your api");
        paulinaHomeworkTasks.addTask("Create application controller");
        agaHomeworkTasks.addTask("Use design patterns in your project");
        adamHomeworkTasks.addTask("Create domain objects");
        //Then
        assertEquals(2,adrianPazucha.getUpdate());
        assertEquals(2,malgorzataKozlowska.getUpdate());
    }
}
