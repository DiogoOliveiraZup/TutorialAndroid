package com.zupteste.testefilmesdiogooliveira.zuptestefilmesdiogooliveira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editbox;
    private Button insertButton;
    private ListView notesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editbox = (EditText) findViewById(R.id.edit_box);
        insertButton = (Button) findViewById(R.id.insert_button);
        notesList = (ListView) findViewById(R.id.notes_list);

        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String texto = editbox.getText().toString();

                finish();

            }
        });

        //TextView view = new TextView(this);
        //view.setText("Coco");
        //setContentView(view);
        //setContentView(R.layout.activity_main);


            }
}
