package com.company;


import java.util.Locale;

public class Main {



    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2  = textBox1;
        textBox2.setText("hey what's wrong with you?");
        System.out.println(textBox1.text);
    }

}


