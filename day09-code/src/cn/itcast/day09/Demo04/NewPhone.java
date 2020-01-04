package cn.itcast.day09.Demo04;

public class NewPhone extends Phone {

    @Override
    public void show(){
        super.show();
        System.out.println("姓名");
        System.out.println("头像");
    }


}
