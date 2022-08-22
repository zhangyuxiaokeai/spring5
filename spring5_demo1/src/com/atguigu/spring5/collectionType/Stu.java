package com.atguigu.spring5.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-07-28 17:19
 */
public class Stu {
    //数组经验的属性
    private  String[] course;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> set;

    //学生所学多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "course=" + Arrays.toString(course) +
                ", list=" + list +
                ", maps=" + maps +
                ", set=" + set +
                ", courseList=" + courseList +
                '}';
    }
}
