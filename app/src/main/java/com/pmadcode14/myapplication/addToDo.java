package com.pmadcode14.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addToDo extends AppCompatActivity {
private EditText title,description;
private Button addtodo;
Context context;
    private DBhandler dBhandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);


        title=findViewById(R.id.title_enter);
        description=findViewById(R.id.description_enter);
        addtodo=findViewById(R.id.confirmEdit_todo);
        context=this;
        addtodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usertitle=title.getText().toString();
                String userdescription=description.getText().toString();
                long started=System.currentTimeMillis();
                TodoModel toDo=new TodoModel(usertitle,userdescription,started,0);

                dBhandler.addToDo(toDo);
            }
        });

    }

}