package dyzhs.singletion;

/**
 * 懒汉式加载
 * @Author dyzhs
 * @Date 2019/2/23 16:30
 **/
public class Singletion1 {

    private static Singletion1 singletion1 = new Singletion1();

    public Singletion1() {
    }

    public static Singletion1 getInstance(){
        return singletion1;
    }
}
