package com.blackClover.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> doubledInts = new ArrayList<>();
        ListManipulations listMan = new ListManipulations();
        listMan.createList(integers);
        listMan.moveToList(integers,doubledInts);
    }
}
