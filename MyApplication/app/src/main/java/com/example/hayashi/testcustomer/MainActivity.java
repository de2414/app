package com.example.hayashi.testcustomer;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference rdf = db.getReference("content");

        DatabaseReference reference_contacts = FirebaseDatabase.getInstance().getReference("contacts");
//        reference_contacts.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                adapter.clear();
//                for (DataSnapshot ds : dataSnapshot.getChildren() ){
//                    adapter.add(ds.child("name").getValue().toString());
//                }
//            }

        //rdf.setValue("https://uno1-716f1.firebaseapp.com/index.html");

        //DatabaseReference rdf = db.getReference("title");
        //rdf.setValue("blablabla");

        //DatabaseReference rdf = db.getReference("timeStart");
        //rdf.setValue("2017/3/30");

        //DatabaseReference rdf = db.getReference("timeEnd");
        //rdf.setValue("2017/5/5");

        // Read from the database


        rdf.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                for (DataSnapshot ds : dataSnapshot.getChildren() ){
                    adapter.add(ds.child("name").getValue().toString());
                }
                Log.d(value,"This is Debug");

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("Fail to read value","This is Debug", databaseError.toException());

            }
        });


    }
}
