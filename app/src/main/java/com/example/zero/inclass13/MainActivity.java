package com.example.zero.inclass13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main";
    ArrayList<Trip> list=new ArrayList<Trip>();
    FirebaseDatabase db= FirebaseDatabase.getInstance();
    DatabaseReference myDb=db.getReference("Deals");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView tripList=findViewById(R.id.tripListMain);


    }

    public void readFromDB(){
        String temp= myDb.push().getKey();
        myDb.child(temp).setValue("Test");
        myDb.child(temp).removeValue();
        // Read from the database
        myDb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
               Trip value = dataSnapshot.getValue(Trip.class);
                list.add(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        String temp2= myDb.push().getKey();
        myDb.child(temp2).setValue("Test");
        myDb.child(temp2).removeValue();
    }
}
