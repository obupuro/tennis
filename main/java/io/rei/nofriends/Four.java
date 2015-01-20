package io.rei.nofriends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Four extends Activity{

    private TextView text01;
    private TextView text02;
    private TextView text03;
    private TextView text04;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        Intent intent01 = getIntent();
        String textDate01 = intent01.getStringExtra("CountData01");
        Intent intent02 = getIntent();
        String textData02 = intent02.getStringExtra("CountData02");
        Intent intent03 = getIntent();
        String textDate03 = intent03.getStringExtra("CountData03");
        Intent intent04 = getIntent();
        String textData04 = intent04.getStringExtra("CountData04");


        text01 = (TextView)findViewById(R.id.Text01);
        text01.setText(textDate01);
        text02 = (TextView)findViewById(R.id.Text02);
        text02.setText(textData02);
        text03 = (TextView)findViewById(R.id.Text03);
        text03.setText(textDate03);
        text04 = (TextView)findViewById(R.id.Text04);
        text04.setText(textData04);



    }
}
