package com.awesome.marc.minute_tutor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }

        getActivity().setTitle(R.string.settings);

        return inflater.inflate(R.layout.settings_fragment, container, false);
    }
}
