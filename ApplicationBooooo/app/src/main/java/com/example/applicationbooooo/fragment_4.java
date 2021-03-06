package com.example.applicationbooooo;

import static android.Manifest.permission.CALL_PHONE;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.applicationbooooo.databinding.Fragment4Binding;
import com.example.applicationbooooo.databinding.FragmentSecond2Binding;
import com.example.applicationbooooo.databinding.FragmentThirdBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.HashMap;

public class fragment_4 extends Fragment {

    private Fragment4Binding binding;
    public void one (){
        if(binding.imageViewOne.getVisibility() == View.VISIBLE ){
            binding.imageViewOne.setVisibility(View.INVISIBLE);
            binding.imageViewSecond.setVisibility(View.VISIBLE);
            binding.textView16.setText("20л");


        }
        else if (binding.imageViewSecond.getVisibility() == View.VISIBLE ){
            binding.imageViewSecond.setVisibility(View.INVISIBLE);
            binding.imageViewOne.setVisibility(View.VISIBLE);
            binding.textView16.setText("1.5л");
        }
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = Fragment4Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.bTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dial = "tel:12121211"  ;
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));


            }
        });
        binding.Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            one();
                //binding.imageViewOne.setVisibility(View.VISIBLE);

            }
        });
        binding.Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                one();
                //binding.imageViewOne.setVisibility(View.VISIBLE);

            }


        });
        binding.bTel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.ua/maps/place/Платежный+терминал+EasyPay/@49.960597,33.6186643,16z/data=!4m5!3m4!1s0x40d7b34269a63a09:0x8c9b449eecb5b78a!8m2!3d49.95936!4d33.6265731?hl=ru"));
                startActivity(browserIntent);
            }
        });
    }
    public void slepp() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}