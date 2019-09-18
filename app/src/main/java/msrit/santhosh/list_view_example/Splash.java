package msrit.santhosh.list_view_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        redirect();
    }
    private void redirect(){

        boolean isFirstRun = getSharedPreferences("PREFERENCES",MODE_PRIVATE).getBoolean("isFirstRun",true);

        Intent intent;

        if (isFirstRun){
            intent = new Intent(this,MainActivity.class);
            getSharedPreferences("PREFERENCES",MODE_PRIVATE).edit().putBoolean("isFirstRun",false).commit();
        }
        else
        {
            intent = new Intent(this,custom_list.class);
           // to manage different activities
           /* int gotoactivity = getSharedPreferences("PREFERENCES",MODE_PRIVATE).getInt("wheretogo",0);

            if(gotoactivity == 0){
                intent = new Intent(this,MainActivity.class);
            }
            */
        }

        startActivity(intent);
    }
}
