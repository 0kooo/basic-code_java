package com.itheima.a07regexText7;

public class RegexDemo2 {
    public static void main(String[] args) {
        //验证手机号码
        //心得:
        //拿着一个正确的数据,从左到右依次去写
        //分成三部分:
        //第一部分: 1 表示手机号码只能以1开头
        //第二部分: [3-9]表示手机号码第二位只能是3-9之间的
        //第三部分: \\d{9}表示任意数字可以出现9次,也只能出现9次
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));
        System.out.println("-----------------------------------------------");

        //验证座机电话号码
        //思路:
        //在书写座机号正则表达式时候需要把正确的数据分为三部分
        //一: 区号 0\\d{2,3}
        //二: - ?表示次数, 0次或者一次
        //三: 号码的第一次不能是以0开头, 从第二位开始可以是任意的数字,号码的总长度: 5 - 10位
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));
        System.out.println("-----------------------------------------------");

        //验证邮箱号码
        //思考:
        //在书写邮箱号码正则的时候需要把正确的数据分为三部分
        //第一部分: @的左边 \\w+
        //          任意的字母数字下划线,至少出现一次就可以了
        //第二部分:@ 只能出现一次
        //第三部分:
        //3.1 .的左边[\\w&&[^_]]{2,6}
        //任意的字母加数字,总共出现2-6次
        //3.2 . \\.
        //3.3 大写字母,小写字母都可以, 只能出现2-3次[a-zA-Z]{2,3}
        String regex3 = "\\w+@\\w{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));
    }
}
