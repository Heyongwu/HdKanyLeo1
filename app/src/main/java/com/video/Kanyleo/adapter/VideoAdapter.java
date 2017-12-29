package com.video.Kanyleo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.Sp_Bean;

import java.util.List;

/**
 * Created by len on 2017/12/26.
 */

public class VideoAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder> {
    Context context;
    List<Sp_Bean.DataBeanX.DataBean> splist;

    public VideoAdapter(Context context, List<Sp_Bean.DataBeanX.DataBean> splist) {
        this.context = context;
        this.splist = splist;
    }

    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.sp_item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(XRecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).sdv.setImageURI(splist.get(position).getAuthor().getAvatar_large().getUrl_list().get(0));
        //((MyViewHolder)holder).sdv_below.setImageURI(splist.get(position).getAuthor().getAvatar_large().getUrl_list().get(1));
        ((MyViewHolder)holder).name.setText(splist.get(position).getAuthor().getNickname());
        ((MyViewHolder)holder).place.setText(splist.get(position).getAuthor().getCity());
        ((MyViewHolder)holder).videoName.setText(splist.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return splist.size();
    }

    class MyViewHolder extends XRecyclerView.ViewHolder{
        SimpleDraweeView sdv;
        SimpleDraweeView sdv_below;
        TextView name,place,videoName,liuyan;
       public MyViewHolder(View itemView) {
           super(itemView);
           sdv=itemView.findViewById(R.id.sdv);
           sdv_below=itemView.findViewById(R.id.sdv_below);
           name=itemView.findViewById(R.id.name);
           place=itemView.findViewById(R.id.place);
           videoName=itemView.findViewById(R.id.videoName);
           liuyan=itemView.findViewById(R.id.liuyan);

       }
   }
}
