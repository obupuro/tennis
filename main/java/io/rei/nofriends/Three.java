package io.rei.nofriends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Three extends Activity{

    private static final int FOUR = 4;
    private int mypoint;
    private int yourpoint;
    private int count1;
    private int count2;
    private TextView point01;
    private TextView point02;
    private TextView set01;
    private TextView set02;
    private TextView text01;
    private TextView text02;
    private int setpoint01;
    private int setpoint02;
    private ImageView image01;
    private int set;
    private int count;
    private int image[];
    private int an;
    private int countA;
    private int countB;
    private int countC;
    private int countD;
    private int countFault;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        Intent intent01 = getIntent();
        String textDate01 = intent01.getStringExtra("TextData01");
        Intent intent02 = getIntent();
        String textData02 = intent02.getStringExtra("TextData02");


        text01 = (TextView)findViewById(R.id.text01);
        text01.setText(textDate01);
        text02 = (TextView)findViewById(R.id.text02);
        text02.setText(textData02);

        mypoint = 0;
        yourpoint = 0;
        count1 = 0;
        count2 = 0;
        setpoint01 = 0;
        setpoint02 = 0;
        set = setpoint01 + setpoint02;
        count = count1 + count2;
        an = 0;
        image = new int[4];
        image[0] = R.drawable.left_fore;
        image[1] = R.drawable.left_back;
        image[2] = R.drawable.right_fore;
        image[3] = R.drawable.right_back;
        countA = 0;
        countB = 0;
        countC = 0;
        countD = 0;
        countFault = 0;



        point01 = (TextView)findViewById(R.id.point01);
        point01.setText(String.valueOf(mypoint));

        image01 = (ImageView)findViewById(R.id.image1);
        image01.setImageResource(image[an]);

        set01 = (TextView)findViewById(R.id.set01);
        set01.setText(String.valueOf(setpoint01));

        final Button button01 = (Button) findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == button01){

                    count1++;
                    set = setpoint01 + setpoint02;
                    count = count1 + count2;


                    if(count1 == 1){
                        mypoint = 15;
                        point01.setText(String.valueOf(mypoint));
                    }
                    if(count1 == 2){
                        mypoint = 30;
                        point01.setText(String.valueOf(mypoint));
                    }
                    if(count1 == 3){
                        mypoint = 40;
                        point01.setText(String.valueOf(mypoint));
                    }
                    if(count1 == 4){
                        if(count2 == 3){
                            point01.setText("adv");
                        }
                        if(count2 == 4) {
                            count1 = 3;
                            point01.setText(String.valueOf(mypoint));
                            count2 = 3;
                            point02.setText(String.valueOf(yourpoint));
                        }
                        if(count2 != 3 && count2 != 4){
                            count1 = 0;
                            mypoint = 0;
                            point01.setText(String.valueOf(mypoint));
                            count2 = 0;
                            yourpoint = 0;
                            point02.setText(String.valueOf(yourpoint));
                            setpoint01++;
                            set01.setText(String.valueOf(setpoint01));
                        }
                    }
                    if(count1 == 5){
                        count1 = 0;
                        mypoint = 0;
                        point01.setText(String.valueOf(mypoint));
                        count2 = 0;
                        yourpoint = 0;
                        point02.setText(String.valueOf(yourpoint));
                        setpoint01++;
                        set01.setText(String.valueOf(setpoint01));
                    }

                    if(set == 0 || set%2 == 0){
                        if(count == 0 || count%2 == 0){
                            an = 0;
                            image01.setImageResource(image[an]);
                        }else{
                            an = 1;
                            image01.setImageResource(image[an]);
                        }

                    }if(set != 0 && set%2 != 0){
                        if(count == 0 || count%2 == 0){
                            an = 2;
                            image01.setImageResource(image[an]);
                        }else{
                            an = 3;
                            image01.setImageResource(image[an]);
                        }
                    }

                }


            }
        });
        point02 = (TextView)findViewById(R.id.point02);
        point02.setText(String.valueOf(yourpoint));

        set02 = (TextView)findViewById(R.id.set02);
        set02.setText(String.valueOf(setpoint02));

        final Button button02 = (Button) findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == button02){
                    count2++;
                    count = count1 + count2;
                    set = setpoint01 + setpoint02;


                    if(count2 == 1){
                        yourpoint = 15;
                        point02.setText(String.valueOf(yourpoint));
                    }
                    if(count2 == 2){
                        yourpoint = 30;
                        point02.setText(String.valueOf(yourpoint));
                    }
                    if(count2 == 3){
                        yourpoint = 40;
                        point02.setText(String.valueOf(yourpoint));
                    }
                    if(count2 == 4){
                        if(count1 == 3){
                            point02.setText("adv");
                        }
                        if(count1 == 4) {
                            count1 = 3;
                            point01.setText(String.valueOf(mypoint));
                            count2 = 3;
                            point02.setText(String.valueOf(yourpoint));
                        }
                        if(count1 != 3 && count1 != 4){
                            count1 = 0;
                            mypoint = 0;
                            point01.setText(String.valueOf(mypoint));
                            count2 = 0;
                            yourpoint = 0;
                            point02.setText(String.valueOf(yourpoint));
                            setpoint02++;
                            set02.setText(String.valueOf(setpoint02));
                        }
                    }
                    if(count2 == 5){
                        count1 = 0;
                        mypoint = 0;
                        point01.setText(String.valueOf(mypoint));
                        count2 = 0;
                        yourpoint = 0;
                        point02.setText(String.valueOf(yourpoint));
                        setpoint02++;
                        set02.setText(String.valueOf(setpoint02));
                    }
                    if(set == 0 || set%2 == 0){
                        if(count == 0 || count%2 == 0){
                            an = 0;
                            image01.setImageResource(image[an]);
                        }else{
                            an = 1;
                            image01.setImageResource(image[an]);
                        }
                    }if(set != 0 && set%2 != 0){
                        if(count == 0 || count%2 == 0){
                            an = 2;
                            image01.setImageResource(image[an]);
                        }else{
                            an = 3;
                            image01.setImageResource(image[an]);
                        }
                    }

                }


            }
        });

        final Button cancel01 = (Button) findViewById(R.id.cancel01);
        cancel01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1--;
                if(count1 == 0){
                    mypoint = 0;
                    point01.setText(String.valueOf(mypoint));
                }
                if(count1 == 1){
                    mypoint = 15;
                    point01.setText(String.valueOf(mypoint));
                }
                if(count1 == 2){
                    mypoint = 30;
                    point01.setText(String.valueOf(mypoint));
                }
                if(count1 == 3){
                    mypoint = 40;
                    point01.setText(String.valueOf(mypoint));
                }
            }
        });

        final Button cancel02 = (Button) findViewById(R.id.cancel02);
        cancel02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2--;

                if(count2 == 0){
                    yourpoint = 0;
                    point02.setText(String.valueOf(yourpoint));
                }
                if(count2 == 1){
                    yourpoint = 15;
                    point02.setText(String.valueOf(yourpoint));
                }
                if(count2 == 2){
                    yourpoint = 30;
                    point02.setText(String.valueOf(yourpoint));
                }
                if(count2 == 3){
                    yourpoint = 40;
                    point02.setText(String.valueOf(yourpoint));
                }
            }
        });

        final Button A = (Button) findViewById(R.id.A);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countA++;
                Toast tsA = Toast.makeText(Three.this, "A", Toast.LENGTH_SHORT);
                tsA.show();

            }
        });

        final Button B = (Button) findViewById(R.id.B);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countB++;
                Toast tsB = Toast.makeText(Three.this, "B", Toast.LENGTH_SHORT);
                tsB.show();

            }
        });

        final Button C = (Button) findViewById(R.id.C);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countC++;
                Toast tsC = Toast.makeText(Three.this, "C", Toast.LENGTH_SHORT);
                tsC.show();

            }
        });

        final Button D = (Button) findViewById(R.id.D);
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countD++;
                Toast tsD = Toast.makeText(Three.this, "D", Toast.LENGTH_SHORT);
                tsD.show();
            }
        });

        final Button fault = (Button) findViewById(R.id.fault);
        fault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countFault++;
                Toast tsfault = Toast.makeText(Three.this, "fault", Toast.LENGTH_SHORT);
                tsfault.show();

            }
        });

        final Button end = (Button) findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    Intent intent = new Intent();
                    intent.setClassName("io.rei.nofriends", "io.rei.nofriends.Four");
                    intent.putExtra("CountData01", countA);
                    intent.putExtra("CountData02", countB);
                    intent.putExtra("CountData03", countC);
                    intent.putExtra("CountData04", countD);
                    startActivityForResult(intent, FOUR);


            }
        });
    }
}
