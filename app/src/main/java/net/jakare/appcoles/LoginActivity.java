package net.jakare.appcoles;

/**
 * Created by anibalmercado on 28/9/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.jakare.appcoles.view.ContainerActivity;
import net.jakare.appcoles.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goHome(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
