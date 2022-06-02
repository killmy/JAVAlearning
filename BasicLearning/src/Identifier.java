/*
* 标识符：能命名的地方
* 命名规则：驼峰命名法：第一个单词小写其它单词大写（一般变量命名)，函数名，类名，方法等大驼峰命名法
* static 相当于全局变量
*/

/**
 * @author gfh
 * 标识符
 * @version 1.8
 */
public class Identifier {
    public static Account gfh = new Account();
    public static void main(String[] args){
        System.out.println("标识符");
        System.out.println("类名,接口名:XxxYyyZzz");
        System.out.println("变量名,方法名:xxxYyyZzz");
        System.out.println("常量名:XXX_YYY_ZZZ");
        gfh.inputAccountName("gfh");
        gfh.inputAccountMoney(1000000.0);
        if (gfh.getAccountMoney()>1000.0){
            System.out.println("too much money");
            gfh.reduceAccountMoney(gfh.getAccountMoney()-1000.0);
        }
        else {
            System.out.println("a poor people");
        }
    }
}
/*
* 账户函数*/
class Account{
    private String accountName = "";
    private double accountMoney = 0;
    /*输入账户名*/
    public void inputAccountName(String name){
        accountName = name;
    };
    public String getAccountName(){
      return accountName;
    };
    public void inputAccountMoney(double money){
        accountMoney = money;
    };
    public void addAccountMoney(double addMoney){
        accountMoney += addMoney;
    };
    public void reduceAccountMoney(double reduceMoney){
        accountMoney -= reduceMoney;
        if(accountMoney < 0) {
            System.out.println("Your money is less than 0!\nPlease add money");
        };
    };
    public double getAccountMoney(){
        return accountMoney;
    }
}
