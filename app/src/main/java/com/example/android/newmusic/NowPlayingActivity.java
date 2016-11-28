package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.newmusic.R.id.no_longer_playing;
import static com.example.android.newmusic.R.id.search;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the no longer playing textview
        TextView noLongerPlaying = (TextView) findViewById(no_longer_playing);

        // Set a click listener on no longer playing View
        noLongerPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the no longer playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent noLongerPlayingIntent = new Intent(NowPlayingActivity.this, RecentlyPlayedActivity.class);
                startActivity(noLongerPlayingIntent);
            }
        });
    }
}
