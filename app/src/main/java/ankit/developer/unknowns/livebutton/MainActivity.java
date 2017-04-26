package ankit.developer.unknowns.livebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ru.katso.livebutton.LiveButton;

public class MainActivity extends AppCompatActivity {
    LiveButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (LiveButton)findViewById(R.id.liveButton);
       /* button.setPressedHeight(2);
        button.setNormalHeight(8);
        button.setCorners(12);
        button.setBackgroundColor(0xffF57F76);
        button.setShadowColor(0xffb16262);*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
