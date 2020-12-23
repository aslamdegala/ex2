package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private EditText editText;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
   editText=findViewById(R.id.ed1);

       button =findViewById(R.id.bt1);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

         /**     Intent i =new Intent(MainActivity2.this,MainActivity.class);
               Intent intent = i.putExtra("data", s);
               startActivity(i);
              EditText editText = (EditText)findViewById(R.id.ed1);
               String text = editText.getText().toString();

               Intent myIntent = new Intent(view.getContext(),MainActivity.class);
               myIntent.putExtra("mytext",text);
               startActivity(myIntent);**/
         String  name=editText.getText().toString();
         Intent i =new Intent(MainActivity2.this,MainActivity.class);
         i.putExtra("key",name);
         startActivity(i);






           }
       });
    }


  /**  public void op(View view) {
      /**  Intent data=new Intent();
        EditText editText=(EditText)findViewById(R.id.ed1);
        data.setData(Uri.parse(editText.getText().toString()));
        setResult(RESULT_OK,data);
        finish();
        Intent i = new Intent(getBaseContext(),MainActivity.class);

//Set the Data to pass
        EditText txtInput = (EditText)findViewById(R.id.ed1);
        String txtData = txtInput.getText().toString();
        i.putExtra("txtData", txtData);

        startActivity(i);
    }**/
}