package com.design.quickexamprep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.adapters.MyTestListAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyTestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyTestFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyTestFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyTestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyTestFragment newInstance(String param1, String param2) {
        MyTestFragment fragment = new MyTestFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_test, container, false);
        RecyclerView rv_all_exams = view.findViewById(R.id.my_tests_rv);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("કમ્પ્યુટર ના પ્રકારો");
        arrayList.add("કમ્પ્યુટર ની પેઢીઓ");
        arrayList.add("Articles");
        arrayList.add("Prepositions");

        MyTestListAdapter myTestListAdapter = new MyTestListAdapter(getContext(), arrayList);
        rv_all_exams.setAdapter(myTestListAdapter);
        return view;
    }
}