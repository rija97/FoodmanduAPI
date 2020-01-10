package com.sheela.foodmandu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheela.foodmandu.R;
import com.sheela.foodmandu.model.Contacts;

import java.util.List;

public class ContactsAdapter  extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;
    private ContactsViewHolder holder;
    private int position;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts, parent, false);
        return new ContactsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
//        Contacts contacts = contactsList.get(position);
//        holder.imgProfile.setImageResource(contacts.getimageId());
//        holder.tvName.setText(contacts.getName());
//        holder.tvPhoneNo.setText(contacts.getPhoneNo());
        final Contacts contacts=contactsList.get(i);
        contactsViewHolder.imgProfile.setImageResource(contacts.getImageId());
        contactsViewHolder.txtNaame.setText(contacts.getName());



    }
//


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

       ImageView imgProfile;
       TextView txtNaame;


        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
           imgProfile = itemView.findViewById(R.id.imgProfile);
           txtNaame=itemView.findViewById(R.id.txtNaame);






        }

    }
}
