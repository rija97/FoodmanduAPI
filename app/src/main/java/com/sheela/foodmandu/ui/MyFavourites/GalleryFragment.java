package com.sheela.foodmandu.ui.MyFavourites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.sheela.foodmandu.R;

public class GalleryFragment extends Fragment implements  View.OnClickListener {

    private EditText etEmail,etPassword;
    private TextView tvForgetPassword, tvCreate;
    private Button btnLogin, btnFacebook, btnGoogle;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etEmail=view.findViewById(R.id.etEmail);
        etPassword=view.findViewById(R.id.etPassword);
        tvCreate=view.findViewById(R.id.tvCreate);
        tvForgetPassword=view.findViewById(R.id.tvForgetPassword);
       btnLogin=view.findViewById(R.id.btnLogin);
      btnFacebook=view.findViewById(R.id.btnFacebook);

       btnGoogle=view.findViewById(R.id.btnGoogle);
       btnLogin.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {

    }
}