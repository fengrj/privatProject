package com.example.design_patterns.Adapter;

/**
 * 类的适配器模式
 * 一般手机充电器输出的直流电压为5V，我们把交流电220V称为源，希望得到的直流电5V称为目标，而充电器即为适配器。
 * 特点:
 * 类适配器是通过继承源类，实现目标接口的方式实现适配的。但是，由于Java单继承的机制，这就要求目标必须是接口，有一定的局限性。
 */
public class ClassAdapter extends AC implements IDC {

    /**
     * 重写的接口方式 IDC. outputDC
     * 内部调用 处理
     */
    @Override
    public int outputDC4V() {
        //直流电为交流电的电压值除以44
        return outputAC220() / 44;
    }

}

/**
 * 原始的类 执行交流电220V业务
 */
class AC {
    int outputAC220() {
        return 220;
    }
}

/**
 * 为适配做的接口 ( 目标接口)，需要转为直流电5V业务
 */
interface IDC {
    int outputDC4V();
}
