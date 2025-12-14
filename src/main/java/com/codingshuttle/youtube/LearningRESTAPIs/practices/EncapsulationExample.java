package com.codingshuttle.youtube.LearningRESTAPIs.practices;

class Student {

    private int age;

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
       Student s = new Student();
       s.setAge(5);
       System.out.println("Age: " + s.getAge());
    }
}
