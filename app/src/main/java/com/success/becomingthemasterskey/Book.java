package com.success.becomingthemasterskey;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.TextView;

public class Book extends AppCompatActivity {

    TextView chapterTxt, titleTxt, bodyTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        chapterTxt = findViewById(R.id.chapter_selected);
        titleTxt = findViewById(R.id.text_title);
        bodyTxt = findViewById(R.id.text_body);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            bodyTxt.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        }

        Intent i = this.getIntent();

        final String chapter = i.getExtras().getString("CHAPTER_KEY");
        final String title = i.getExtras().getString("TITLE_KEY");
        final String body = i.getExtras().getString("BODY");

        chapterTxt.setText(chapter);
        titleTxt.setText(title);
        bodyTxt.setText(body);

    }
}
