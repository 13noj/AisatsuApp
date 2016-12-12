package jp.techacademy.hirotoshi.yoshioka.javalog;

import android.util.Log;
/**
 * Created by Hirotoshi Yoshioka on 12/9/2016.
 */

public class BigDog extends Dog{

    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
