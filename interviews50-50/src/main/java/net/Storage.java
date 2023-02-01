package net;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, String> map;
    public Storage(){
        map = new HashMap<>();
    }

    public Map<String, String> getMap() {
        return map;
    }
}
