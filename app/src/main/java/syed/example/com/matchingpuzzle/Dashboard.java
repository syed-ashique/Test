package syed.example.com.matchingpuzzle;

import android.os.Debug;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Dashboard extends ActionBarActivity implements OnClickListener {


    Button play;
    TextView text;

    //ddfdsf


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        System.out.print("test>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..");
        play = (Button) findViewById(R.id.play );
        text = (TextView) findViewById(R.id.textView);

        play.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
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

    @Override
    public void onClick(View v) {
        text.setText("ashi");
//        Toast.makeText(Dashboard.this, "test", Toast.LENGTH_LONG).show();
    }
}
