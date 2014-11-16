package rauniyar.com.portfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * Created by Rauniyar on 11/2/2014.
 */
public class Portfolio extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_portfolio, container, false);

        ImageButton portfolioInfo = (ImageButton)rootView.findViewById(R.id.portfolioInformation);
        portfolioInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), portfolioActivity.class));
            }
        });

        ImageButton taxAppoInfo = (ImageButton)rootView.findViewById(R.id.taxappInformation);
        taxAppoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), taxAppActivity.class));
            }
        });

        ImageButton csuAppInfo = (ImageButton)rootView.findViewById(R.id.csuappInformation);
        csuAppInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), csuAppActivity.class));
            }
        });
        return rootView;
    }
}
