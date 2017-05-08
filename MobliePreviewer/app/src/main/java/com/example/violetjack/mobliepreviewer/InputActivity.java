package com.example.violetjack.mobliepreviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends Activity {

    private Context context;
    private String DefaultUrl = "http://10.0.0.9:8080";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        context = this;

        final EditText etUrl = (EditText) findViewById(R.id.etUrl);
        etUrl.setText(SharedPreferencesUtil.getSP(context, key.MY_URL_SP, DefaultUrl));
        Button btnEnter = (Button) findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferencesUtil.setSP(context, key.MY_URL_SP, etUrl.getText().toString());
                startActivity(new Intent(context, MainActivity.class));
            }
        });
        btnEnter.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                etUrl.setText(DefaultUrl);
                return true;
            }
        });
    }
}
