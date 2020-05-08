package com.example.design_patterns.template;




public class StudentBPaper extends TestPaper{
    @Override
    String answer1() {
        return "c";
    }

    @Override
    String answer2() {
        return "b";
    }

    @Override
    String answer3() {
        return "a";
    }
}
