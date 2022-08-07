package com.example.recycler_view_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    ArrayList<BookModel> eBookList;
    LayoutInflater inflater;
    Context context;

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
        ImageView bookImage, addShoppingCart;

        public MyViewHolder(View itemView) {
            super(itemView);
            bookName = (TextView) itemView.findViewById(R.id.bookName);
            writer = (TextView) itemView.findViewById(R.id.bookWriter);
            bookImage = (ImageView) itemView.findViewById(R.id.bookImage);
            addShoppingCart = (ImageView) itemView.findViewById(R.id.buyBook);
            addShoppingCart.setOnClickListener(this);

        }

        public void setData(BookModel selectedBook, int position) {

            this.bookName.setText(selectedBook.getBookName());
            this.writer.setText(selectedBook.getWriter());
            this.bookImage.setImageResource(selectedBook.getBookImageId());

        }


        @Override
        public void onClick(View v) {
            if (v == addShoppingCart) {
                System.out.println("Book "+(getLayoutPosition()+1)+" selected");
            }
        }

    }


}
