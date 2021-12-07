package rida.org.makharijal_huruf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_halqiyah:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","halqiyah");
                startActivity(intent);
                return true;
            case R.id.action_lahatiyah:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","lahatiyah");
                startActivity(intent);
                return true;
            case R.id.action_shajariyah:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","shajariyah");
                startActivity(intent);
                return true;
            case R.id.action_tarfiyah:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","tarfiyah");
                startActivity(intent);
                return true;
            case R.id.action_nitEeyah:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","niteeyah");
                startActivity(intent);
                return true;
            case R.id.action_lisaveyah:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","lisaveyah");
                startActivity(intent);
                return true;
            case R.id.action_ghunna:
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("btn","ghunna");
                startActivity(intent);
                return true;


            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }
}