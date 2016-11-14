package com.hm.firebase_geofire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("path/to/geofire");
        GeoFire geoFire = new GeoFire(ref);

        String roomId1 = ref.push().getKey();
        geoFire.setLocation(roomId1, new GeoLocation(37.7853889, -122.4056973));

        String roomId2 = ref.push().getKey();

        geoFire.setLocation(roomId2, new GeoLocation(37.4853889, -122.1056973));
        String roomId3 = ref.push().getKey();
        geoFire.setLocation(roomId3, new GeoLocation(37.3853889, -122.2056973));
    }
}
