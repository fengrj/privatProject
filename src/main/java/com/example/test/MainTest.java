package com.example.test;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/12/1811:53
 */
public class MainTest {

    public static void main(String[] args) {
       List<User> source = new ArrayList<>();
        for (int i = 0; i <10000000 ; i++) {
            source.add(new User(i));
        }
//        System.out.println("source : " + source.toString());

//        // 抽出的方法     911毫秒
//        long l = System.currentTimeMillis();
//        List<UserSon> userSonList = transitionClass(source, UserSon.class);
//        long l2 = System.currentTimeMillis();
//        System.out.println( "耗时 : "+  (l2-l));



        long now = System.currentTimeMillis();
        List<UserSon> userSons = normalMethod(source);
        long now2 = System.currentTimeMillis();
        System.out.println( "耗时222 : "+  (now2-now));


//        UserSon userSon = transitionClass2222(new User(22), UserSon.class);

//        System.out.println("userSon : " + userSon.toString());



//        System.out.println("userSonList : " + userSonList.toString());

    }

    private static List<UserSon> normalMethod(List<User> source) {
        Stream<UserSon> userSonStream = source.stream().map(aaa -> {
            UserSon userSon = new UserSon();
            BeanUtils.copyProperties(aaa, userSon);
            return userSon;
        });
        List<UserSon> userSonList2 = userSonStream.collect(Collectors.toList());
        return userSonList2;
    }


    public static <T>List<T>  transitionClass(List<?> sourceList, Class<T> targetClass) {
        Stream<T> stream = sourceList.stream().map(sourceBean -> {
            try {
                T t = targetClass.newInstance();
                BeanUtils.copyProperties(sourceBean, t);
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
        return stream.collect(Collectors.toList());
    }


    public static <T> T  transitionClass2222(User sourceObject, Class<T> destinationObject) {
        try {
            T bean = destinationObject.newInstance();
            BeanUtils.copyProperties(sourceObject, bean);
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }



//    public List<?> conversion(Class<?> tag) {
//        Stream<UserSon> userSonStream = source.stream().map(aaa -> {
//            try {
//
//                Object o = tag.newInstance();
//                tag.
//
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//            UserSon userSon = new UserSon();
//            BeanUtils.copyProperties(aaa, o);
//            return userSon;
//        }); List<UserSon> userSonList = userSonStream.collect(Collectors.toList());
//
//        return userSonList;
//    }


}
