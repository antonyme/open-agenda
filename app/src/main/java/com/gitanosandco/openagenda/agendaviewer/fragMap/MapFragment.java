package com.gitanosandco.openagenda.agendaviewer.fragMap;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MapFragment extends SupportMapFragment implements OnMapReadyCallback {
    private GoogleMap googleMap;
    private List<MarkerOptions> markers;

    public MapFragment() {
    }

    public static MapFragment newInstance() {
        MapFragment fragment = new MapFragment();
        return fragment;
    }


    @Override
    public void onResume() {
        super.onResume();
        super.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        updateMap();
    }

    public void updateMap() {
        markers = getArguments().getParcelableArrayList("key");
        googleMap.clear();
        for(MarkerOptions marker : markers) {
            googleMap.addMarker(marker);
        }

        if(!markers.isEmpty()) {
            //zoom on markers
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (MarkerOptions marker : markers) {
                builder.include(marker.getPosition());
            }
            LatLngBounds bounds = builder.build();
            int padding = 50;
            CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, padding);
            googleMap.moveCamera(cu);
        }
    }
}
