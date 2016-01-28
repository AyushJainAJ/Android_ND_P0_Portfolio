package com.example.ayush.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String msg = "This button will open my ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSpotifyStreamer(View v)
    {
        Toast.makeText(MainActivity.this, msg+" Spotify App!", Toast.LENGTH_SHORT).show();
    }

    public void openScoresApp(View v)
    {
        Toast.makeText(MainActivity.this, msg+" Scores App!", Toast.LENGTH_SHORT).show();
    }

    public void openLibraryApp(View v)
    {
        Toast.makeText(MainActivity.this, msg+" Library App!", Toast.LENGTH_SHORT).show();
    }
    public void openBiggerApp(View v)
    {
        Toast.makeText(MainActivity.this, msg+" Make it Bigger App!", Toast.LENGTH_SHORT).show();
    }
    public void openReaderApp(View v)
    {
        Toast.makeText(MainActivity.this, msg+" XYZ Reader App!", Toast.LENGTH_SHORT).show();
    }
    public void openCapstoneApp(View v)
    {
        Toast.makeText(MainActivity.this, msg+" Capstone App!", Toast.LENGTH_SHORT).show();
    }
}
