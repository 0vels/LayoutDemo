package wang.layoutdemo;

import android.util.Log;

import java.lang.reflect.Method;

/**
 * Created by wang on 2017/4/4.
 */

public class Common {
    public static void setting(Object object) {
        Class clazz = object.getClass();
        try {
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods) {
                if(method.getParameterTypes().length>0){
                    continue;
                }
                Object value = method.invoke(object);
                if(value==null){
                    continue;
                }
                Log.e("[setting]"+object.getClass(),method.getName()+" "+value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
