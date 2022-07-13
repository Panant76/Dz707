package Services;

import Enumic.Buttone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService {
    private BufferedReader reader;

    public IOServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public Buttone read() {
        try {
            String str = reader.readLine();
            return Buttone.values()[Integer.parseInt(str)];
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            write("Произошла ошибка, повторите ввод");
            return read();
        }
    }

    public String readStr() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            write("Произошла ошибка, повторите ввод");
            return readStr();
        }
    }

    public void write(String msg) {
        System.out.println(msg);
    }
}
