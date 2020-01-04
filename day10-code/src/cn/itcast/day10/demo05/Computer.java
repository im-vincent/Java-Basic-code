package cn.itcast.day10.demo05;

public class Computer {

    public void powroff(){
        System.out.println("关闭电脑");
    }
    public void powron(){
        System.out.println("打开电脑");
    }

    public void usbDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }else if(usb instanceof  Keyboard){
            ((Keyboard) usb).tap();
        }

        usb.close();
    }

}
