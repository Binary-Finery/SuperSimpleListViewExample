package spencerstudios.com.supersimplelistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        //Strings to populate list view with...
        String[] listViewItems = {"India", "England", "America", "Spain", "China", "Africa"};

        //populate list view with the string array by passing the array to
        //the ListViewAdapter constructor, along with the context (this)...
        listView.setAdapter(new ListViewAdapter(this, listViewItems));

        //set up a listener for the list view to grab click events...
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //grab the text of the list view item clicked on...
                TextView tv = (TextView) view.findViewById(R.id.text_view);
                String text = tv.getText().toString();
                //display a toast of the string...
                Toast.makeText(getApplicationContext(),
                        "You clicked " + text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
