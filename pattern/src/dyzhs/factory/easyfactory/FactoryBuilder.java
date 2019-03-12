package dyzhs.factory.easyfactory;

/**
 * @Author dyzhs
 * @Date 2019/3/12 21:04
 **/
public class FactoryBuilder {

    public static IFactory build(String type) {
        IFactory factory = null;
        switch (type){
            case "1":
                factory = new Factory1();
                break;
            case "2":
                factory = new Factory2();
        }
        return factory;
    }
}
