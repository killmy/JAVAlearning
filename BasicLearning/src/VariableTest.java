/**
 * @author gfh
 * @version 1.9
 * 变量命名
 * 数据类型 变量名 = 变量值
 * short 16 int 32 long 64
 * float 32 double 64
 * 如何通过变量类型节省空间是艺术
 * */
public class VariableTest {
    public static void main(String[] args){
        System.out.println("the name of variable");
        short myAge = 16;
        int myAccount = 100000;
//      强制类型转换
        long schoolToHome = (long) 1e7;
//      0.0 默认double类型,0.0F默认float类型
        float myAccountDetail = 0.0F;
        double schoolToHomeDetail = 1e7;
    }
};
//复数类的定义，现在实力还不够
//public class Complex{
//  private double real;
//  private double imag;
//
//};
