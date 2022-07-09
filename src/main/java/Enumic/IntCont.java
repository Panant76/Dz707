package Enumic;

import Services.IOService;
import Services.IOServiceImpl;

import java.util.ArrayList;
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

    public void add(String str) {
        list.add(toInt(str));
        ioService.write(String.valueOf(list));
    }

    public void remove(String str) {
        list.remove(toInt(str));
    }

    public void print() {
        ioService.write(String.valueOf(list));
    }

    public int contains(String str) {
        return list.indexOf(toInt(str));
    }
    public void replace(String str){
        String[]arr=str.split(",");
        int indxA=toInt(arr[0]);
        int indxB=toInt(arr[1]);
        list.set(indxA,indxB);
    }

}

