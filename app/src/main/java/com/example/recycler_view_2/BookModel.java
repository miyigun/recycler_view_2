package com.example.recycler_view_2;

import java.util.ArrayList;

public class BookModel {
    int bookImageId;
    String bookName;
    String writer;

    public BookModel(int bookImageId, String bookName, String writer) {
        this.bookImageId = bookImageId;
        this.bookName = bookName;
        this.writer = writer;
    }

    public int getBookImageId() {
        return bookImageId;
    }

    public void setBookImageId(int bookImageId) {
        this.bookImageId = bookImageId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public static ArrayList<BookModel> getData() {
        ArrayList<BookModel> bookList = new ArrayList<BookModel>();
        int bookImages[] = {R.drawable.book1, R.drawable.book2, R.drawable.book3, R.drawable.book4, R.drawable.book5, R.drawable.book6,R.drawable.book7,R.drawable.book8,R.drawable.book9,R.drawable.book10,R.drawable.book11,R.drawable.book12,R.drawable.book13,R.drawable.book14,R.drawable.book15,R.drawable.book16};
        String[] bookNames = {"İnce Memed", "Martin Eden", "Nietsche Ağladığında", "Semerkand", "Kürk Mantolu Madonna", "Serenad","Savaşçı","Zar Adam","Olasılıksız","Empati","Tutunamayanlar","Da Vinci Şifresi","Ejderha Dövmeli Kız","Şu Çılgın Türkler","Babalar ve Oğullar","Suç ve Ceza"};
        String[] writers = {"Yaşar Kemal", "Jack London", "Irvin Yalom", "Amin Maolouf", "Sabahattin Ali", "Zülfü Livaneli","Doğan Cüceloğlu","Luke Rhinehart","Adam Fawer","Adam Fawer","Oğuz Atay","Dan Brown","Stieg Larson","Turgut Özakman","Ivan Turgenyev","Dostoyevski"};

        for (int i = 0; i < bookImages.length; i++) {
            BookModel book = new BookModel(bookImages[i], bookNames[i], writers[i]);
            bookList.add(book);
        }

        return bookList;
    }

}
