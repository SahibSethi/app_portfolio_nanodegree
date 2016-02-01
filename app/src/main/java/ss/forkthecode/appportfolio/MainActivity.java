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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onSpotify(View view){
        Toast.makeText(this, "This button will launch my spotify app", Toast.LENGTH_LONG).show();
    }

    public void onScores(View view){
        Toast.makeText(this,"This button will launch my scores app", Toast.LENGTH_LONG).show();
    }

    public void onLibrary(View view){
        Toast.makeText(this,"This button will launch my library app", Toast.LENGTH_LONG).show();
    }

    public void onBuild(View view){
        Toast.makeText(this,"This button will launch my build app", Toast.LENGTH_LONG).show();
    }

    public void onReader(View view){
        Toast.makeText(this,"This button will launch my reader app", Toast.LENGTH_LONG).show();
    }

    public void onCapstone(View view){
        Toast.makeText(this,"This button will launch my capstone app", Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
