package com.stankin.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //https://github.com/p5ych0p41h/mygame
    TextView textViewCount;
    Button buttonClick;
    ImageView imageViewPerson;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.text_view_count);
        buttonClick = findViewById(R.id.button_click);
        imageViewPerson = findViewById(R.id.image_view_person);
        count = 0;

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textViewCount.setText(count + " ");
                switch(count){
                    case 5:
                        imageViewPerson.setImageResource(R.drawable.ic_launcher_foreground);
                        break;
                }
            }
        });
    }
}