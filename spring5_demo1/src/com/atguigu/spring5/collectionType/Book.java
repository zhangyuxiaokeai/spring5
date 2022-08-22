package com.atguigu.spring5.collectionType;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-07-28 18:02
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
