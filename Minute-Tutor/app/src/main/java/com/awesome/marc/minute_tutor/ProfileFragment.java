package com.awesome.marc.minute_tutor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }

        getActivity().setTitle(R.string.profile);

        return inflater.inflate(R.layout.profile_fragment, container, false);
    }
}
