package com.example.design_patterns.Adapter;

/**
 * 对象适配器模式
 * 一般手机充电器输出的直流电压为5V，我们把交流电220V称为源，希望得到的直流电5V称为目标，而充电器即为适配器。
 * 特点:
 * 对象适配器，不是继承源类，而是依据关联关系，持有源类的对象，这也隐藏了源类的方法。在这里，适配器和源类的关系不是继承关系，而是组合关系。
 */
public class ObjectAdapter implements Target {

    //持有源类的对象
    private Source source;

    /**
     * 构造函数 实例化私有的源对象 source
     */
    ObjectAdapter(Source source) {
        this.source = source;
    }

    /**
     * 实现源类中需要适配的方法 业务,本类(适配类)
     */
    int outputAC() {
        return source.outputAC220();
    }

    /**
     * 重写为适配Target接口
     * 1.使用一: 内部调用源方法,对方法做增强
     * 2:使用二: 重新定义新的业务处理方式
     */
    @Override
    public int output4V() {
        return source.outputAC220() / 44;
    }

}

class Source {
    int outputAC220() {
        return 220;
    }
}

interface Target {
    int output4V();
}

