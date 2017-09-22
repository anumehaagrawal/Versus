package org.ieeenitk.versus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        findViewById(R.id.button_proceed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = ((EditText)findViewById(R.id.text_input)).getText().toString();
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                intent.putExtra("LeagueID", id);
                startActivity(intent);
            }
        });
    }
}
