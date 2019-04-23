package rent.com.businessstudies;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TopicsActivity extends AppCompatActivity {


    private ArrayList<model> topicsArrayList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    Context context;
    //private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);



        //Setup recyclerView with adapter

        //RecyclerView recyclerView =findViewById(R.id.rv_topics);
       // List<item> mlist = new ArrayList<>();


        mRecyclerView=findViewById(R.id.rv_topics);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);


        //ActualData
        topicsArrayList.add(new model("Marketing"));
        topicsArrayList.add(new model("Trading"));
        topicsArrayList.add(new model("Purchasing "));
        topicsArrayList.add(new model("Business Environment "));
        topicsArrayList.add(new model("Retailers"));
        topicsArrayList.add(new model("Buyers "));
        topicsArrayList.add(new model("Crepes "));
        topicsArrayList.add(new model("Cosines "));
        topicsArrayList.add(new model("Muffins"));
        topicsArrayList.add(new model("Pancakes"));
        topicsArrayList.add(new model("German Pancakes "));
        topicsArrayList.add(new model("Scones "));
        topicsArrayList.add(new model("waffles"));
        topicsArrayList.add(new model("blintzes "));
        topicsArrayList.add(new model("Cinnamon Rolls "));
        topicsArrayList.add(new model("baguette "));


        RecyclerView.Adapter adapter = new TopicsAdapter(context,topicsArrayList);
        mRecyclerView.setAdapter(adapter);
        // Adapter adapter = new Adapter(this,mlist);
        //recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
