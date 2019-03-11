package com.example.matthew.calendarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
import java.util.Random;


public class AddingActivity extends AppCompatActivity {

    // Google Firebase Database References
    //private DatabaseReference myRef;
    //private FirebaseDatabase database;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

        //database = FirebaseDatabase.getInstance();
        //myRef = database.getReference("Events");

    }

    public void EventAdding(View view) {
        EditText editName = findViewById(R.id.editTextTitle);
        String title = editName.getText().toString();

        EditText t_text = findViewById(R.id.editTextTime);
        String text_time = t_text.getText().toString();

        EditText d_text = findViewById(R.id.editTextDescription);
        String text_description = d_text.getText().toString();


        if (title.length() == 0 || text_time.length() == 0 ) {
            Toast.makeText(this, "Try again: Area Left Blank ", Toast.LENGTH_LONG).show();

        } else {

            Bundle extras = getIntent().getExtras();
            if( extras != null ) {
                date = extras.getString("USER DATE");
            }

            Date user_date = new Date(date);
            Event event = new Event(title, user_date, text_description, text_time);
            //myRef.child(str_id).setValue(event);
            Toast.makeText(this, event.getTitle() + " successfully added and saved", Toast.LENGTH_LONG).show();

        }

        // Resets fields
        editName.setText("");
        t_text.setText("");
        d_text.setText("");


    }


    public void menu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
