package net;

import java.util.*;

public class MyHashMap implements MyMap{
    private Storage storage;

    public MyHashMap(){
        this.storage = new Storage();
    }
    @Override
    public void put(String key, String value) {
       storage.getMap().put(key,value);
    }

    @Override
    public String get(String key) throws KeyNotFoundException {
       if(!storage.getMap().containsKey(key)){
           throw  new KeyNotFoundException("Key Not Found");
       }
       return  storage.getMap().get(key);
    }

    @Override
    public List<String> listKeys() {
      Set<String> keys =  storage.getMap().keySet();
      List<String> res = new ArrayList<>();
        res.addAll(keys);
      return res;
    }

    @Override
    public void delete(String key) throws KeyNotFoundException {
        if(!storage.getMap().containsKey(key)){
            throw  new KeyNotFoundException("Key Not Found");
        }
        storage.getMap().remove(key);
    }

    //{1,2,2,2,3,3,4,4,5,5,6,6}
}
