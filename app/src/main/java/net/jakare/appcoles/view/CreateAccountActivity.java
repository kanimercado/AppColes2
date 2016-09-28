package net.jakare.appcoles.view;

/**
 * Created by anibalmercado on 28/9/16.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.jakare.appcoles.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        showToolbar(getResources().getString(R.string.toolbar_tittle_createaccount), true);

    }

    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
}