package com.company;

public class TextBox {
    public String text =""; // field


    //methods
    //setter
    public void setText(String text){
        this.text = text ; // we use the this. (that is a reference to the object) when the argument has the same name as the field.
    }

    public void clear(){
        text ="";//in this case, because there's no argument/input there's no need to use the this.

    }
}
