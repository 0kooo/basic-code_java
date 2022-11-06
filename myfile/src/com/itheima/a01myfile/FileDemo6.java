package com.itheima.a01myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //1.listRoot    获取系统中所以的盘符
        File[] arr = File.listRoots();
        //System.out.println(Arrays.toString(arr));

        //2.list() 获取当前路径下的所有内容
        /*File f1 = new File("E:\\aaa");
        String[] arr2 = f1.list();
        for (String s : arr2) {
            System.out.println(s);
        }*/

        //3.list(FilenameFilter filter)    利用文件名过滤器获取当前路径下所以内容
        //需求: 我现在要获取E:\\aaa文件夹里面所有的txt文件
        File f2 = new File("E:\\aaa");
        //accept方法的形参, 依次表示aaa文件夹里面每一个文件或者文件夹的路径
        //参数一:父级路径
        //参数二:子级路径
        //返回值: 如果返回值为true, 就表示当前路径保留
        //        如果返回值为false, 就表示当前路径舍弃不要
        /*String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));*/

        //4.listFiles() 获取当前路径下所以内容
        /*File f3 = new File("E:\\aaa");
        File[] arr4 = f3.listFiles();
        for (File file : arr4) {
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }*/

        //5.listFiles(listFilter filter)

        //6.listFiles(FilenameFilter filter)
    }
}
