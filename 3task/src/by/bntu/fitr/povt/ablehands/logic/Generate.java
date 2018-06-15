package by.bntu.fitr.povt.ablehands.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generate {
    public static List<Integer> generate(int amount, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(amount);
        for(int i = 0; i < amount; i++) {
            list.add(random.nextInt(max));
        }
        return list;
    }
}
