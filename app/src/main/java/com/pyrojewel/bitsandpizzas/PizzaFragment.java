package com.pyrojewel.bitsandpizzas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

public class PizzaFragment extends ListFragment {

   @Override
   public View onCreateView(LayoutInflater inflater,
                            ViewGroup container,
                            Bundle saveInstanceState) {

       ArrayAdapter<String>adapter=new ArrayAdapter<>(
               inflater.getContext(),
               android.R.layout.simple_list_item_1,
               getResources().getStringArray(R.array.pizzas)
       );//依然很难懂适配器的写法,但这货会用pizza的名称填充listview
       setListAdapter(adapter);
       return super.onCreateView(inflater,container,saveInstanceState);
   }
}