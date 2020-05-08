package com.example.design_patterns.ze_ren_lian;


public class TestMain {


    public static void main(String[] args) {
        //请假条来一张
        ILeave leave = new Leave("小花",5,"身体不适");

        //各位领导
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler bigManager = new BigManager();

        //小组长的领导是部门经理
        groupLeader.setNextHandler(manager);
        //部门经理的领导是总经理
        //之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，如果实战中上级领导人都是固定的，则可以移到领导实现类中。
        manager.setNextHandler(bigManager);

        //提交申请
        groupLeader.submit(leave);
    }





}
