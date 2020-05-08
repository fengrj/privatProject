package com.example.jkd_stream;


import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class testMain {


    public static void main(String[] args) {

//        String property = System.getProperty("file.encoding");
//        System.out.println( property );
//
////        Charset charset = Charset.defaultCharset();
//        charset.
//
//        Locale locale = Locale.getDefault();
//        System.out.println(locale.getLanguage());
//        System.out.println(locale.getCountry());

    List<Student> studentList = new ArrayList<>(10);
        for (int i = 0; i < 4; i++) {
            Student student = new Student();
            student.setId(i+"");
            student.setNoiseStatus((double)i);
            student.setNoiseValue((double)i);
            student.setDeviceTime(LocalDateTime.now());
            student.setRegionId(i+"号");
            studentList.add(student);

            Student student2 = new Student();
            student2.setId(i+"");
            student2.setNoiseStatus((double)i);
            student2.setNoiseValue((double)i);
            student2.setDeviceTime(LocalDateTime.now());
            student2.setRegionId(i+"号");
            studentList.add(student2);
            System.out.println("源A数据: " +  student.toString() );
        }


        /**
         * map的相关操作
         *   map是对每个元素进行处理
         */
        mapMethod(studentList);


        /**
         * 指定字段分组
         */
        Map<String, List<Student>> dateTimeListMap= studentList.stream().collect(Collectors.groupingBy(Student::getId));
//
        // 以Id分组,并且求每组里面字段的合  类似sql统计
        Map<String , Double> doubleMap = studentList.stream().collect(
                Collectors.groupingBy(Student::getId, Collectors.summingDouble(Student::getNoiseValue)));

        /**
         * 筛选数据
         */
        List<Student> list = studentList.stream().filter(student -> student.getId().equals("1")).collect(Collectors.toList());



        //
//    //获取Student中所有噪音值的平均值,此时mapToDouble转换为Double流，也可以求和，最大值，最小值,去重，排序,计数等
//    OptionalDouble avgNoiseOptional = studentList.stream().mapToDouble(Student::getNoiseValue).average();
//
//    //对Student中元素按照deviceTime进行排序
//    studentList = studentList.stream().sorted(Comparator.comparing(Student::getDeviceTime)).collect(Collectors.toList());
//
//
//    //从idList到dayDataDto集合
//    List<DayDataDto> dayDataList = studentIdList.stream().map(id -> {
//        DayDataDto dayDataDto = new DayDataDto();
//        dayDataDto.setId(id);
//        dayDataDto.setDate(LocalDate.now());
//        return dayDataDto;
//    }).collect(Collectors.toList());
//
//    //满足noiseStatus=0的regionId前3个的集合
//    List<String> regionId = studentList.stream().filter(Student -> Student.getNoiseStatus() == 0)
//            .map(Student::getRegionId).limit(3).collect(Collectors.toList());


        System.out.println( " ");

    }

    private static void mapMethod(List<Student> studentList) {
        //获取Student中所有id的集合
        List<String> collect = studentList.stream().map(Student::getId).collect(Collectors.toList());

        // 获取字符串的大写
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> collec3t = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());

        // 获取集合的每个元素,做处理返回新的集合    字符串数据做处理
        List<String> collect2 = alpha.stream().map(n -> n + "aaa").collect(Collectors.toList());

        // 数量做运算
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        // collect1   [2, 4, 6, 8, 10]
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
    }


}
