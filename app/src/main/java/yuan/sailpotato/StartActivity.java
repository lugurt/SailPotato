package yuan.sailpotato;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class StartActivity extends Activity {
    ImageView imageView;
Handler handler= new Handler(){

};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        init(getApplicationContext());
        imageView= (ImageView) findViewById(R.id.start_activity_image);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent();
                intent.setClass(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        },3000);

    }

    private void init(Context applicationContext) {

    }
}
