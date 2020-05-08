package com.example.design_patterns.ze_ren_lian;

/**
 * 总经理
 */
public class BigManager extends Handler {

    public BigManager() {
        //部门经理处理7天以上的请假
        super(7);
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
