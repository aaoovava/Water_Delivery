package com.example.applicationbooooo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.applicationbooooo.databinding.FragmentThirdBinding;

import java.util.ArrayList;

public class Fr_third extends Fragment {
    public  void one (){
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

    private FragmentThirdBinding binding;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
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