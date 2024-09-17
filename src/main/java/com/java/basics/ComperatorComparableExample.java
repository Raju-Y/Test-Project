package com.java.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student1 implements Comparable<Student1> {
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }


    @Override
    public int compareTo(Student1 other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

class SortByName implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.name.compareTo(s2.name);
    }

}



class     ComparableComparatorExample{
    public static void main (String [] args){
        List<Student1> StudentList= new ArrayList<>();
         StudentList.add(new Student1("Kiran", 19));
         StudentList.add(new Student1("Ravi", 20));
         StudentList.add(new Student1("Preethi", 18));
         StudentList.add(new Student1("Vijay", 21));
         StudentList.add(new Student1("Simran", 17));
         StudentList.add(new Student1("victor", 22));
         Collections.sort(StudentList);
         System.out.println("SortedByAge:"+ StudentList);
        Collections.sort(StudentList, new SortByName());
        System.out.println("SortedBYName:"+StudentList);

    }
}