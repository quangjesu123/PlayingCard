package com.example.playingcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView card1, card2, card3;
    TextView point;
    Button btPlay;
    int a, b, c, sum;
    boolean check1 = true;
    boolean check2 = true;
    boolean check3 = true;

    ArrayList<Card> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        point = findViewById(R.id.point);
        btPlay = findViewById(R.id.play);
        list = new ArrayList<>();
        list.add(new Card(R.drawable.mot, 1));
        list.add(new Card(R.drawable.hai, 2));
        list.add(new Card(R.drawable.ba, 3));
        list.add(new Card(R.drawable.bon, 4));
        list.add(new Card(R.drawable.nam, 5));
        list.add(new Card(R.drawable.sau, 6));
        list.add(new Card(R.drawable.bay, 7));
        list.add(new Card(R.drawable.tam, 8));
        list.add(new Card(R.drawable.chin, 9));
        list.add(new Card(R.drawable.muoi, 10));

        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= new Random().nextInt(list.size());
                b= new Random().nextInt(list.size());
                c= new Random().nextInt(list.size());
                sum=(a+b+c)+3;
                if(sum>10){
                    sum=sum%10;
                }
                if(sum==10){
                    sum=0;
                }
                Log.d("AAA",a+"-"+b+"-"+c);
                point.setText(sum+"");
                point.setVisibility(View.VISIBLE);
                card1.setImageResource(list.get(a).getiD());
                card1.setVisibility(View.VISIBLE);
                card2.setImageResource(list.get(b).getiD());
                card2.setVisibility(View.VISIBLE);
                card3.setImageResource(list.get(c).getiD());
                card3.setVisibility(View.VISIBLE);
            }
        });
    }




    private int randomNumber() {
        Random rand = new Random();
        int num = rand.nextInt(list.size());
        return num;
    }



}
