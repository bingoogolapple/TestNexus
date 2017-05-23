package cn.bingoogolapple.testnexus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cn.bingoogolapple.nexusaar.NexusAar;
import cn.bingoogolapple.nexusjar.NexusJar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView aarTv = (TextView) findViewById(R.id.tv_main_aar);
        aarTv.setText(NexusAar.getName());

        TextView jarTv = (TextView) findViewById(R.id.tv_main_jar);
        jarTv.setText(NexusJar.getName());
    }
}
