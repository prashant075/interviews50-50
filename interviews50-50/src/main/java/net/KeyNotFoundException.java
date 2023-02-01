package net;

public class KeyNotFoundException extends  Exception{

    public KeyNotFoundException(String message) {
        super("Key Not Found");
    }
}
