package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StatisticsFragment extends Fragment {
    //
    public TinyDB tindb;
	public StatisticsFragment(TinyDB tinyDB){
         tindb = tinyDB;
    }


	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_statistics, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.txtStats);
        textView.setText(tindb.getInt("clickCount",0)+"");

        return rootView;
    }
}
