package com.example.desenvolvimento.databindandmapstrainning.ui;

import android.databinding.DataBindingUtil;
import android.view.View;

import com.example.desenvolvimento.databindandmapstrainning.R;
import com.example.desenvolvimento.databindandmapstrainning.databinding.FragmentContainerBinding;

/**
 * Created by Desenvolvimento on 05/11/2017.
 */

public class MapFragmentViewModel {
    FragmentContainerBinding mBinding;
    public View.OnClickListener onButtonClick(View vi){
        return View ->{
            mBinding = DataBindingUtil.bind(vi);
        };
    }
}
