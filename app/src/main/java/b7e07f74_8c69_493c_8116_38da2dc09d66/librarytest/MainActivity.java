package b7e07f74_8c69_493c_8116_38da2dc09d66.librarytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import b7e07f74_8c69_493c_8116_38da2dc09d66.testlib.AddClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed1 = (EditText)findViewById(R.id.editText1);
        final EditText ed2 = (EditText)findViewById(R.id.editText2);
        final TextView res = (TextView)findViewById(R.id.resultView);
        findViewById(R.id.calcButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1 = ed1.getText().toString();
                String t2 = ed2.getText().toString();
                try {
                    int i1 = Integer.parseInt(t1);
                    int i2 = Integer.parseInt(t2);
                    int resi = AddClass.add(i1, i2);
                    res.setText(String.valueOf(resi));
                } catch (NumberFormatException e) {
                    res.setText("invalid");
                }
            }
        });
    }
}
