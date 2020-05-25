package model;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static final String ALL = "all";

    public static List<String> getResultNames(List<String> names, String name) {
        if (name.equals(ALL)) {
            return new ArrayList<>(names);
        }
        List<String> resultNames = new ArrayList<>();
        resultNames.add(name);
        return resultNames;
    }

    public static List<Integer> getResultNameNumbers(List<String> names, List<String> resultNames) {
        List<Integer> nameNumbers = new ArrayList<>();
        for (String name : resultNames) {
            int nameNumber = names.indexOf(name);
            nameNumbers.add(nameNumber);
        }
        return nameNumbers;
    }

    public static List<Integer> getMatchNumbers(List<Line> ladder, List<Integer> nameNumbers) {
        return PlayLadder.getMatchNumbers(ladder, nameNumbers);
    }

    public static List<String> getMatchItems(List<String> items, List<Integer> matchNumbers) {
        return Result.getMatchItems(items, matchNumbers);
    }
}
