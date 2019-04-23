package rent.com.businessstudies;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abington on 4/16/18.
 */

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.ViewHolder>  {
    private ArrayList<model> topicsArrayList = new ArrayList<>();
    Context context;


    public TopicsAdapter(Context context,ArrayList<model> topicsArrayList) {
        this.context = context;
        this.topicsArrayList = topicsArrayList;
    }

    @Override
    public TopicsAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new TopicsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TopicsAdapter.ViewHolder viewHolder, final int position) {
        model item = topicsArrayList.get(position);
        viewHolder.CategoryName.setText(item.getName());
        viewHolder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                    intent.putExtra("ItemPosition", position);
                    view.getContext().startActivity(intent);


            }
        });
    }


    @Override
    public int getItemCount() {
        return topicsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView CategoryName;


        CardView cardview;
        public ViewHolder(View itemView) {
            super(itemView);
            CategoryName =  itemView.findViewById(R.id.companyNameTxt);
            cardview = itemView.findViewById(R.id.cardview);

        }
    }
}
