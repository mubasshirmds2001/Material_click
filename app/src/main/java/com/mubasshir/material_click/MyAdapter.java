package com.mubasshir.material_click;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<model> modelList;

    public MyAdapter(List<model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model listitem = modelList.get(position);

        holder.txtMaterial.setText(listitem.getMaterial());
        holder.txtQuantity.setText(listitem.getQuantity());
        holder.txtStock.setText(listitem.getQuantity());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtPartyname;
        public TextView txtDate;
        public TextView txtMaterial;
        public TextView txtQuantity;
        public TextView txtStock;
        public TextView txtUnitRate;
        public TextView txtAmount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPartyname=(TextView)itemView.findViewById(R.id.tvMaterial);
//            txtDate=(TextView)itemView.findViewById(R.id.tvDate);
//            txtMaterial=(TextView)itemView.findViewById(R.id.tvMaterial);
            txtQuantity=(TextView)itemView.findViewById(R.id.tvPurchased);
//            txtUnitRate=(TextView)itemView.findViewById(R.id.tvMaterial);
            txtAmount=(TextView)itemView.findViewById(R.id.tvAmount);
        }
    }
}
