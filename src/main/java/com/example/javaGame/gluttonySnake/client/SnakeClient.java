package com.example.javaGame.gluttonySnake.client;

import com.example.javaGame.gluttonySnake.core.Food;
import com.example.javaGame.gluttonySnake.core.MyFrame;
import com.example.javaGame.gluttonySnake.core.MySnake;
import com.example.javaGame.gluttonySnake.utils.ImageUtil;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeClient extends MyFrame {

    MySnake mySnake = new MySnake(100, 100);//蛇
    Food food = new Food();//食物
    Image background = ImageUtil.images.get("background");//背景图片
    Image fail = ImageUtil.images.get("fail");//游戏结束的文字


    @Override
    public void loadFrame() {
        super.loadFrame();
        //添加键盘监听器，处理键盘按下事件 委托给mysnake
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println( "客户端 的监听吧....." );
                mySnake.keyPressed(e);
            }
        });
    }


    /**
     * 绘制界面
     */
    @Override
    public void paint(Graphics g) {
        System.out.println( "客户端的一些东西  绘制界面....." );

        //绘制背景
        g.drawImage(background, 0, 0, null);
        if (mySnake.live) {
            //如果蛇活着，就绘制
            mySnake.draw(g);
            if (food.live) {
                //如果食物活着，就绘制
                food.draw(g);
                //判断是否被吃
                food.eaten(mySnake);
            } else {
                //否则，产生新食物
                food = new Food();
            }
        } else {
            //蛇死亡，弹出游戏结束字样
            g.drawImage(fail,
                    (background.getWidth(null) - fail.getWidth(null)) / 2,
                    (background.getHeight(null) - fail.getHeight(null)) / 2,
                    null);
        }
        //绘制分数
        drawScore(g);
    }

    /**
     * 绘制分数
     *
     * @param g
     */
    public void drawScore(Graphics g) {
        System.out.println( "客户端的一些东西  绘制分数....." );

        g.setFont(new Font("Courier New", Font.BOLD, 40));
        g.setColor(Color.WHITE);
        g.drawString("SCORE:" + mySnake.score, 700, 100);
    }

}
