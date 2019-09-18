package msrit.santhosh.list_view_example;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class custom_list extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview);

        ArrayList<product> list;
        list=new ArrayList<product>();
        ListView lv=findViewById(R.id.custum_lv);

        product product1 = new product("Dell Latitude 3500",
                "The world's most secure, most manageable and most reliable business-class laptops.",
                "laptop",
                14500.99,
                true);
        product product2 = new product("Acer Aspire 7",
                "Revolutionary convertible computers that feature powerful innovation and forward-thinking design.",
                "laptop",
                12500.99,
                false);
        product product3 = new product("SANDISK 16 GB Cruzer",
                "Low-cost, no-nonsense way of storing and transporting files.",
                "memory",
                299.99,
                false);
        product product4 = new product("Verbatim 1TB",
                "Verbatim's portable hard drive product offerings are exceptionally reliable and fashionably thin.",
                "hard_disk",
                1020.99,
                false);

        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        product_Adapter adapter=new product_Adapter(this,list);

        lv.setAdapter(adapter);
    }

}
