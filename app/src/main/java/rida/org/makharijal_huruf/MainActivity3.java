package rida.org.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView name,arabic,des;
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String btn=getIntent().getStringExtra("btn");
        if(btn.equals("halqiyah"))
        {
            name=findViewById(R.id.name);
            name.setText("Halqiyah");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("       أ ہ").append("\n\n").append("       ع ح").append("\n\n").append("       غ خ").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("End of Throat \n\nMiddle of Throat \n\nStart of the Throat");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.hal);


        }
        else if(btn.equals("tarfiyah"))
        {
            name=findViewById(R.id.name);
            name.setText("Tarfiyah");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("           ل ").append("\n\n").append("\n").append("\n").append("         ن").append("\n\n\n\n").append("         ر").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("Rounded tip of the tongue touching the base of the frontal 8 teeth\n\nRounded tip of the tongue touching the base of the frontal 6 teeth\n\nRounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.tar);


        }
        else if(btn.equals("lahatiyah"))
        {
            name=findViewById(R.id.name);
            name.setText("lahatiyah");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("         ق").append("\n\n").append("\n").append("\n").append("         ک").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("Base of Tongue which is near Uvula touching the mouth roof \n\nPortion of Tongue near its base touching the roof of mouth");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.lah);


        }
        else if(btn.equals("shajariyah"))
        {
            name=findViewById(R.id.name);
            name.setText("Shajariyah");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("       ج ش ی ").append("\n\n").append("\n").append("         ض").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("Tongue touching the center of the mouth roof \n\nOne side of the tongue touching the molar teeth");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.sha);


        }
        else if(btn.equals("niteeyah"))
        {
            name=findViewById(R.id.name);
            name.setText("Niteeyah");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("      ت د ط ").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("Tip of the tongue touching the base of the front 2 teeth");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.nit);


        }
        else if(btn.equals("lisaveyah"))
        {
            name=findViewById(R.id.name);
            name.setText("Lisaveyah");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("    ظ  ذ  ث").append("\n\n").append("\n").append("\n").append("      ص ز س").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("Tip of the tongue touching the tip of the frontal 2 teeth\n\nTip of the tongue comes between the front top and bottom teeth");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.lis);


        }
        else if(btn.equals("ghunna"))
        {
            name=findViewById(R.id.name);
            name.setText("Ghunna");
            arabic = (TextView)findViewById(R.id.arabic);
            arabic.setText(new StringBuilder().append("          م ن ").append("\n\n").append("\n").append("\n").append("         ک").toString());
            des=(TextView) findViewById(R.id.description);
            des.setText("While pronouncing the ending sound of  م  or ن , bring the vibration to the nose");
            img1 = (ImageView) findViewById(R.id.imageView3);
            img1.setBackgroundResource(R.drawable.ghu);


        }

    }
}