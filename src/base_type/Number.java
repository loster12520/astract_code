package base_type;

import base.Bit;

/**
 * 该类为数字的抽象接口，且定义了众多用于数字运算的方法，用于子类的继承
 * @author loster12520
 */
public interface Number {
    /**
     * 加法
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  和
     */
    static Number sum(Number number1,Number number2){
        return number1.sum(number2);
    }

    /**
     * 减法
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  差
     */
    static Number subtract(Number number1,Number number2){
        return number1.subtract(number2);
    }

    /**
     * 乘法
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  积
     */
    static Number multiply(Number number1,Number number2){
        return number1.multiply(number2);
    }

    /**
     * 除法
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  商
     */
    static Number divide(Number number1,Number number2){
        return number1.divide(number2);
    }

    /**
     * 取余
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  余
     */
    static Number remainder(Number number1,Number number2){
        return number1.remainder(number2);
    }

    /**
     * 开方
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  result
     */
    static Number pow(Number number1,Number number2){
        return number1.pow(number2);
    }

    /**
     * 平方差
     * @param number  第一操作数
     * @return  平方差
     */
    static Number sqrt(Number number){
        return number.sqrt();
    }

    /**
     * 两数的最大公因数
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  最大公因数
     */
    static Number gcd(Number number1,Number number2){
        return number1.gcd(number2);
    }

    /**
     * 绝对值
     * @param number  第一操作数
     * @return  绝对值
     */
    static Number abs(Number number){
        return number.abs();
    }

    /**
     * 符号。其中，正数为1，负数为-1，0为0
     * @param number  第一操作数
     * @return  符号
     */
    static Number symbol(Number number){
        return number.symbol();
    }

    /**
     * 相反数
     * @param number  第一操作数
     * @return  相反数
     */
    static Number negate(Number number){
        return number.negate();
    }

    /**
     * mod求余函数
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  mod
     */
    static Number mod(Number number1,Number number2){
        return number1.mod(number2);
    }

    /**
     * 左移
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  左移
     */
    static Number shiftLeft(Number number1,Number number2){
        return number1.shiftLeft(number2);
    }

    /**
     * 右移
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  右移
     */
    static Number shiftRight(Number number1,Number number2){
        return number1.shiftRight(number2);
    }

    /**
     * 与运算
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  result
     */
    static Number and(Number number1,Number number2){
        return number1.and(number2);
    }

    /**
     * 或运算
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  result
     */
    static Number or(Number number1,Number number2){
        return number1.or(number2);
    }

    /**
     * 异或运算
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  result
     */
    static Number xor(Number number1,Number number2){
        return number1.xor(number2);
    }

    /**
     * 取反运算
     * @param number  第一操作数
     * @return  result
     */
    static Number not(Number number){
        return number.not();
    }

    /**
     * andNot运算，即先将两个数取反，再进行与运算
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  result
     */
    static Number andNot(Number number1,Number number2){
        return number1.andNot(number2);
    }

    /**
     * 判断是否相等
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  result
     */
    static Bit equals(Number number1,Number number2){
        return number1.equals(number2);
    }

    /**
     * 取最大值
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  最大值
     */
    static Number max(Number number1,Number number2){
        return number1.max(number2);
    }

    /**
     * 取最小值
     * @param number1  第一操作数
     * @param number2  第二操作数
     * @return  最小值
     */
    static Number min(Number number1,Number number2){
        return number1.min(number2);
    }



    /**
     * 返回两数之和
     * @param number  第二操作数
     * @return  和
     */
    Number sum(Number number);

    /**
     * 返回两数之差
     * @param number  第二操作数
     * @return  差
     */
    Number subtract(Number number);

    /**
     * 返回两数之积
     * @param number  第二操作数
     * @return  积
     */
    Number multiply(Number number);

    /**
     * 返回两数之商
     * @param number  除数
     * @return  商
     */
    Number divide(Number number);

    /**
     * 返回两数之余
     * @param number  除数
     * @return  余
     */
    Number remainder(Number number);

    /**
     * 返回number次方
     * @param number  第二操作数
     * @return  result
     */
    Number pow(Number number);

    /**
     * 返回平方根
     * @return  平方根
     */
    Number sqrt();

    /**
     * 返回两数绝对值的最大公约数
     * @param number  第二操作数
     * @return  result
     */
    Number gcd(Number number);

    /**
     * 返回绝对值
     * @return  绝对值
     */
    Number abs();

    /**
     * 返回相反数（即符号相反的数）
     * @return  相反数
     */
    Number negate();

    /**
     * 返回符号，0为0，正数为1，负数为-1
     * @return
     */
    Number symbol();

    /**
     * 返回this mod number，与remainder不同，这个只会返回正数
     * 举一个例子，-5 remainder -3 = -2，但是-5 mod -3 =1
     * @param number  第二操作数
     * @return  result
     */
    Number mod(Number number);

    /**
     * 左移number位
     * @param number  第二操作数
     * @return  result
     */
    Number shiftLeft(Number number);

    /**
     * 右移number位
     * @param number  第二操作数
     * @return  result
     */
    Number shiftRight(Number number);

    /**
     * 与运算
     * @param number  第二操作数
     * @return  result
     */
    Number and(Number number);

    /**
     * 或运算
     * @param number  第二操作数
     * @return  result
     */
    Number or(Number number);

    /**
     * 异或运算
     * @param number  第二操作数
     * @return  result
     */
    Number xor(Number number);

    /**
     * 取反
     * @return  result
     */
    Number not();

    /**
     * 与或操作
     * @param number  第二操作数
     * @return  result
     */
    Number andNot(Number number);

    /**
     * 判断是否相等
     * @param number  第二操作数
     * @return  是否相等
     */
    Bit equals(Number number);

    /**
     * 返回两数之间最大值
     * @param number  第二个数
     * @return  最大值
     */
    Number max(Number number);

    /**
     * 返回两数之间最小值
     * @param number  第二个数
     * @return  最小值
     */
    Number min(Number number);

}
