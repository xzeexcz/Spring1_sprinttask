package com.kz.bitlab.SpringBoot.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 6L;
    static {
        students.add(new Student(1L, "Ilyas", "Zhuanyshev", 88, "B"));
        students.add(new Student(2L, "Serik", "Erikov", 91, "A"));
        students.add(new Student(3L, "Erik", "Serikov", 65, "C"));
        students.add(new Student(4L, "Nurzhan", "Bolatov", 48, "F"));
        students.add(new Student(5L, "Patrick", "Zuckerberg", 100, "A"));
    }
    public static void addStudent(Student student) {
        student.setId(id);
        students.add(student);
        id++;
            if (student.getExam() >= 90) {
                student.setMark("A");
            }
            if (student.getExam() >= 75 || student.getExam() < 90) {
                student.setMark("B");
            }
            if (student.getExam() >= 60 || student.getExam() < 75) {
                student.setMark("C");
            }
            if (student.getExam() >= 50 || student.getExam() < 60) {
                student.setMark("D");
            }
            if(student.getExam() < 50) {
                student.setMark("F");
            }
    }
    public static ArrayList<Student> getStudents() {
        return students;
    }
    public static Student getStudentById(Long id){
        for(Student c : students) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
