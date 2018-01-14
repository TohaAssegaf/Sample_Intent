package us.qampus.sample_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2Activity extends AppCompatActivity
{

    public static String KEY_DATA = "";
    private String receivedData;
    private TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        //receivedData untuk megambil data dari KEY_DATA
        //KEY_DATA disini sebagai penampung data dari inputan pada activity awal
        txtData = (TextView)findViewById(R.id.txt_data);
        receivedData = getIntent().getStringExtra(KEY_DATA);
        txtData.setText(receivedData);
    }
}
