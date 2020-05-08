package com.example.design_patterns.ze_ren_lian;

/**
 * 小组长
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(1,3);
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
