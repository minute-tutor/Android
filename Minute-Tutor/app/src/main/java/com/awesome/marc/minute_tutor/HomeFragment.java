package com.awesome.marc.minute_tutor;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }

        getActivity().setTitle(R.string.home);

        return inflater.inflate(R.layout.learn_fragment, container, false);
    }
}
