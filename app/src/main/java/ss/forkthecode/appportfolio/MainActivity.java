package ss.forkthecode.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAppClick(View view){

        switch(view.getId()){
            case R.id.button1 :
                Toast.makeText(this, "This button will launch my spotify app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2 :
                Toast.makeText(this,"This button will launch my scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3 :
                Toast.makeText(this,"This button will launch my library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4 :
                Toast.makeText(this,"This button will launch my build app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5 :
                Toast.makeText(this,"This button will launch my reader app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6 :
                Toast.makeText(this,"This button will launch my capstone app", Toast.LENGTH_SHORT).show();
                break;

        }


    }



}
