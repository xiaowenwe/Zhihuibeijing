package app.heima.com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acer on 2015/10/21.
 */
public class MenuFrament extends Fragment {

    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list_view,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listView= (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(getActivity()
                ,android.R.layout.simple_list_item_1,android.R.id.text1,initData()));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                switch (position){
                    case 0:
                        fragment = new Fragment1();
                        break;
                    case 1:

                        fragment = new Fragment2();
                        break;
                    case 2:
                        fragment = new Fragment3();

                        break;
                    case 3:
                        fragment = new Fragment4();

                        break;
                    case 4:
                        fragment = new Fragment5();
                        break;
                }
                switchFrament(fragment);
            }
        });
    }

    private void switchFrament(Fragment fragment) {
        if(getActivity() instanceof MainActivity){
            ((MainActivity)getActivity()).switchFrament(fragment);
        }
    }

    private List<String> initData() {
        List<String>arrayList=new ArrayList<String>();
        arrayList.add("fragment1");
        arrayList.add("fragment2");
        arrayList.add("fragment3");
        arrayList.add("fragment4");
        arrayList.add("fragment5");
        return arrayList;
    }
}
