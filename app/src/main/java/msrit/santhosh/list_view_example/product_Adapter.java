package msrit.santhosh.list_view_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class product_Adapter extends ArrayAdapter<product> {

    private final Context context;
    private final ArrayList<product> values;

    public product_Adapter(Context context, ArrayList<product> list) {
        super(context,R.layout.custom_lv_design,list);
        this.context = context;
        this.values = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowview = inflater.inflate(R.layout.custom_lv_design,parent,false);

        TextView tvproduct =(TextView) rowview.findViewById(R.id.textv1);
        TextView tvprice =(TextView) rowview.findViewById(R.id.textv2);
        TextView tvdescription =(TextView) rowview.findViewById(R.id.textv3);

        ImageView ivproduct =(ImageView) rowview.findViewById(R.id.imgv1);
        ImageView ivsale =(ImageView) rowview.findViewById(R.id.imgv2);

        tvproduct.setText(values.get(position).getTitle());
        tvprice.setText("R" + values.get(position).getPrice());
        tvdescription.setText(values.get(position).getDescription());

        if (values.get(position).isSale())
        {
            ivsale.setImageResource(R.mipmap.onsale);
        }
        else
        {
            ivsale.setImageResource(R.mipmap.best_price);
        }
        if(values.get(position).getType().equals("laptop"))
        {
            ivproduct.setImageResource(R.mipmap.laptop);
        }
        else if(values.get(position).getType().equals("memory"))
        {
            ivproduct.setImageResource(R.mipmap.memory);
        }
        else if(values.get(position).getType().equals("hard_disk"))
        {
            ivproduct.setImageResource(R.mipmap.hard_disk);
        }
        else
        {
            ivproduct.setImageResource(R.mipmap.screen);
        }
        return rowview;
    }
}
