package com.intelliviz.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mSpotifyButton;
    private Button mScoresAppButton;
    private Button mLibAppButton;
    private Button mBuildItBiggerButton;
    private Button mXYZReaderButton;
    private Button mMyAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyButton = (Button)findViewById(R.id.spotify_streamer_id);
        mSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch the Spotify Streamer app", Toast.LENGTH_LONG).show();
            }
        });

        mScoresAppButton = (Button)findViewById(R.id.scores_app_id);
        mScoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch the Scores app", Toast.LENGTH_LONG).show();
            }
        });

        mLibAppButton = (Button)findViewById(R.id.lib_app_id);
        mLibAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch the Library app", Toast.LENGTH_LONG).show();
            }
        });

        mBuildItBiggerButton = (Button)findViewById(R.id.build_it_bigger_id);
        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch the Build It Bigger app", Toast.LENGTH_LONG).show();
            }
        });

        mXYZReaderButton = (Button)findViewById(R.id.xyz_reader_id);
        mXYZReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch the XYZ Reader app", Toast.LENGTH_LONG).show();
            }
        });

        mMyAppButton = (Button)findViewById(R.id.my_app_id);
        mMyAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my capstone app", Toast.LENGTH_LONG).show();
            }
        });
    }
}
