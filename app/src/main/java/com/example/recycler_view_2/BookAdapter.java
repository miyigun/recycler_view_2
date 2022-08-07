package com.example.recycler_view_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    ArrayList<BookModel> eBookList;
    LayoutInflater inflater;

    public BookAdapter(Context context, ArrayList<BookModel> books) {
        inflater = LayoutInflater.from(context);
        this.eBookList = books;
    }

    @NonNull
    @Override
    public BookAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.MyViewHolder holder, int position) {
        BookModel selectedBook = eBookList.get(position);
        holder.setData(selectedBook, position);
    }

    @Override
    public int getItemCount() {
        return eBookList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView bookName, writer;
        ImageView bookImage, deleteBook;

        public MyViewHolder(View itemView) {
            super(itemView);
            bookName = (TextView) itemView.findViewById(R.id.bookName);
            writer = (TextView) itemView.findViewById(R.id.bookWriter);
            bookImage = (ImageView) itemView.findViewById(R.id.bookImage);
            deleteBook = (ImageView) itemView.findViewById(R.id.deleteBook);
            deleteBook.setOnClickListener(this);

        }

        public void setData(BookModel selectedProduct, int position) {

            this.bookName.setText(selectedProduct.getBookName());
            this.writer.setText(selectedProduct.getWriter());
            this.bookImage.setImageResource(selectedProduct.getBookImageId());

        }


        @Override
        public void onClick(View v) {


        }


    }
}
