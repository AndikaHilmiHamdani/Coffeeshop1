package com.android.cofeeshop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KopiCardAdapter extends RecyclerView.Adapter<KopiCardAdapter.CardViewHolder>{
    Context context;

    //kopi list
    private List<KopiModel> kopiCard;
    public KopiCardAdapter( List<KopiModel> kopiCard,Context context) {
        this.kopiCard = kopiCard;
        this.context = context;
    }

    public KopiCardAdapter(List<KopiModel> kopiArrayList) {
        this.kopiCard = kopiArrayList;

    }



    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //kopi_list layout
        View view = layoutInflater.inflate(R.layout.kopi_list, parent,false);

        //Intent to detail
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, AmericanoActivity.class);
                context.startActivity(intent);
            }
        });
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        //Kopi
        holder.tvTitle.setText(kopiCard.get(position).getTitle());
        holder.tvPrice.setText(String.valueOf(kopiCard.get(position).getPrice()));
        holder.tvRating.setText(kopiCard.get(position).getRating());
        //holder.tvDesc.setText(kopiCard.get(position).getDesc());
        holder.pict.setImageResource(kopiCard.get(position).getImage());

        //Detail

    }

    @Override
    public int getItemCount() {
        return kopiCard.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle,tvPrice,tvRating,tvDesc;
        private ImageView pict;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvRating = itemView.findViewById(R.id.tvRating);
            //tvDesc = itemView.findViewById(R.id.tvDesc);
            pict = itemView.findViewById(R.id.imgKopi);
        }

    }
}
