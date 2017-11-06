package com.example.desenvolvimento.databindandmapstrainning.ui;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.example.desenvolvimento.databindandmapstrainning.R;
import com.example.desenvolvimento.databindandmapstrainning.databinding.FragmentMapBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Desenvolvimento on 04/11/2017.
 */

public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private MapView mMapview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMapBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_map,container,false);
        View rootView = binding.getRoot();
        setFragment(rootView,savedInstanceState);
        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng point = new LatLng(-22.235489, -45.932628);
        mMap.addMarker(new MarkerOptions().position(point).title("pouso alegre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point,15));
    }

    private void setFragment(View view,Bundle saveInstaceState){
        FragmentMapBinding binding = DataBindingUtil.getBinding(view);
        mMapview = binding.mapView;
        mMapview.onCreate(saveInstaceState);
        mMapview.onResume();
        mMapview.getMapAsync(this);
    }
}
