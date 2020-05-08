package com.example.design_patterns.Adapter;


/**
 * 接口适配器
 */
public class InterfaceAdapter extends DefaultAdapter {
    private SourceClass   sourceClass;
    public InterfaceAdapter(SourceClass sourceClass){
        this.sourceClass = sourceClass;
    }

    /**
     * 只重写 需要适配的方法
     * @return
     */
    @Override
    public int output20V() {
        return sourceClass.output5V()/11;
    }
}

//源接口，有多个方法
  interface SourceInterface {
    int output5V();
    int output12V();
    int output20V();
}

class SourceClass implements SourceInterface{
    @Override
    public int output5V() {
        return 5;
    }

    @Override
    public int output12V() {
        return 12;
    }

    @Override
    public int output20V() {
        return 20;
    }
}

/**
 * 中间类，这是一个抽象类   空实现所有方法(根据里斯替换原则)，
 */
  abstract class DefaultAdapter implements SourceInterface {

    @Override
    public int output5V(){
            return 0;
    }

    @Override
    public int output12V(){
            return 0;
    }


    @Override
    public int output20V() {
        return 0;
    }
}

