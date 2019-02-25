package com.enggemy22.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int number1=0;
int number2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void points1(View view) {
        number1+=3;
         text1(number1);
    }


    public void points2(View view) {
        number1+=2;
        text1(number1);
    }

    public void points3(View view) {
        number1+=1;
        text1(number1);
    }

    public void points4(View view) {
        number2+=3;
        text2(number2);
    }

    public void points5(View view) {
        number2+=2;
        text2(number2);
    }

    public void points6(View view) {
        number2+=1;
        text2(number2);
    }

    public void reseat(View view) {
    number1=0;
    number2=0;
    text1(number1);
    text2(number2);
    }
    public  void  text1(int number)
    {
        TextView text1= (TextView)findViewById(R.id.text1);
        text1.setText(String.valueOf(number));

    }

    public void text2(int number)
    {
        TextView text2=(TextView)findViewById(R.id.text2);
        text2.setText(String.valueOf(number));

    }

   /* private  void display1(String message)
    {
        //String message;
        TextView text3=(TextView)findViewById(R.id.text3);
        message="Team1 is win :3d)";
        text3.setText(message);

    }
    private  void display2(String message)
    {

        TextView text3=(TextView)findViewById(R.id.text3);
        message="Team2 is win :3d)";
        text3.setText(message);

    }

    public void sum(View view) {

    }
    */
}
