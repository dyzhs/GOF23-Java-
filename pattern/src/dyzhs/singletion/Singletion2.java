package dyzhs.singletion;

/**
 * 懒汉式加载
 * @Author dyzhs
 * @Date 2019/2/23 16:39
 **/
public class Singletion2 {

    private static Singletion2 singletion2 = null;

    public Singletion2() {
    }

    public static synchronized  Singletion2 getInstance(){
        if (singletion2 == null) {
            singletion2 = new Singletion2();
        }
        return singletion2;
    }
}
