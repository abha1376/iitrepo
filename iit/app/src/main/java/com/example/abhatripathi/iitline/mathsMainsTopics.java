package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mathsMainsTopics extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_topics);


        btn1=findViewById(R.id.mathsMainschapter1);
        btn2=findViewById(R.id.mathsMainschapter2);
        btn3=findViewById(R.id.mathsMainschapter3);
        btn4=findViewById(R.id.mathsMainschapter4);
        btn5=findViewById(R.id.mathsMainschapter5);
        btn6=findViewById(R.id.mathsMainschapter6);
        btn7=findViewById(R.id.mathsMainschapter7);
        btn8=findViewById(R.id.mathsMainschapter8);
        btn9=findViewById(R.id.mathsMainschapter9);
        btn10=findViewById(R.id.mathsMainschapter10);
        btn11=findViewById(R.id.mathsMainschapter11);
        btn12=findViewById(R.id.mathsMainschapter12);
        btn13=findViewById(R.id.mathsMainschapter13);
        btn14=findViewById(R.id.mathsMainschapter14);
        btn15=findViewById(R.id.mathsMainschapter15);
        btn16=findViewById(R.id.mathsMainschapter16);
        btn17=findViewById(R.id.mathsMainschapter17);
        btn18=findViewById(R.id.mathsMainschapter18);
        btn19=findViewById(R.id.mathsMainschapter19);
        btn20=findViewById(R.id.mathsMainschapter20);
        btn21=findViewById(R.id.mathsMainschapter21);
        btn22=findViewById(R.id.mathsMainschapter22);
        btn23=findViewById(R.id.mathsMainschapter23);
        btn24=findViewById(R.id.mathsMainschapter24);
        btn25=findViewById(R.id.mathsMainschapter25);
        btn26=findViewById(R.id.mathsMainschapter26);
        btn27=findViewById(R.id.mathsMainschapter27);
        btn28=findViewById(R.id.mathsMainschapter28);
        btn29=findViewById(R.id.mathsMainschapter29);
        btn30=findViewById(R.id.mathsMainschapter30);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                startActivity(i);
            }
        });
    }
}
