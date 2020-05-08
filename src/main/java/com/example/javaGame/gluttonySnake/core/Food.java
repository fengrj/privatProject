package com.example.javaGame.gluttonySnake.core;

import com.example.javaGame.gluttonySnake.constant.Constant;
import com.example.javaGame.gluttonySnake.utils.ImageUtil;

import java.awt.*;

public class Food extends SnakeObject {

    public Food() {
        System.out.println( "食物 构造函数......" );

        this.live = true;
        this.img = ImageUtil.images.get("food");
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.x = (int) (Math.random() * (Constant.GAME_WIDTH - width + 10));
        this.y = (int) (Math.random() * (Constant.GAME_HEIGHT - 40 - height) + 40);

    }

    /**
     * 食物被吃的方法
     *
     * @param mySnake
     */
    public void eaten(MySnake mySnake) {
        System.out.println( "食物  食物被吃的方法......" );

        boolean intersects = mySnake.getRectangle().intersects(this.getRectangle());

        if ( intersects && live && mySnake.live) {
            this.live = false;//食物死亡
            mySnake.setLength(mySnake.getLength() + 1);//长度加一
            mySnake.score += 10 * mySnake.getLength();//加分
        }
    }

    /**
     * 绘制食物
     */
    @Override
    public void draw(Graphics g) {
        System.out.println( "食物  绘制食物....." );

        g.drawImage(img, x, y, null);
    }

}
