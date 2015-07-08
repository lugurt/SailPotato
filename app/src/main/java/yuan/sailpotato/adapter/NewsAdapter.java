package yuan.sailpotato.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

import yuan.sailpotato.Model.News;
import yuan.sailpotato.R;

/**
 * Created by Administrator on 2015/6/30.
 */
public class NewsAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<News> news;

    public NewsAdapter(Context mContext, ArrayList<News> news) {
        this.mContext = mContext;
        this.news = news;
    }

    @Override
    public int getCount() {
        return news.size();
    }

    @Override
    public Object getItem(int position) {
        return news.get(position);
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
