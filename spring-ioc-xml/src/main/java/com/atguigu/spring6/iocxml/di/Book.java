package com.atguigu.spring6.iocxml.di;

public class Book {
    private  String bname;
    private  String author;

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

     // 生成set方法

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void run () {
        System.out.println("bname"+bname+"author"+author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    //    public static void main(String[] args) {
//        // set 方法注入
////        Book book = new Book();
////        book.setBname("java");
////        book.setAuthor("尚硅谷");
//
//        // 通过构造器注入
//        Book book = new Book("java","尚硅谷");
//    }
}
