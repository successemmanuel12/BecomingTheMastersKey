package com.success.becomingthemasterskey.mCustomList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.success.becomingthemasterskey.Book;
import com.success.becomingthemasterskey.R;
import com.success.becomingthemasterskey.mDataStore.Dconstants;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Context c;
    ArrayList<Dconstants> dconstants;
    LayoutInflater inflater;


    public ListViewAdapter(Context c, ArrayList<Dconstants> dconstants){
        this.c = c;
        this.dconstants = dconstants;
    }

    @Override
    public int getCount() {
        return dconstants.size();
    }

    @Override
    public Object getItem(int position) {
        return dconstants.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("WrongConstant")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null){
            inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null){
           convertView = inflater.inflate(R.layout.list_model,parent,false);
        }

        //TextView to display list item on the custom listView
        TextView chapterTxt =  convertView.findViewById(R.id.chapterTxt);
        TextView titleTxt =  convertView.findViewById(R.id.titleTxt);

        // Strings to read the Data from the ArrayList

        final String chapter = dconstants.get(position).getChapter();
        final String title = dconstants.get(position).getTitle();
        final String body = dconstants.get(position).getBody();

        //Binding of data(reading from the array and displaying on ListView)
            chapterTxt.setText(chapter);
            titleTxt.setText(title);

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openList(chapter,title,body);
                }
            });

        return convertView;
    }

    //creating a method to open a new activity and display the item clicked
    public  void openList(String chapter, String title, String body) {
        Intent i = new Intent(c, Book.class);
        i.putExtra("CHAPTER_KEY", chapter);
        i.putExtra("TITLE_KEY", title);
        i.putExtra("BODY",body);

        c.startActivity(i);
    }
}
