package yuan.sailpotato;

import android.content.AsyncQueryHandler;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import yuan.sailpotato.Fragment.NewsFragment;
import yuan.sailpotato.Model.News;
import yuan.sailpotato.adapter.NewsAdapter;

public class MainActivity extends AppCompatActivity {
    Button dingdanBtn, hangQingBtn;
    ListView messageListView;
    ArrayList<News> newses= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dingdanBtn = (Button) findViewById(R.id.dingdan_button);
        hangQingBtn = (Button) findViewById(R.id.hangqing_button);
        dingdanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), OrderListActivity.class);
                startActivity(intent);
            }
        });
        hangQingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), HangQingActivity.class);
                startActivity(intent);
            }
        });
        messageListView = (ListView) findViewById(R.id.message_list);
        newses.add(new News("您的xxxx订单有了变化","18561611643的客户对你的供货消息有意向，请详细查看",null));
        newses.add(new News("您的xxxx订单有了变化","18561611643的客户对你的供货消息有意向，请详细查看",null));
        newses.add(new News("您的xxxx订单有了变化","18561611643的客户对你的供货消息有意向，请详细查看",null));
        newses.add(new News("您的xxxx订单有了变化","18561611643的客户对你的供货消息有意向，请详细查看",null));
        newses.add(new News("您的xxxx订单有了变化","18561611643的客户对你的供货消息有意向，请详细查看",null));
        newses.add(new News("您的xxxx订单有了变化","18561611643的客户对你的供货消息有意向，请详细查看",null));

        messageListView.setAdapter(new NewsAdapter(getApplicationContext(),newses));
        messageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NewsFragment dialogFragment= new NewsFragment();

                dialogFragment.show(getFragmentManager(),"news");

            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
