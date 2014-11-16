package rauniyar.com.portfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * Created by Rauniyar on 11/2/2014.
 */
public class Profile extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_myprofile, container, false);

       ImageView facebook = (ImageView) rootView.findViewById(R.id.facebookImageView);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), facebookActivity.class));
            }
        });

        ImageView linkedIn = (ImageView) rootView.findViewById(R.id.linkedInImageView);
        linkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), linkedInActivity.class));
            }
        });

        ImageView gitHub = (ImageView) rootView.findViewById(R.id.githubImageView);
        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), githubActivity.class));
            }
        });

        ImageView googlePlus = (ImageView) rootView.findViewById(R.id.googleImageView);
        googlePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), googlePlusActivity.class));
            }
        });

        ImageView gmail = (ImageView) rootView.findViewById(R.id.gmailImageView);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getActivity(), gmailActivity.class));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"chandankkrr@gmail.com"});
                intent.putExtra("android.intent.extra.SUBJECT", "RE: Contact");
                intent.putExtra("android.intent.extra.TEXT", "");
                getActivity().startActivity(Intent.createChooser(intent, "Send your email in:"));
            }
        });


        return rootView;
    }
}
