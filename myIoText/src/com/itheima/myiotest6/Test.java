package com.itheima.myiotest6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    //带权重的随机算法
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myIoText\\src\\com\\itheima\\myiotest6\\names.txt"));
        String line;
        while((line = br.readLine()) != null){
            String[] person = line.split("-");
            Student s = new Student(person[0], person[1], Integer.parseInt(person[2]), Double.parseDouble(person[3]));
            list.add(s);
        }
        br.close();

        //计算权重总和
        double w = 0.0;
        double[] weight = new double[list.size()];
        for (Student stu : list) {
            w += stu.getWeight();
        }

        //计算每个人权重的实际占比
        int index = 0;
        for (Student stu : list) {
            weight[index++] = stu.getWeight() / w;
        }

        //计算每个人的权重占比范围
        for (int i = 1; i < weight.length; i++) {
            weight[i] = weight[i] + weight[i - 1];
        }

        //随机抽取
        //获取0.0~1.0其中的随机数
        double number = Math.random();
        //判断number在weight中的位置
        //运用二分法
        //方法返回值：- 插入点 - 1
        //获取number这个数据的数组当中的插入点位置
        int result = - Arrays.binarySearch(weight, number) - 1;
        Student s = list.get(result);
        //System.out.println(s);

        //修改当前学生的权重
        double newWeight = s.getWeight() / 2;
        s.setWeight(newWeight);
        //System.out.println(s);

        //将集合中的数据存入文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIoText\\src\\com\\itheima\\myiotest6\\names.txt"));
        for (Student stu : list) {
            bw.write(stu.toString());
            bw.newLine();
        }
        bw.close();

    }
}
