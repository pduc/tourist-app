package vn.edu.eiu.tourist_app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TouristRecyclerAdapter extends RecyclerView.Adapter<TouristRecyclerAdapter.TouristHolder> {

    List<String> items;
    public TouristRecyclerAdapter(List<String> items)
    {
        this.items = items;
    }
    @NonNull
    @Override
    public TouristHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView tv = (TextView) LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.tourist_list_items, parent, false);
        TouristHolder holder = new TouristHolder(tv);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TouristHolder holder, int position) {
        String  site = items.get(position);
        holder.bindView(site);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class TouristHolder extends RecyclerView.ViewHolder
    {

        private TextView view;
        public TouristHolder(View itemView) {
            super(itemView);
            this.view = (TextView) itemView;
        }
        public void bindView(String Items)
        {
            view.setText(Items);
        }
    }
}
