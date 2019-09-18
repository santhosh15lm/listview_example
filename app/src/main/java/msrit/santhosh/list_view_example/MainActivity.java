package msrit.santhosh.list_view_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] array_string = getResources().getStringArray(R.array.names);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,array_string);

        ListView lv=(ListView)findViewById(R.id.id_list_view);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(getApplicationContext(), custom_list.class);
                    startActivity(intent);
                }
            }
        });

    }
}
