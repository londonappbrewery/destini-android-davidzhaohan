package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 3 & 7 - Declare member variables here:
    private TextView story;
    private Button buttonTop;
    private Button buttonBot;

    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 4 - Wire up the 3 views from the layout to the member variables:
        story = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBot = findViewById(R.id.buttonBottom);

        // TODO: Steps 5, 6, & 8 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    story.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBot.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if(mStoryIndex == 3) {
                    story.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 5, 6, & 8 - Set a listener on the bottom button:
        buttonBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    story.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBot.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if(mStoryIndex == 2) {
                    story.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                } else if(mStoryIndex == 3) {
                    story.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                }
            }
        });


    }
}
