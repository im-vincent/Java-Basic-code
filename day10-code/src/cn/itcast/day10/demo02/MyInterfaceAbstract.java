package cn.itcast.day10.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {

    @Override
    public void MethodA() {

    }

    @Override
    public void Method() {
        System.out.println("对冲突方法进行覆盖重写");
    }

    @Override
    public void MethodB() {

    }


}
