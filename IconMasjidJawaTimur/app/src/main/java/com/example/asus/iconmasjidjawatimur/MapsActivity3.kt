package com.example.asus.iconmasjidjawatimur

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity3 : AppCompatActivity() , OnMapReadyCallback {

    lateinit var nMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps4)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map2) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        nMap = googleMap
        val p = LatLng(-7.1526745,112.4085531)
        nMap.addMarker(MarkerOptions().position(p).title("Marker in Masjid Namira Lamongan"))
        var zoomLevel = 18.0f
        nMap.moveCamera(CameraUpdateFactory.newLatLngZoom(p, zoomLevel))
    }
}

