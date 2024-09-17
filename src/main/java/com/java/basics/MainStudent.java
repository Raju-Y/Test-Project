package com.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String [] args){
        List<Student>StudentData = Arrays.asList(new Student("priya",97),new Student("Ram",88), new Student("Kirthi",75), new Student("Ajay",75), new Student("Ajrun",75), new Student("Rasmi",88),new Student("Raju",98), new Student("Sunny",97), new Student("Meenu",98));
        Map<Integer,List<String>>StudentByMarks = StudentData.stream()
                .collect(Collectors.groupingBy(Student::getMarks,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(StudentByMarks);
    }
}
class Student {
    String name;
    int marks;
    Student (String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }

}