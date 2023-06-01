package com.example.arc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserPage1 extends AppCompatActivity {
    Button gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page1);
        gb = findViewById(R.id.gmailButton);
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://accounts.google.com/v3/signin/identifier?dsh=S1107955808%3A1683867830487639&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneEPQYkPP21h_llkYsS8j8iHa6aiJGal0WcuKHpuBSzttKPlIKDDUx_5Q4OLxOjO08nez5f5Dw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
