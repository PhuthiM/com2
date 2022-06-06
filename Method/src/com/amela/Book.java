/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amela;

/**
 *
 * @author phuth
 */
public class Book {
    public  String isbn, title,type;
    public  double price;

    public Book(String isbn, String title, String type, double price) {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }

    
}
