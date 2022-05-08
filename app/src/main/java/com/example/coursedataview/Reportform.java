package com.example.coursedataview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Reportform extends AppCompatActivity {
    ListView listView;
    List<Model> list;

    FirebaseAuth firebaseAuth;
    Query databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportform);
        Intent intent = getIntent();
        String CATNO = intent.getStringExtra("catnokey");

//        Toast.makeText(getApplicationContext(),CATNO,Toast.LENGTH_SHORT).show();

        listView = findViewById(R.id.reportlist);
        list = new ArrayList<>();

//        String EMAILID ="pkumaresanin@gmail.com";
//        String PASSWORD ="bd290371";
//        firebaseAuth.signInWithEmailAndPassword(EMAILID,PASSWORD).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();
//                }
//
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
//            }
//        });



//        databaseReference = FirebaseDatabase.getInstance().getReference("course");

        databaseReference = FirebaseDatabase.getInstance().getReference().child("course").orderByChild("catcode").equalTo(CATNO);

        //       databaseReference = (DatabaseReference) FirebaseDatabase.getInstance().getReference().child("course").orderByChild("catno").equalTo(CATNO);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot userSnap : snapshot.getChildren()){
                    Model model = userSnap.getValue(Model.class);
                    list.add(model);
                }
                AdapterCls adapterCls = new AdapterCls(Reportform.this,list);
                listView.setAdapter(adapterCls);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




    }
}