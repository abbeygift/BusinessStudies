package rent.com.businessstudies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // set the status bar background to transparent

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //Setup recyclerView with adapter

        RecyclerView recyclerView =findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();

        mlist.add(new item(R.drawable.intro,"Introduction",R.drawable.l1,25));
        mlist.add(new item(R.drawable.enviro,"Environment",R.drawable.l1,28));
        mlist.add(new item(R.drawable.aims,"Aims & Objectives",R.drawable.l1,55));
        mlist.add(new item(R.drawable.constraints,"Constraints",R.drawable.l1,75));
        mlist.add(new item(R.drawable.ict,"ICT",R.drawable.l1,295));
        mlist.add(new item(R.drawable.trade,"Trade",R.drawable.l1,2500));
        mlist.add(new item(R.drawable.growth,"Growth",R.drawable.l1,500));
        mlist.add(new item(R.drawable.failure,"Failure",R.drawable.l1,25000));

        Adapter adapter = new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
