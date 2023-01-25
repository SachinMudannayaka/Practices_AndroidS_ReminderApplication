package com.pmadcode14.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class edit_todo extends AppCompatActivity {
private EditText title,description;
private Button editConfBtn;

private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todo);

        title=findViewById(R.id.title_edit);
        description=findViewById(R.id.description_edit);
        editConfBtn=findViewById(R.id.confirmEdit_todo);
        context=this;





    }


}