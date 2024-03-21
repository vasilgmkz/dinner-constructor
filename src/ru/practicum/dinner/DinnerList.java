package ru.practicum.dinner;
import java.util.HashMap;
import java.util.ArrayList;
public class DinnerList {
    HashMap<String, ArrayList<String>> dinnerList;

    DinnerList () {
        this.dinnerList = new HashMap<>();
    }

    void dinnerListMethod (String typeOfDish, String nameOfDish) {
        ArrayList<String> typeValues;
        if (dinnerList.get(typeOfDish) != null) {
            typeValues = dinnerList.get(typeOfDish);
        }
        else {
            typeValues = new ArrayList<>();
        }
        typeValues.add(nameOfDish);
        dinnerList.put(typeOfDish, typeValues);
    }

    boolean dinnerListKey (String nextItem) {
        return dinnerList.get(nextItem) != null;
    }
}

