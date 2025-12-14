package com.codingshuttle.youtube.LearningRESTAPIs.practices;


class College {

    static class Student {
        void getStudentInfo() {
            System.out.println("This is student info");
        }
    }

    void getDetails() {
        Student st = new Student();
        st.getStudentInfo();
    }
}

public class InnerClassExample {

    public  static void main(String[] args) {
        College c1 = new College();
        c1.getDetails();
    }
}


/*

output ->

This is student info

Process finished with exit code 0

 */