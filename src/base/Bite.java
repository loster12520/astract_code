package base;

/**
 * 这是一个用于形容比特的类，请注意，本项目仅有这里还有对应这个类的构造函数会使用到除了函数引用之外的计算符号，也就是说，除了这里之外的所有的计算符号都会使用函数调用来代替
 * 也就是说，我需要重构半个java库
 * @author loster12520
 */
public class Bite {
    private boolean value;

    public Bite(boolean value) {
        this.value = value;
    }
    public Bite(int value) {
        this.value = value==0 ? false : true;
    }
    public Bite equals(Bite b){
        return new Bite(b.value==value);
    }
    public Bite negation(){
        return new Bite(!value);
    }
}
