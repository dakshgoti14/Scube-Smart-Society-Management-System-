package com.example.scube;

public class Item {

    private int imageResource1, imageResource2;
    private String title;

    public Item() {
        //it should be empty
    }

    public Item(int imageResource1, int imageResource2, String title) {
        this.imageResource1 = imageResource1;
        this.imageResource2 = imageResource2;
        this.title = title;
    }


    public int getImageResource1() {
        return imageResource1;
    }

    public void setImageResource1(int imageResource1) {
        this.imageResource1 = imageResource1;
    }

    public int getImageResource2() {
        return imageResource2;
    }

    public void setImageResource2(int imageResource2) {
        this.imageResource2 = imageResource2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
