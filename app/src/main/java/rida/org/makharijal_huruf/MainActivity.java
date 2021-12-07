package rida.org.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.test);
        btn3= (Button) findViewById(R.id.repo);
        img1 = (ImageView) findViewById(R.id.imageView);
        img1.setBackgroundResource(R.drawable.git);
        if(btn1!=null) {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent newIntent = new Intent(MainActivity.this, MainActivity2.class);
                    newIntent.putExtra("buttonName", "btn1");
                    startActivity(newIntent);
                }
            });
        }
        if(btn2!=null) {
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent newIntent = new Intent(MainActivity.this, MainActivity4.class);
                    newIntent.putExtra("buttonName", "btn1");
                    startActivity(newIntent);
                }
            });
        }
        if(btn3!=null) {
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent newIntent;
                    String url=getString(R.string.repo_url);
                    Uri webpage=Uri.parse(url);
                    newIntent=new Intent(Intent.ACTION_VIEW,webpage);
                    startActivity(newIntent);
                }
            });
        }


    }
}