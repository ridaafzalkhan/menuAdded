package rida.org.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        int marks=getIntent().getIntExtra("marks",0);
        m = findViewById(R.id.marks);
        m.setText(String.valueOf(marks+"/"+5));
    }
}