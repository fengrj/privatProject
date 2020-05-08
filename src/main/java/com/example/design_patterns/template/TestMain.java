package com.example.design_patterns.template;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/4/2919:32
 */
public class TestMain {

    /*
   模板方法含义: 某个方法要实现的算法需要多个步骤，但其中有一些步骤是固定不变的，而另一些步骤则是不固定的。为了提高代码的可扩展性和可维护性，模板方法模式在这种场景下就派上了用场。
    个人理解:申明抽象类 抽取共用的业务逻辑 做具体方法  不同的处理方法做成抽象, 具体方法中处理统一业务穿插不同逻辑的抽象方法,让子类去实现
    应用: httpServlet中service方法+doGet/doPost(由子类实现)
     mybatis中BaseExecutor类query方法
     */
    public static void main(String[] args) {
        TestPaper testPaper = null;

        System.out.println("学生A答题");
        testPaper = new StudentAPaper();
        testPaper.answerQuestion();

        System.out.println("----------------------------");

        System.out.println("学生B答题");
        testPaper = new StudentBPaper();
        testPaper.answerQuestion();
    }
}
