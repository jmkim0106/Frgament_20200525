package com.example.frgament_20200525.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.frgament_20200525.R;
import com.example.frgament_20200525.databinding.FragmentSecondBinding;

public class SecondFragment extends BaseFragment {

    FragmentSecondBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvnets();
        setValues();
    }

    @Override
    public void setupEvnets() {

        binding.toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "두번째 프래그먼트 입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setValues() {

    }
}
