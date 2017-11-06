package com.example.desenvolvimento.databindandmapstrainning.ui;

import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.example.desenvolvimento.databindandmapstrainning.R;
import com.example.desenvolvimento.databindandmapstrainning.databinding.FragmentContainerBinding;


/**
 * Created by Desenvolvimento on 04/11/2017.
 */

public class ContainerFragment extends Fragment {

    private FragmentContainerBinding mBinding;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            MapFragmentViewModel viewModel = new MapFragmentViewModel();
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_container,container,false);
        View rootView = mBinding.getRoot();
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        mBinding.fragmentMap.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_out));
       // mBinding.fragmentContent.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.slide_down));
        ft.replace(mBinding.fragmentContent.getId(), new ContentImageFragment());
        ft.replace(mBinding.fragmentMap.getId(),new MapFragment());
        ft.commit();
    }
}
