package yuan.sailpotato;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import yuan.sailpotato.Fragment.MineFragment;
import yuan.sailpotato.Fragment.OrderListFragment;

public class OrderListActivity extends ViewPagerActivity {



    @Override
    protected List<ContentValues> getDisplayContent() {
        List<ContentValues> contentValues= super.getDisplayContent();
        ContentValues order=new ContentValues();
        order.put("titile","订单");
        ContentValues mine=new ContentValues();
        mine.put("titile","我");
        contentValues.add(order);
        contentValues.add(mine);
        return contentValues;
    }

    @Override
    protected List<Fragment> getDisplayFragments() {
        List<Fragment> fragments= super.getDisplayFragments();
        fragments.add(new OrderListFragment());
        fragments.add(new MineFragment());
        return  fragments;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
