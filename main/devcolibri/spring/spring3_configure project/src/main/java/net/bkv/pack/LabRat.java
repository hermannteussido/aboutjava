package net.bkv.pack;

/**
 * Created by bkv on 14.11.2014.
 */
public class LabRat {
    String text;
    String name;

    public LabRat(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println(text);
    }
}
