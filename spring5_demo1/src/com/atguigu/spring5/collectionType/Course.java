package com.atguigu.spring5.collectionType;

/**
 * @author shkstart
 * @create 2022-07-28 17:51
 */
public class Course {
    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                '}';
    }
}
