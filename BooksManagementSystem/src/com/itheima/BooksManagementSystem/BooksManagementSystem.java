package com.itheima.BooksManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        loop: while(true){
            System.out.println("---------------------------------欢迎来到图书管理系统----------------------------------");
            System.out.println("1.添加图书");
            System.out.println("2.删除图书");
            System.out.println("3.修改图书");
            System.out.println("4.查询单本图书");
            System.out.println("5.查询全部图书");
            System.out.println("6.退出");
            System.out.println("请输入您选择的操作");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addBook(list);
                case "2" -> deleteBook(list);
                case "3" -> updateBook(list);
                case "4" -> queryOneBook(list);
                case "5" -> queryAllBook(list);
                case "6" -> {
                    break loop;
                }
                default -> System.out.println("没有这个选择");
            }
        }
    }

    //添加图书
    public static void addBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        while(true){
            System.out.println("请输入书的编号");
            String number = sc.next();
            boolean flag = containt(list, number);
            if(!flag){
                book.setNumber(number);
                break;
            }
        }

        System.out.println("请输入书的名字");
        String name = sc.next();
        book.setName(name);

        System.out.println("请输入书的作者");
        String author = sc.next();
        book.setAuthor(author);

        System.out.println("请输入书的价格");
        int price = sc.nextInt();
        book.setPrice(price);

        list.add(book);

        System.out.println("添加成功");
    }

    //删除图书
    public static void deleteBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要删除书的编号");
        String number = sc.next();
        boolean flag = containt(list, number);
        if(flag){
            int index = getIndex(list, number);
            list.remove(index);
        }else{
            System.out.println("编号不存在,删除失败");
        }
    }

    //修改图书
    public static void updateBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要修改书的编号");
        String number = sc.next();
        boolean flag = containt(list, number);
        if(flag){
            int index = getIndex(list, number);
            Book book = list.get(index);

            System.out.println("请输入您重新设定的书名");
            String newName = sc.next();
            book.setName(newName);

            System.out.println("请输入此修改书的作者");
            String newAuthor = sc.next();
            book.setAuthor(newAuthor);

            System.out.println("请输入此修改书的价格");
            String newPrice = sc.next();
            book.setName(newPrice);

            System.out.println("修改成功");
        }else{
            System.out.println("编号不存在,修改失败");
        }
    }

    //查询单本图书
    public static void queryOneBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        if(list.size() == 0){
            System.out.println("系统内暂无书本数据,请加入后再查询");
            return;
        }else{
            System.out.println("请输入您所以查询书的编号");
            String number = sc.next();
            int index = getIndex(list, number);
            System.out.println("编号\t书名\t\t作者\t\t价格");
            if(index >= 0){
                Book book = list.get(index);
                System.out.println(book.getNumber()+"\t"+book.getName()+"\t"+book.getAuthor()+"\t"+book.getPrice());
            }else{
                System.out.println("此书编号不存在,查询失败");
            }
        }
    }

    //查询全部图书
    public static void queryAllBook(ArrayList<Book> list) {
        if(list.size() == 0){
            System.out.println("系统内暂无书本数据,请加入后再查询");
            return;
        }
        System.out.println("编号\t书名\t\t作者\t\t价格");
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            System.out.println(book.getNumber()+"\t"+book.getName()+"\t"+book.getAuthor()+"\t"+book.getPrice());
        }
    }

    //获得书的位置
    public static int getIndex(ArrayList<Book> list, String number){
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if(book.getNumber().equals(number)){
                return i;
            }
        }
        return -1;
    }

    //判读编号是否存在
    public static boolean containt(ArrayList<Book> list, String number){
        int flag = getIndex(list, number);
        if(flag >= 0){
            return true;
        }
        return false;
    }
}
