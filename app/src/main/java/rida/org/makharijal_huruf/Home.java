package rida.org.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       Intent intent = new Intent(Home.this, MainActivity3.class);
        intent.putExtra("btn","lahatiyah");
        startActivity(intent);
    }
}