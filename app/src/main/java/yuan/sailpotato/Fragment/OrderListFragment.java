package yuan.sailpotato.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

import yuan.sailpotato.Model.Order;
import yuan.sailpotato.adapter.OrdersAdapter;

/**
 * Created by Administrator on 2015/7/4.
 */
public class OrderListFragment extends CustomListFragment {
    List<Order> orders= new ArrayList<>();
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        orders.add(new Order("","",""));
        orders.add(new Order("","",""));
        orders.add(new Order("","",""));
        orders.add(new Order("","",""));
        orders.add(new Order("","",""));
        orders.add(new Order("","",""));


    }

    @Override
    public ListAdapter getAdapter() {
        return new OrdersAdapter(getActivity(),orders);
    }
}
