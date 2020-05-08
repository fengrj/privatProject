package com.example.design_patterns.ze_ren_lian;

/**
 * 部门经理
 */
public class Manager extends Handler {

    public Manager() {
        //部门经理处理3-7天的请假
        super(3,7);
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
