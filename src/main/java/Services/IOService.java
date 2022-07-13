package Services;

import Enumic.Buttone;

public interface IOService {
    Buttone read();
    String readStr();

    void write(String msg);

}
