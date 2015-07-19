package yuan.sailpotato;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText phone_input_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TelephonyManager telephonyManager= (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        phone_input_edit= (EditText) findViewById(R.id.phone_input_edit);

        if (telephonyManager!=null){
            Log.i("lanwq", telephonyManager.getLine1Number());
            phone_input_edit.setText(telephonyManager.getLine1Number());

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()){
          case R.id.action_info_submit:
              Intent intent= new Intent();
              intent.setClass(getApplicationContext(),HangQingActivity.class);
              startActivity(intent);

              return true;
      }
        return super.onOptionsItemSelected(item);
    }
}
