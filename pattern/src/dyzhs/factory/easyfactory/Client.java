package dyzhs.factory.easyfactory;

/**
 * 简单工厂模式
 * @Author dyzhs
 * @Date 2019/3/12 21:03
 **/
public class Client {

    public static void main(String[] args) {
        IFactory factory = FactoryBuilder.build("2");
        factory.factory();


    }
}
