package ProcessMananger;

import Enumic.Buttone;
import Enumic.IntCont;
import Services.IOService;
import Services.IOServiceImpl;



public class Pm {
    private IOService ioService;
    private IntCont intCont;

    public Pm() {
        this.ioService = new IOServiceImpl();
        this.intCont = new IntCont();
    }
    public void start(){
        ioService.write("ВВедите набор чисел");
        String str = ioService.readStr();
        run();
    }

    public void run() {
        startMessage();
        operation();
    }

    private void startMessage() {
        ioService.write("1. Добавить элемент в список");
        ioService.write("2. Удалить элемент из списка");
        ioService.write("3. Показать содержимое списка");
        ioService.write("4. Проверить есть ли значение в списке");
        ioService.write("5. Заменить значение в списке");
    }

    private void operation() {
        int operation = ioService.read();
        String str = ioService.readStr();
        switch (operation) {
            case 0:
                break;
            case 1:
                intCont.add(str);
                run();
                break;
            case 2:
                intCont.remove(str);
                run();
                break;
            case 3:
                intCont.print();
                run();
                break;
            case 4:
                intCont.contains(str);run();
                break;
            case 5:
                intCont.replace(str);
                break;
            default:
                ioService.write("Не известная операция");
                run();

        }
    }


}