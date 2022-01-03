package rida.org.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String[] hal = {"أ ہ", "ع ح", "غ خ"};
    String[] lah  = {"ق", "ک"};
    String[] tar  = {"ل", "ن", "ر"};
    String[] nit = {"ت د ط"};
    String[] lis  = {"ظ ذ ث","س ز ص"};
    String[] sha = {"ج ش ی","ض"};
    String[] ghu  = {"م ن", "ف", "ب","و"};
    TextView mcq,ans;
    String [] a;
    int random,rnd;
    static int i=0;
    static int c=0,w=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mcq = findViewById(R.id.mcq);
        ans = findViewById(R.id.ans);
        btn1 = findViewById(R.id.hal);
        btn2 = findViewById(R.id.lah);
        btn3 = findViewById(R.id.tar);
        btn4 = findViewById(R.id.nit);
        btn5 = findViewById(R.id.lis);
        btn6 = findViewById(R.id.ghu);
        btn7 = findViewById(R.id.sha);
        btn8 = findViewById(R.id.next);

            Random ran = new Random();
            random = ran.nextInt(6);
            if (random == 0) {
                a = hal;
            } else if (random == 1) {
                a = lah;
            } else if (random == 2) {
                a = tar;
            } else if (random == 3) {
                a = nit;
            } else if (random == 4) {
                a = lis;
            } else if (random == 5) {
                a = ghu;
            } else if (random == 6) {
                a = sha;
            }
            rnd = new Random().nextInt(a.length);
            mcq.setText(String.valueOf(a[rnd]));
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(hal)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }

                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(lah)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }

                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(tar)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(nit)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(lis)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(ghu)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }
                }
            });
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (a.equals(sha)) {
                        ans.setText("Correct");
                        c++;
                    } else {
                        ans.setText("Wrong");
                        w++;
                    }
                }
            });
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i++;
                    if(i<5)
                    {
                        Intent intent=new Intent(MainActivity4.this,MainActivity4.class);
                        intent.putExtra("btn","lahatiyah");
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                        intent.putExtra("marks",c);
                        startActivity(intent);
                    }

                }
            });


    }

        
}