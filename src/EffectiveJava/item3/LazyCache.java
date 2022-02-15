package EffectiveJava.item3;

import java.util.HashMap;

public class LazyCache implements Cache {

    //lazy dememizin nedeni çağrıldığı zaman instance üretiyor.
    // çağrılmış ise heap'te yeri hazırdır onu çağırıyor

    private static LazyCache instance;

    private HashMap<Object,Object> map;

    private LazyCache() {
        this.map = new HashMap<>();
    }

    @Override
    public void put(Object key, Object value) {
        map=new HashMap<Object, Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
    public static LazyCache getInstance(){
        if(instance==null){
            instance=new LazyCache();
        }
        return instance;
    }
}
