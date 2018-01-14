package us.qampus.sample_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private Button btnSub1, btnSub2, btnDial;
    private String strIntent;
    private EditText txtIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSub1 = (Button)findViewById(R.id.btn_activity_sub_1);
        btnSub2 = (Button)findViewById(R.id.btn_activity_sub_2);
        btnDial = (Button)findViewById(R.id.btn_activity_dial);

        txtIntent = (EditText)findViewById(R.id.text_Intent);

        btnSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        btnSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strIntent = txtIntent.getText().toString();
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                //KEY_DATA merupakan string penanda yang dibuat pd activity yang dituju, sebagai penanda
                //str_intent sebagai inputan edittext
                //intent.putextra untuk mengambil data
                intent.putExtra(Sub2Activity.KEY_DATA, strIntent);
                startActivity(intent);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber="083812270627";
                Uri uri=Uri.parse("tel:"+phoneNumber);
                Intent i = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(i);
            }
        });
    }
}