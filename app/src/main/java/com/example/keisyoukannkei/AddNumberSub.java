package com.example.keisyoukannkei;

public class AddNumberSub extends AddNumber {

    private int record;

    public void recorder(){
        record = super.number;
    }

    public int getRecord() {
        return record;
    }
}
