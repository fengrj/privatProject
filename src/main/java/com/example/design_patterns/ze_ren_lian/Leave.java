package com.example.design_patterns.ze_ren_lian;

/**
 * 请假条
 */
public class Leave implements ILeave {
    private String name;//姓名
    private int num;//请假天数
    private String content;//请假内容

    public Leave(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public String getContent() {
        return content;
    }
}
