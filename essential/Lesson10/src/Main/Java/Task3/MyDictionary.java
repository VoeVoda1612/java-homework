package Task3;


import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey,TValue> {
    private Map <TKey,TValue> map=new HashMap<TKey, TValue>();

    public void addElement(TKey tKey,TValue tValue){
        map.put(tKey,tValue);
    }

    public TValue getElement(TKey tKey){
        return map.get(tKey);
    }

    public int count(){
        return map.size();
    }

}
