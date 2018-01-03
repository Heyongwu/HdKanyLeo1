package com.video.Kanyleo.sinatv;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.LiveBean3;

import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/3.
 */

public class SinatvAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder>{
    private Context context;
    private List<LiveBean3.DataBeanX.DataBean.OwnerBean> list;

    public SinatvAdapter(Context context, List<LiveBean3.DataBeanX.DataBean.OwnerBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.sinatv_item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(XRecyclerView.ViewHolder holder, int position) {
        LiveBean3.DataBeanX.DataBean.OwnerBean ownerBean = list.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.live_sdv.setImageURI(Uri.parse(ownerBean.getAvatar_thumb().getUrl_list().get(0)));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
        class MyViewHolder extends XRecyclerView.ViewHolder {

        private final SimpleDraweeView live_sdv;
        private final TextView name;
        private final TextView place;

        public MyViewHolder(View itemView) {
            super(itemView);
            live_sdv = itemView.findViewById(R.id.live_sdv);
            name = itemView.findViewById(R.id.live_nickname);
            place = itemView.findViewById(R.id.live_place);
        }
    }
}









//    public SinatvAdapter(Context context, List<LiveBean1.DataBean.OwnerBean> list) {
//        this.context = context;
//        this.list = list;
//    }
//
//    @Override
//    public XRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = View.inflate(context,R.layout.sinatv_item,null);
//        return new MyViewHolder(view);
//    }
//    @Override
//    public void onBindViewHolder(XRecyclerView.ViewHolder holder, int position) {
//        LiveBean1.DataBean.OwnerBean ownerBean = list.get(position);
//
//        MyViewHolder myViewHolder = (MyViewHolder) holder;
//        myViewHolder.live_sdv.setImageURI(Uri.parse(ownerBean.getAvatar_thumb().getUrl_list().get(0)));
//
//    }
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//class MyViewHolder extends XRecyclerView.ViewHolder {
//
//    private final SimpleDraweeView live_sdv;
//    private final TextView name;
//    private final TextView place;
//
//    public MyViewHolder(View itemView) {
//        super(itemView);
//        live_sdv = itemView.findViewById(R.id.live_sdv);
//        name = itemView.findViewById(R.id.live_nickname);
//        place = itemView.findViewById(R.id.live_place);
//    }
//}
