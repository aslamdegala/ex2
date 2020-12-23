package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  //  int request_Code=1;
   // TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    //  Button button;
      TextView tv1;
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /**      // Bundle extras=getIntent().getExtras();
     //   String s=extras.getString("data");
 //   textView.setText(s);
   //Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        Intent i = getIntent();
//The second parameter below is the default string returned if the value is not there.
        String txtData = i.getExtras().getString("txtData","");
textView=findViewById(R.id.tv1);
        textView.setText(txtData);
        Toast.makeText(this, txtData, Toast.LENGTH_SHORT).show();**/
 tv1=findViewById(R.id.tv1);
 String username=getIntent().getStringExtra("key");
        tv1.setText(username);
        Toast.makeText(this,username, Toast.LENGTH_SHORT).show();

    }

   public void click(View view) {
Intent i =new Intent(this,MainActivity2.class);
startActivity(i);

    }

 /**   public  void startActivityForResults(int requestCode,int resultCode,Intent data){
        if(requestCode==request_Code){
            if(resultCode==RESULT_OK){
                Toast.makeText(this,data.getData().toString(), Toast.LENGTH_SHORT).show();
                //   textView.setText(data.getData().toString());
            }
        }
    }***/
}