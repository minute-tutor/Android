package com.awesome.marc.minute_tutor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyStudentsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }

        getActivity().setTitle(R.string.my_students);

        return inflater.inflate(R.layout.my_students_fragment, container, false);
    }
}
