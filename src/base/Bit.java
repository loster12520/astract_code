package base;

/**
 * 这是一个用于形容比特的类，请注意，本项目仅有这里还有对应这个类的构造函数会使用到除了函数引用之外的计算符号，也就是说，除了这里之外的所有的计算符号都会使用函数调用来代替
 * 也就是说，我需要重构半个java库
 * @author loster12520
 */
public class Bit {
    /**
     * 储存数值的位置
     */
    private boolean value;

    /**
     * 使用布尔变量创建bit值
     * @param value  传入布尔值
     */
    public Bit(boolean value) {
        this.value = value;
    }

    /**
     * 使用int值创建bit值
     * @param value  传入数字
     */
    public Bit(int value) {
        this.value = value==0 ? false : true;
    }

    /**
     * 判断是否相等
     * @param b  需要与其对比的bit值
     * @return  返回是否相等
     */
    public Bit equals(Bit b){
        return new Bit(b.value==value);
    }

    /**
     * 取反
     * @return  返回取反之后的值
     */
    public Bit negation(){
        return new Bit(!value);
    }

    /**
     * 与
     * @param bit  操作值
     * @return  返回结果
     */
    public Bit and(Bit bit){
        return new Bit(value?bit.value:false);
    }

    /**
     * 或
     * @param bit  操作值
     * @return  返回结果
     */
    public Bit or(Bit bit){
        return new Bit(value?true: bit.value);
    }

    /**
     * 获取输出样式
     * @return
     */
    public String toString(){
        return ""+(value ? "TRUE" : "FALSE");
    }
}
