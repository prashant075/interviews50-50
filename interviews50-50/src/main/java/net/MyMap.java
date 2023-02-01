package net;

import java.util.List;

public interface MyMap {
    void put(String key, String value);
    String get(String key) throws KeyNotFoundException;
    List<String> listKeys();
    void delete(String key) throws KeyNotFoundException;

}
