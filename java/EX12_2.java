package com.company;
import java.util.*;

class EX12_2 {
    public static void main(String [] args){
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕",1,1));
        list.add(new Student("최빛나",1,2));
        list.add(new Student("이지영",2,1));

        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}

class Student{
    String name ="";
    int ban;
    int no;

    Student(String name,int ban, int no){
        this.name=name;
        this.ban=ban;
        this.no=no;
    }
}
