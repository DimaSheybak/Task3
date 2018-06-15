package pkg3task.by.bntu.fitr.povt.ablehands.logic;

import by.bntu.fitr.povt.ablehands.logic.Logic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogicTest {

    static ArrayList<Integer> list1, list2, list3;

    @Before
    public void setUpClass() {
        list1 = new ArrayList();
        list2 = new ArrayList();
        for (int i = 0; i <list1.size()+list2.size(); i++) {
                list2.add(i);
            
        }
        list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        Collections.sort(list3);
    }

    @After
    public void tearDownClass() {
        list1 = null;
        list2 = null;
        list3 = null;
    }

    @Test(timeout = 1000)
    public void testConcatenations() {
        System.out.println("concatenations");
        Logic.concatenations(list1, list2);
        assertEquals(list1, list3);
    }

    @Test
    public void testConcatenations1() {

        System.out.println("concatenations");
        list1 = new ArrayList(Arrays.asList(1, 3, 4, 5));
        list2 = new ArrayList(Arrays.asList(2, 6, 7));
        list3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(list1);
        System.out.println(list2);
        Logic.concatenations(list1, list2);
        assertEquals(list1, list3);
        System.out.println(list1);
    }

}
