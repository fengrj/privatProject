package com.example.design_patterns.Adapter;

/**
 *
 *
 *
 *
 *
 */
public class testMain {

    // 适配器模式的别名 包装器(Wrapper)
    public static void main(String[] args) {
        /**
         * 类适配器模式
         *特点: 继承源类，实现目标接口。
         *
         * 一般手机充电器输出的直流电压为5V，我们把交流电220V称为源，希望得到的直流电5V称为目标，而充电器即为适配器。
         */
        ClassAdapter adapter2 = new ClassAdapter();
        System.out.println("直流电5V业务处理:" + adapter2.outputDC4V());  // 适配后4V方法
        System.out.println("交流电220V业务处理:" + adapter2.outputAC220());  // 父类原始方法


        /**
         * 对象适配器模式
         * 特点: 持有源类的对象，把继承关系改变为组合关系。
         *
         * 一般手机充电器输出的直流电压为5V，我们把交流电220V称为源，希望得到的直流电5V称为目标，而充电器即为适配器。
         */
        ObjectAdapter adapter = new ObjectAdapter(new Source());
        System.out.println("源类中的业务:" + adapter.outputAC());
        System.out.println("适配后的业务:" + adapter.output4V());


        /**
         *  接口适配模式 这个是 认适配器模式(Default Adapter Pattern)或缺省适配器模式
         *  特点: 借助中间抽象类空实现目标接口所有方法，适配器选择性重写。
         */
        InterfaceAdapter adatper3 = new InterfaceAdapter(new SourceClass());
        System.out.println("mac电脑电压:" + adatper3.output20V());


        //TODO 还有种扩展方式 双向适配模式
    }
}
