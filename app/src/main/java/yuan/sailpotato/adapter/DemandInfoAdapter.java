package yuan.sailpotato.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import yuan.sailpotato.Model.DemandInfo;
import yuan.sailpotato.R;

/**
 * Created by Administrator on 2015/6/30.
 */
public class DemandInfoAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<DemandInfo> demands;

    public DemandInfoAdapter(Context mContext, ArrayList<DemandInfo> news) {
        this.mContext = mContext;
        this.demands = news;
    }

    @Override
    public int getCount() {
        return demands.size();
    }

    @Override
    public Object getItem(int position) {
        return demands.get(position);
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
