/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop11;

/**
 *
 * @author hakan
 */
public class Lesson {
    private String Lesson_Name;
    private String Semester;
    private int mark;


    public String getLesson_Name() {
        return Lesson_Name;
    }

    public void setLesson_Name(String lesson_Name) {
        Lesson_Name = lesson_Name;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
