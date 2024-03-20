package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class DinnerConstructor {

    Random random;

    DinnerConstructor() {
        this.random = new Random();
    }

    void dinnerConstructorMethod(int numberOfCombos, ArrayList<String> typesFoodCombos,
                                 HashMap<String, ArrayList<String>> dinnerList) {
        for (int i = 1; i <= numberOfCombos; i++) {
            System.out.println("Комбо " + i);
            ArrayList<String> combos = new ArrayList<>();
            for (String typesFoodCombo : typesFoodCombos) {
                ArrayList<String> dinnerListType = dinnerList.get(typesFoodCombo);
                combos.add(dinnerListType.get(random.nextInt(dinnerListType.size())));
            }
            System.out.println(combos);
        }
    }
}
