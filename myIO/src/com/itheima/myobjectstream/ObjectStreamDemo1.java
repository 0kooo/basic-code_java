package com.itheima.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        Student s = new Student("zhangsan", 20);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO\\a.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
