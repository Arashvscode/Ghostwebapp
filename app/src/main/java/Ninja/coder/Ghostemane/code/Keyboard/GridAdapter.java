package Ninja.coder.Ghostemane.code.Keyboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import Ninja.coder.Ghostemane.code.R;
public class GridAdapter extends BaseAdapter {
    private static LayoutInflater inflater = null;
    Context context;
    int[] imageId;

    public class Holder {
        ImageView img;
    }

    public GridAdapter(Context mainActivity, int[] prgmImages) {
        this.context = mainActivity;
        this.imageId = prgmImages;
        inflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.imageId.length;
    }

    public Object getItem(int position) {
        return Integer.valueOf(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView = inflater.inflate(R.layout.grid_row, null);
        holder.img = (ImageView) rowView.findViewById(R.id.imageView1);
        holder.img.setImageResource(this.imageId[position]);
        rowView.setBackgroundResource(R.drawable.listview_selector);
        rowView.setPadding(1, 1, 1, 1);
        return rowView;
    }
}
