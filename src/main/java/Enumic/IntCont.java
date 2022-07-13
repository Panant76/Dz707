package Enumic;

import Services.IOService;
import Services.IOServiceImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntCont {
    private IOService ioService;
    private List<Integer> list;

    public IntCont() {
        this.list = new ArrayList<>();
        this.ioService = new IOServiceImpl();
    }

    private int toInt(String str) {
        return Integer.parseInt(str);
    }

    public void addAll(String str) {
        String[] arr = str.split(",");
        List arList = Arrays.asList(arr);
        list.addAll(arList);
        ioService.write(String.valueOf(list));
    }

    public void add(String str) {
        ioService.write("ВВедите число");
        list.add(toInt(str));
        ioService.write(String.valueOf(list));
    }

    public void remove(String str) {
        list.remove(toInt(str));
    }

    public void print() {
        ioService.write(String.valueOf(list));
    }

    public void contains(String str) {
        if (list.contains(str)) {// работает только как str, как toInt(str) - не работает
            ioService.write("Число " + str + " найдено");
        } else {
            ioService.write("Число " + str + " не найдено");
        }
    }

    public void replace(String str) {
        String[] arr = str.split(",");
        int indxA = toInt(arr[0]);
        int indxB = toInt(arr[1]);
        list.set(indxA, indxB);
    }

}

