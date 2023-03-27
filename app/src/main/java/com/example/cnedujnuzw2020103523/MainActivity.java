package com.example.cnedujnuzw2020103523;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=this.findViewById(R.id.button2);
        EditText editText=this.findViewById(R.id.editText2);
        TextView textView=this.findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String scores=editText.getText().toString();
                String []arrayScore=scores.split(",");
                Game game=new Game();
                for(int i=0;i<arrayScore.length;i++){
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textView.setText("score is"+game.score());
            }
        });
    }
}