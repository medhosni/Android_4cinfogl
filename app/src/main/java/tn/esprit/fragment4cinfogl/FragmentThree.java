package tn.esprit.fragment4cinfogl;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentThree extends Fragment {

private Button gotoFrag2 ;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        gotoFrag2 = view.findViewById(R.id.gotofrag2);


        gotoFrag2.setOnClickListener(e ->{
            getActivity().
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame,new FragmentTwo())
                    .commit();
        });
        // Inflate the layout for this fragment
        return view;
    }
}