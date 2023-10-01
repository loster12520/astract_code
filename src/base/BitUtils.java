package base;

/**
 * 关于Bit.java的工具类，以后看到类后缀是-Utils就是对应类的工具类，里面的所有方法都应该是static的
 */
public class BitUtils {
    /**
     * True的值
     */
    public static final Bit True=new Bit(true);
    /**
     * False的值
     */
    public static final Bit False=new Bit(false);

    /**
     * 判断是否相等，是Bit中的equals方法的替代品，只不过是不同写法罢了
     * @param bit1  操作值1
     * @param bit2  操作值2
     * @return  返回结果
     */
    public static Bit equals(Bit bit1,Bit bit2){
        return bit1.equals(bit2);
    }

    /**
     * 取与，是Bit中的and方法的替代品，只不过是不同写法罢了
     * @param bit1  操作值1
     * @param bit2  操作值2
     * @return  返回结果
     */
    public static Bit and(Bit bit1,Bit bit2){
        return bit1.and(bit2);
    }

    /**
     * 取或，是Bit中的or方法的替代品，只不过是不同写法罢了
     * @param bit1  操作值1
     * @param bit2  操作值2
     * @return  返回结果
     */
    public static Bit or(Bit bit1,Bit bit2){
        return bit1.or(bit2);
    }

    /**
     * 取反，是Bit中的negation方法的替代品，只不过是不同写法罢了
     * @param bit  操作值
     * @return  返回结果
     */
    public static Bit negation(Bit bit){
        return bit.negation();
    }
}
