package cn.itcast.day10.demo05;

public class Demo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powron();

        USB usbMouse = new Mouse();
        computer.usbDevice(usbMouse);
        System.out.println("==============");
        USB usbKeyboard = new Keyboard();
        computer.usbDevice(usbKeyboard);

        computer.powroff();
    }

}
