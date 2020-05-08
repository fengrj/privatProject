package com.example.javaGame.gluttonySnake.utils;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImageUtil {
	public static Map<String,Image> images = new HashMap<>();
	
	static{


//		images.put("snake_body", GameUtil.getImage(Constant.IMG_PRE+"snake_body.png"));
//		images.put("food", GameUtil.getImage(Constant.IMG_PRE+"food.png"));
//		images.put("snake_head", GameUtil.getImage(Constant.IMG_PRE+"snake_head.png"));
//		images.put("background", GameUtil.getImage(Constant.IMG_PRE+"background.jpg"));
//		images.put("fail", GameUtil.getImage(Constant.IMG_PRE+"fail.png"));


		String aa ="D:\\WorkSpace\\SpringBoot_myProject\\src\\main\\java\\com\\example\\demo\\javaGame\\gluttonySnake\\img\\";

		images.put("snake_body", GameUtil.getImage(aa+"snake_body.png"));
		images.put("food", GameUtil.getImage(aa+"food.png"));
		images.put("snake_head", GameUtil.getImage(aa+"snake_head.png"));
		images.put("background", GameUtil.getImage(aa+"background.jpg"));
		images.put("fail", GameUtil.getImage(aa+"fail.png"));
	}
}
