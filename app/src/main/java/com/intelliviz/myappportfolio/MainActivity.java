package com.intelliviz.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSpotifyStreamerClick(View view) {
        Toast.makeText(this, "This button will launch the Spotify Streamer app", Toast.LENGTH_LONG).show();
    }

    public void onScoresAppClick(View view) {
        Toast.makeText(this, "This button will launch the Scores app", Toast.LENGTH_LONG).show();
    }

    public void onLibraryAppClick(View view) {
        Toast.makeText(this, "This button will launch the Library app", Toast.LENGTH_LONG).show();
    }

    public void onBuildItBiggerClick(View view) {
        Toast.makeText(this, "This button will launch the Build It Bigger app", Toast.LENGTH_LONG).show();
    }

    public void onXYZReaderClick(View view) {
        Toast.makeText(this, "This button will launch the XYZ Reader app", Toast.LENGTH_LONG).show();
    }

    public void onCapStoneAppClick(View view) {
        Toast.makeText(this, "This button will launch my capstone app", Toast.LENGTH_LONG).show();
    }
}
