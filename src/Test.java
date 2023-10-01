import base.Bit;
import base.BiteUtils;

/**
 * 本类为测试类，用于测试代码，以test_开头，static的方法即为对应类的测试代码
 */
public class Test {
    public static void test_base_Bit(){
        Bit bit=new Bit(true);
        System.out.println(BiteUtils.equals(bit,BiteUtils.True));
        System.out.println(BiteUtils.equals(bit,BiteUtils.False));
        System.out.println();
        System.out.println(bit.and(BiteUtils.True));
        System.out.println(bit.and(BiteUtils.False));
        System.out.println();
        System.out.println(bit.or(BiteUtils.True));
        System.out.println(bit.or(BiteUtils.False));
        System.out.println();
        System.out.println(BiteUtils.equals(bit.negation(),BiteUtils.True));
        System.out.println();
        System.out.println();
        bit=new Bit(false);
        System.out.println(BiteUtils.equals(bit,BiteUtils.True));
        System.out.println(BiteUtils.equals(bit,BiteUtils.False));
        System.out.println();
        System.out.println(bit.and(BiteUtils.True));
        System.out.println(bit.and(BiteUtils.False));
        System.out.println();
        System.out.println(bit.or(BiteUtils.True));
        System.out.println(bit.or(BiteUtils.False));
        System.out.println();
        System.out.println(BiteUtils.equals(bit.negation(),BiteUtils.True));
    }
    public static void main(String[] args) {
    }
}