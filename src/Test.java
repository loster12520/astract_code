import base.Bit;
import base.BitUtils;

/**
 * 本类为测试类，用于测试代码，以test_开头，static的方法即为对应类的测试代码
 */
public class Test {
    public static void test_base_Bit(){
        Bit bit=new Bit(true);
        System.out.println(BitUtils.equals(bit, BitUtils.True));
        System.out.println(BitUtils.equals(bit, BitUtils.False));
        System.out.println();
        System.out.println(bit.and(BitUtils.True));
        System.out.println(bit.and(BitUtils.False));
        System.out.println();
        System.out.println(bit.or(BitUtils.True));
        System.out.println(bit.or(BitUtils.False));
        System.out.println();
        System.out.println(BitUtils.equals(bit.negation(), BitUtils.True));
        System.out.println();
        System.out.println();
        bit=new Bit(false);
        System.out.println(BitUtils.equals(bit, BitUtils.True));
        System.out.println(BitUtils.equals(bit, BitUtils.False));
        System.out.println();
        System.out.println(bit.and(BitUtils.True));
        System.out.println(bit.and(BitUtils.False));
        System.out.println();
        System.out.println(bit.or(BitUtils.True));
        System.out.println(bit.or(BitUtils.False));
        System.out.println();
        System.out.println(BitUtils.equals(bit.negation(), BitUtils.True));
    }
    public static void main(String[] args) {
    }
}