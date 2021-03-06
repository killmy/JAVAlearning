/**
 @author g
 @version 18.0
 time:5/14
 */
public class Helloword {
    public static TerminalPrint p = new TerminalPrint();
    public static void main(String[] args){
        /*只能调用类中非静态的方法*/
        p.print("in");
        /*静态方法*/
        TerminalPrint.test("I can use in direction");
        System.out.println("change");
        System.out.print("next");
        System.out.print("no change");
        /*
        change
        nextno change
        */
    }
}
class TerminalPrint{
    public void print(String args){
        System.out.println(args);
        test(args);
    }
    public static void test(String args){
        System.out.println(args);
        System.out.println("only used in TerminalPrint");
    }
}

//常用的输出语句
/*静态方法或者变量相当于全局方法，对象不可调用，
方便用于存放一些不可更改的东西或者不用对象的方法，如计算公式，一些库和包必定用的是静态对象*/
// 静态类-->void相当于返回任意类别的值
//java 基本都在类里面，感觉这种写法也挺好用的
//每一个执行语句都有一个分号