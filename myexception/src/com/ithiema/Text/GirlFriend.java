package com.ithiema.Text;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len < 3 || len > 10){
            throw new NameFormatException(name + "姓名长度错误 (3 ~ 10)");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 40){
            throw new AgeOutOfBoundsException(age + "年龄超出范围");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "girlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
