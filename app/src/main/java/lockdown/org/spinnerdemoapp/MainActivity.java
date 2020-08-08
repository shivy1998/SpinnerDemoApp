package lockdown.org.spinnerdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Spinner spCourses;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        spCourses = findViewById(R.id.spCourses);

        ArrayList al = new ArrayList();
        al.add("Java ");
        al.add("Android ");
        al.add("Machine Learning ");
        al.add("Hadoop ");
        al.add("Advanced Java ");

        ArrayAdapter aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,al);
        spCourses.setAdapter(aa);
        spCourses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                TextView tv = (TextView)view;
                String data = tv.getText().toString();
                Toast.makeText(MainActivity.this,"Selected Course : "+data, Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
