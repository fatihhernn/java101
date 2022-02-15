package EffectiveJava.item3;

import java.util.HashMap;

public class EagerCache implements Cache {

    //instance çağrılmasa bile heapte yeri ayırtılıyor.. Daha oluşmada instance üretiyor

    private static final EagerCache instance=new EagerCache();

    private HashMap<Object,Object> map;

    private EagerCache() {
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
    public static EagerCache getInstance(){
        return instance;
    }
}
