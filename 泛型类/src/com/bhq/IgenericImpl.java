package com.bhq;

public class IgenericImpl implements Igeneric<String>{
    @Override
    public String getName(String name) {
        return name;
    }
}
