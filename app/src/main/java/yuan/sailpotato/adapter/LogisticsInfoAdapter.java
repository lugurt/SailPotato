package yuan.sailpotato.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import yuan.sailpotato.Model.LogisticsInfo;
import yuan.sailpotato.Model.Order;
import yuan.sailpotato.R;

/**
 * Created by Administrator on 2015/6/30.
 */
public class LogisticsInfoAdapter extends BaseAdapter {
    private Context mContext;
    private List<LogisticsInfo>  orders;

    public LogisticsInfoAdapter(Context mContext, List<LogisticsInfo> news) {
        this.mContext = mContext;
        this.orders = news;
    }

    @Override
    public int getCount() {
        return orders.size();
    }

    @Override
    public Object getItem(int position) {
        return orders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(mContext).inflate(R.layout.news_itemlayout,null);
        }
        return convertView;
    }
}
