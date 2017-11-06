package com.example.desenvolvimento.databindandmapstrainning.ui;

import android.app.FragmentTransaction;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desenvolvimento.databindandmapstrainning.R;
import com.example.desenvolvimento.databindandmapstrainning.databinding.FragmentTextContentBinding;

/**
 * Created by Desenvolvimento on 04/11/2017.
 */

public class ContentTextFragment extends Fragment {

    private FragmentTextContentBinding mBinding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_text_content, container, false);
        View rootView = mBinding.getRoot();
        return rootView;
    }
}
