package space.troyhatch.gadgetsapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] gadgets = {"iPhone 10", "Google Pixel 2 XL", "Microsoft Surface Laptop", "Zolo Liberty+", "Anker Soundcore"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,gadgets));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){

        switch(position){
            case 0:

                break;
        }
    }
}
