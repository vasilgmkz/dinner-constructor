package ru.practicum.dinner;
import java.util.HashMap;
import java.util.ArrayList;
public class DinnerList {
    HashMap<String, ArrayList<String>> dinnerList;

    DinnerList () {
        this.dinnerList = new HashMap<>();
    }

    void dinnerListMethod (String typeOfDish, String nameOfDish) {
        if (dinnerList.containsKey(typeOfDish)) {
            ArrayList<String> typeValues = dinnerList.get(typeOfDish);
            typeValues.add(nameOfDish);
            dinnerList.put(typeOfDish, typeValues);
        }
        else {
            ArrayList<String> typeValues = new ArrayList<>();
            typeValues.add(nameOfDish);
            dinnerList.put(typeOfDish, typeValues);
        }
    }

    boolean dinnerListKey (String nextItem) {
        if (dinnerList.containsKey(nextItem)) {
            return true;
        }
        else {
            return false;
        }
    }
}

