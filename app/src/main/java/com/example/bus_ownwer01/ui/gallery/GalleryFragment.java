package com.example.bus_ownwer01.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.bus_ownwer01.R;
import com.example.bus_ownwer01.model.BackgroundTask;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private TextView fname;
    private TextView lname;
    private TextView ownerMail;
    private TextView ownerContact;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        fname = root.findViewById(R.id.fName);
        fname.setText(BackgroundTask.getOwnerfirstName());
        lname=root.findViewById(R.id.lName);
        lname.setText(BackgroundTask.getOwnerlastName());
        ownerMail =root.findViewById(R.id.ownerMail);
        ownerMail.setText(BackgroundTask.getOwnerMail());
        ownerContact=root.findViewById(R.id.ownerContac);
        String phonenum= String.valueOf(BackgroundTask.getOwnerContact());
//        System.out.println(BackgroundTask.getOwnerContact());
        ownerContact.setText(phonenum);

        return root;
    }
}