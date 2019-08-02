package vn.edu.poly.fragmentbai2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentLeft extends Fragment {
     EditText edtFragmentLeft;
     Button btnFragmentLeft;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view=inflater.inflate(R.layout.fragment_fragment_left, container, false);

        edtFragmentLeft=view.findViewById(R.id.edtFragmentLeft);
        btnFragmentLeft=view.findViewById(R.id.btnFragmentLeft);

        btnFragmentLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvFragmentRight=getActivity().findViewById(R.id.tvFragmentRight);
                tvFragmentRight.setText(edtFragmentLeft.getText().toString());
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
