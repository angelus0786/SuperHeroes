package mx.edu.itsmt.angelus.superheroes;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WonderFragment extends Fragment {


    public WonderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      // return inflater.inflate(R.layout.fragment_wonder, container, false);
       View view = inflater.inflate(R.layout.fragment_wonder, container, false);
               return view;
    }

}
