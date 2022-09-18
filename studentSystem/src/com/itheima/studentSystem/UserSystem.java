package com.itheima.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop: while(true){
            System.out.println("-----------------------------学生管理系统用户登录界面--------------------------");
            System.out.println("1.用户登录");
            System.out.println("2.用户注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.println("请输入您选择的操作");
            String choose = sc.next();
            switch (choose){
                case "1" -> userLogin(list);
                case "2" -> userRegister(list);
                case "3" -> forgetPassword(list);
                case "4" -> {break loop;}
            }
        }
    }

    //用户登录
    public static void userLogin(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String getUserName = sc.next();
            boolean flag1 = contains(list, getUserName);
            if (!flag1) {
                System.out.println("用户名不存在,请先注册");
                return;
            }
            System.out.println("请输入用户密码");
            String getUserPassword = sc.next();
            while (true) {
                String auth = getauth();
                System.out.println(auth);
                System.out.println("请输入验证码");
                String userauth = sc.next();
                if (userauth.equalsIgnoreCase(auth)) {
                    System.out.println("验证码正确");
                    break;
                }
            }
            User user = new User(getUserName, getUserPassword, null, null);
            boolean flag2 = checkUserInfor(list, user);
            if (!flag2) {
                System.out.println("登录失败,用户名或密码错误,您还有" + (2 - i) + "机会");
                if (i == 2) {
                    System.out.println("账号被锁定,请联系客服");
                    return;
                }
            } else {
                System.out.println("登录成功");
                //创建对象调用方法,启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            }
        }
    }

    //用户注册
    public static void userRegister(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        User user = new User();
        int count = 0;

        //获得用户名
        while(true){
            System.out.println("请输入用户名");
            String userName = sc.next();
            int len = userName.length();
            if(len > 15 || len < 3){
                continue;
            }
            char[] userArr = userName.toCharArray();
            for (int i = 0; i < userArr.length; i++) {
                if(userArr[i] >= '0' && userArr[i] <= '9'){
                    count++;
                }
            }
            if(count == userName.length()){
                continue;
            }
            count = 0;
            for (int i = 0; i < userArr.length; i++) {
                if (( userArr[i] < '0') || ( userArr[i] >= ':'&& userArr[i] <= '@') || ( userArr[i] >= '[' && userArr[i] <= '`') || userArr[i] > 'z') {
                    count++;
                    break;
                }
            }
            if(count > 0){
                continue;
            }
            boolean flag = contains(list, userName);
            if(!flag){
                user.setName(userName);
                break;
            }else{
                System.out.println("用户名重复,请重新输入");
            }
        }

        //获得密码
        while(true){
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("请再次输入密码");
            String password2 = sc.next();
            if(password1.equals(password2)){
                user.setPassword(password1);
                break;
            }
        }

        //获得身份证号码
        while(true){
            System.out.println("请输入身份证号码");
            String id = sc.next();
            boolean flag = checkId(id);
            if(flag){
                user.setId(id);
                break;
            }
        }

        //获取手机号码
        while(true){
            System.out.println("请输入手机号码");
            String phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if(flag){
                user.setPhoneNumber(phoneNumber);
                break;
            }
        }
        list.add(user);
        System.out.println("注册成功");
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        boolean flag = contains(list, name);
        if(!flag){
            System.out.println("用户不存在,请先注册");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                System.out.println("请输入身份证");
                String id = sc.next();
                System.out.println("请输入电话号码");
                String phone = sc.next();
                if((list.get(i).getId().equalsIgnoreCase(id) && list.get(i).getPhoneNumber().equals(phone))){
                    System.out.println("修改失败,身份证或电话号码错误");
                    return;
                }
                while(true){
                    System.out.println("请输入新的密码");
                    String newPhone1 = sc.next();
                    System.out.println("请再输入新的密码");
                    String newPhone2 = sc.next();
                    if(newPhone1.equals(newPhone2)){
                        list.get(i).setPassword(newPhone1);
                        System.out.println("修改成功");
                        return;
                    }else{
                        System.out.println("两次密码不相同,请再次输入");
                    }
                }
            }
        }
    }

    //判断是否存在name
    public static boolean contains(ArrayList<User> list, String name){
        int index = getindex(list, name);
        if(index >= 0){
            return true;
        }
        return false;
    }

    //获得name的index
    public static int getindex(ArrayList<User> list, String name){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    //检查id是否是正确
    public static boolean checkId(String id){
        if(id.length() != 18){
            return false;
        }
        char[] strArr = id.toCharArray();
        if(strArr[0] == '0'){
            return false;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            if(strArr[i] < '0' || strArr[i] > '9'){
                return false;
            }
        }
        if((strArr[strArr.length - 1] > '0' && strArr[strArr.length - 1] < '9') || strArr[strArr.length - 1] == 'X' || strArr[strArr.length - 1] == 'x'){
            return true;
        }
        return false;
    }

    //检查phoneNumber是否正确
    public static boolean checkPhoneNumber(String PhoneNumber){
        if(PhoneNumber.length() != 11){
            return false;
        }
        if(PhoneNumber.charAt(0) == '0'){
            return false;
        }
        char[] phArr = PhoneNumber.toCharArray();
        for (int i = 0; i < phArr.length; i++) {
            if(phArr[i] < '0' || phArr[i] > '9'){
                return false;
            }
        }
        return true;
    }

    //获得验证码
    public static String getauth(){
        Random r = new Random();
        char[] arr = new char[58];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(65 + i);
        }
        int count = 0;
        String result = "";
        while(count < 4){
            int index = r.nextInt(58);
            if(index < 26 || index > 31){
                result += arr[index];
                count++;
            }
        }
        int number = r.nextInt(10);
        result += number;
        char[] resultArr = result.toCharArray();
        int index = r.nextInt(4);
        char temp = resultArr[index];
        resultArr[index] = resultArr[resultArr.length - 1];
        resultArr[resultArr.length - 1] = temp;
        String reslutStr = new String(resultArr);
        return reslutStr;
    }

    //检查用户名和密码是否正确
    public static boolean checkUserInfor(ArrayList<User> list, User userInfor){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getName().equals(userInfor.getName())&&user.getPassword().equals(userInfor.getPassword())){
                return true;
            }
        }
        return false;
    }
}
