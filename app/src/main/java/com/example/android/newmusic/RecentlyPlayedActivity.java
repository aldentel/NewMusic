package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.newmusic.R.id.new_releases;
import static com.example.android.newmusic.R.id.recently_played_choice;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        // Find the View that shows the recently played choice textview
        TextView recentlyPlayedChoice = (TextView) findViewById(recently_played_choice);

        // Set a click listener on recently played choice View
        recentlyPlayedChoice.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recently played choice View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentlyPlayedChoiceIntent = new Intent(RecentlyPlayedActivity.this, NowPlayingActivity.class);
                startActivity(recentlyPlayedChoiceIntent);
            }
        });
    }
}
