package com.sheela.foodmandu.ui.home;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sheela.foodmandu.R;
import com.sheela.foodmandu.ui.Contacts;
import com.sheela.foodmandu.ui.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
         recyclerView=view.findViewById(R.id.recycleview);
        List<Contacts> contactsList = new ArrayList<>();
    contactsList.add(new Contacts("1", R.drawable.fonepay));
        contactsList.add(new Contacts("2", R.drawable.bhaktapur));
        contactsList.add(new Contacts("3", R.drawable.saturday));
        contactsList.add(new Contacts("4", R.drawable.happylunch));
        ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}