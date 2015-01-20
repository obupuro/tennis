package io.rei.nofriends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Two extends Activity{

    private static final int THREE = 3;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);


        Button button02 = (Button) findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText textBox01 = (EditText) findViewById(R.id.textBox01);
                String text01 = textBox01.getText().toString();

                EditText textBox02 = (EditText) findViewById(R.id.textBox02);
                String text02 = textBox02.getText().toString();


                Intent intent = new Intent();
                intent.setClassName("io.rei.nofriends", "io.rei.nofriends.Three");
                intent.putExtra("TextData01", text01);
                intent.putExtra("TextData02", text02);
                startActivityForResult(intent, THREE);

            }
        });





    }
}
