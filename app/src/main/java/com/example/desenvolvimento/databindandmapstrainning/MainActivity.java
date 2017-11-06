package com.example.desenvolvimento.databindandmapstrainning;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.example.desenvolvimento.databindandmapstrainning.databinding.ActivityMainBinding;
import com.example.desenvolvimento.databindandmapstrainning.ui.ContainerFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setFragment();
    }

    private void setFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(binding.fragmetContainer.getId(), new ContainerFragment());
        ft.commit();
    }
}
