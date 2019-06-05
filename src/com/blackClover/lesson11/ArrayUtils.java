package com.blackClover.lesson11;

import java.util.List;

public class ArrayUtils {

    public static <T> void checkForExistance(List<T> list, T value) {
        if (list.contains(value)) {
            System.out.println("Item exists in the list");
        } else {
            System.out.println("Item does not exist in list");
        }
    }
}
