package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "LIST_1";
    private static final String DESCRIPTION = "TEST";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<TaskList> readTasksLists = taskListDao.findByListName(NAME);
        int foundId = readTasksLists.get(0).getId();
        //Then
        Assert.assertEquals(id, foundId);

        //Clean up
        taskListDao.delete(id);

    }
}
