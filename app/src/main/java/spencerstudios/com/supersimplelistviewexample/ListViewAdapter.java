package spencerstudios.com.supersimplelistviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

    private String[] items;
    private LayoutInflater layoutInflater;

    //grab the context and the string array passed in from main activity...
    public ListViewAdapter(Context context, String[] items) {
        this.items = items;
        //layout inflater simply inflates an XML
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate the layout that contains our text view so we can
        //set its text using the strings in the array...
        convertView = layoutInflater.inflate(R.layout.list_view_item_layout, null);
        TextView text = (TextView) convertView.findViewById(R.id.text_view);

        text.setText(items[position]);

        return convertView;
    }
}
