package com.fceh.isaelemoigne.applifceh;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.QuickContactBadge;


/**
 * A simple {@link Fragment} subclass.
 */
public class Contact extends Fragment {
    QuickContactBadge EmailPic, PhonePic;


    public Contact() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_contact, container, false);
        Button button = (Button) view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Uri uri = Uri.parse("http://www.fceh.fr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        Button button2 = (Button) view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.facebook.com/fcehfoot");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        QuickContactBadge badgeMedium = (QuickContactBadge) view.findViewById(R.id.quickContactBadge);
        badgeMedium.assignContactFromPhone("0233080881", true);
        badgeMedium.setImageResource(R.drawable.ic_menu_gallery);

        QuickContactBadge badgeMedium2 = (QuickContactBadge) view.findViewById(R.id.quickContactBadge2);
        badgeMedium2.assignContactFromEmail("fceh.foot@orange.fr", true);
        badgeMedium2.setImageResource(R.drawable.ic_menu_share);

        return view;
    }
    public void onAttach(Context context){
        super.onAttach(context);
        ((Activity)context).setTitle("Contact");
    }


}
