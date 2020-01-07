package com.sheela.foodmandu.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sheela.foodmandu.R;
import com.sheela.foodmandu.ui.Contacts;
import com.sheela.foodmandu.ui.ContactsAdapter;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

RecyclerView recyclerView;
private int[] mImages = new int[]{
        R.drawable.coke, R.drawable.byanjan,R.drawable.real, R.drawable.signature
};
private String[]mImageTitle= new String[]{
        "liquor","Momo","Sauce","juice"
};
CarouselView carouselView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
         recyclerView=view.findViewById(R.id.recycleview);
         carouselView=view.findViewById(R.id.caral);
         carouselView.setPageCount(mImages.length);
         carouselView.setImageListener(new ImageListener() {
             @Override
             public void setImageForPosition(int position, ImageView imageView) {
                 imageView.setImageResource(mImages[position]);
             }
         });
         carouselView.setImageClickListener(new ImageClickListener() {
             @Override
             public void onClick(int position) {
                 Toast.makeText(getContext(),mImageTitle[position],Toast.LENGTH_SHORT).show();
             }
         });



        List<Contacts> contactsList = new ArrayList<>();
         contactsList.add(new Contacts("Restaurant",R.drawable.res));
        contactsList.add(new Contacts("Liquors",R.drawable.liquor));
        contactsList.add(new Contacts("Bakeries",R.drawable.cup));
        contactsList.add(new Contacts("Refreshment",R.drawable.ref));
        contactsList.add(new Contacts("Organic",R.drawable.o));
//        contactsList.add(new Contacts("2", R.drawable.bhaktapur));
//        contactsList.add(new Contacts("3", R.drawable.saturday));
//        contactsList.add(new Contacts("4", R.drawable.happylunch));
        ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        return view;
    }
}