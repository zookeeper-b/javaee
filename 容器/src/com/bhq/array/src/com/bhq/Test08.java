package com.bhq;

import java.util.Arrays;

//使用javabean和数据保存表格数据
public class Test08 {
    public static void main(String[] args) {
        Emp[] emps = {
                new Emp("白汉淇", 18, "教授1", "9-9"),
                new Emp("白小黑", 20, "教授2", "19-9"),
                new Emp("白二黑", 22, "教授3", "29-9")


        };

        for (Emp e : emps) {
            System.out.println(e);

        }

    }


    static class Emp {
        private String name;
        private int age;
        private String job;
        private String hiredate;

        public Emp(String name, int age, String job, String hiredate) {
            this.name = name;
            this.age = age;
            this.job = job;
            this.hiredate = hiredate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getHiredate() {
            return hiredate;
        }

        public void setHiredate(String hiredate) {
            this.hiredate = hiredate;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    ", hiredate='" + hiredate + '\'' +
                    '}';
        }
    }
}
