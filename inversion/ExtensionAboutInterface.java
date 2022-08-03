package inversion;
//这是对接口传递的扩展
public class ExtensionAboutInterface {
}

//方法1：通过接口传递实现依赖，即在一个接口中传入；另一个接口
interface IOpenAndClose{
    public void open(ITV tv);//抽象方法，用于接收接口
}
interface ITV{
    public void play();
}

//实现 ITV 接口
class TypeTV implements ITV{

    @Override
    public void play() {
        System.out.println("TypeTV is open");
    }
}

//通过接口传递实现依赖
class OpenAndClose implements IOpenAndClose{
    public void open(ITV tv){
        tv.play();
    }
}

//通过构造器方法实现依赖传递
interface IOpenAndClose1{
    public void open();//抽象方法，用于接收接口
}
class openAndClose1 implements  IOpenAndClose1{
    ITV tv;
    public openAndClose1(ITV tv){//在构造方法中传入接口
        this.tv = tv;
    }
    public void open(){
        tv.play();
    }
}

//通过一个方法 setter 将接口传入
interface IOpenAndClose2{
    public void open();//抽象方法，用于接收接口
    public void setter(ITV tv);
}
class openAndClose2 implements  IOpenAndClose1{
    ITV tv;
    public void open(){
        tv.play();
    }
    public void setter(ITV tv){
        this.tv = tv;
    }
}