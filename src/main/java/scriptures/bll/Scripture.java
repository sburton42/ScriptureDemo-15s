/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scriptures.bll;

/**
 *
 * @author sburton
 */
public class Scripture {
    private String book;
    private int chapter;
    private int verse;
    private int id;

    public Scripture(String book, int chapter, int verse) {
        this.id = -1;
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
    }

    public Scripture(int id, String book, int chapter, int verse) {
        this.id = id;
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
    }

    public Scripture() {
        id = -1;
        book = "Adam";
        chapter = 1;
        verse = 1;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getVerse() {
        return verse;
    }

    public void setVerse(int verse) {
        this.verse = verse;
    }

    @Override
    public String toString() {
        return book + " " + chapter + ":" + verse;
    }
    
    
}
