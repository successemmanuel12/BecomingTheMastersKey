package com.success.becomingthemasterskey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.success.becomingthemasterskey.mCustomList.ListViewAdapter;
import com.success.becomingthemasterskey.mDataStore.DataStore;

public class Heading extends AppCompatActivity {
    ListView listView;
    ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heading);

        // getting the listView on the menu
        listView = findViewById(R.id.list_data);

        //creating an instance of the listViewAdapter class
        adapter = new ListViewAdapter(this, DataStore.getDataStore());

        //binding the listView with the customAdapter
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here

        int id = item.getItemId();

        if (id == R.id.abt_dev){

        }
        else if (id == R.id.settings){

        }
        return super.onOptionsItemSelected(item);
    }
}
