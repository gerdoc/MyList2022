package gutierrez.galan.german.mylist;

import androidx.appcompat.app.AppCompatActivity;
import gutierrez.galan.german.mylist.adapter.MyAdapter;
import gutierrez.galan.german.mylist.model.MyData;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private ListView listView;
    private List<MyData> list;
    private int []images = { R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4,R.drawable.im5,R.drawable.im6};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        MyData myData = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listViewId1);
        list = new ArrayList<MyData>();
        for( int i = 0; i < 100; i++)
        {
            myData = new MyData();
            myData.setName( String.format( "Lobo %d" , i + 1 ) );
            myData.setImage(images[(int)(Math.random()*6)]);
            list.add( myData );
        }
        MyAdapter myAdapter = new MyAdapter( list , getBaseContext() );
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                toast( i );
            }
        });
    }

    private void toast( int i )
    {
        Toast.makeText(getBaseContext(), list.get(i).getName(), Toast.LENGTH_SHORT).show();
    }
}