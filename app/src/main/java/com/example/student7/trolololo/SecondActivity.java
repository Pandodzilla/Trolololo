package com.example.student7.trolololo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends ActionBarActivity {

    private EditText wprowadzNumerView;
    private EditText przegladarkaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle intentExtras =getIntent().getExtras();
        String username = intentExtras.getString("username");
        TextView helloView = (TextView)findViewById(R.id.Hello);
        helloView.setText("Witaj " +username + "!");

        wprowadzNumerView = (EditText) findViewById(R.id.wprowadzNumer);
    }

    public void zadzwonClicked(View view) {
        String wprowadzNumer = wprowadzNumerView.getText().toString();

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + wprowadzNumer));
        startActivity(intent);
    }


    public void przegladarkaClicked(View view) {
        String przegladarkaInput = przegladarkaView.getText().toString();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://" + przegladarkaInput));
        startActivity(intent);

    }

    }

