package com.example.desenvolvimento.databindandmapstrainning.ui;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desenvolvimento.databindandmapstrainning.R;
import com.example.desenvolvimento.databindandmapstrainning.databinding.FragmentImageContentBinding;

/**
 * Created by Desenvolvimento on 04/11/2017.
 */

public class ContentImageFragment extends Fragment {

    private FragmentImageContentBinding mBinding;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_image_content, container, false);
        View rootView = mBinding.getRoot();
        return rootView;
    }
}
