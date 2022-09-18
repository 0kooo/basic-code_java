package com.itheima.work3;

public class StudentLeader extends Student{
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String stuNumber, String job) {
        super(name, gender, age, stuNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static void meeting(){
        System.out.println("学生干部喜欢开会");
    }
}
