package com.video.Kanyleo.city;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.VoBean;
import com.video.Kanyleo.video.PlayVideoActivity;

import java.util.List;

/**
 * Created by len on 2017/12/26.
 */

public class CityAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder> {
    Context context;
    List<VoBean.DataBeanX.DataBean> splist;
    private String s2;

    public CityAdapter(Context context, List<VoBean.DataBeanX.DataBean> splist) {
        this.context = context;
        this.splist = splist;
    }


    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.video_item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(XRecyclerView.ViewHolder holder, final int position) {
        VoBean.DataBeanX.DataBean dataBean = splist.get(position);
        String share_title = dataBean.getShare_title();
        String nickname = dataBean.getAuthor().getNickname();

         ((MyViewHolder)holder).sdv.setImageURI(Uri.parse(splist.get(position).getAuthor().getAvatar_large().getUrl_list().get(0)));
//        ((MyViewHolder)holder).sdv_below.setImageURI(splist.get(position).getAuthor().getAvatar_large().getUrl_list().get(1));
        ((MyViewHolder)holder).name.setText(nickname);
        ((MyViewHolder)holder).place.setText(splist.get(position).getAuthor().getCity());
        ((MyViewHolder)holder).videoName.setText(share_title);
        ((MyViewHolder) holder).sdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlayVideoActivity.class);
                intent.putExtra("ss", splist.get(position).getVideo().getUrl_list().get(0));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return splist.size();
    }

    class MyViewHolder extends XRecyclerView.ViewHolder{
        SimpleDraweeView sdv;
        SimpleDraweeView sdv_below;
        TextView name,place,videoName,liuyan;
        private final RelativeLayout ll;

        public MyViewHolder(View itemView) {
           super(itemView);
           sdv=itemView.findViewById(R.id.sdv);
           sdv_below=itemView.findViewById(R.id.sdv_below);
           name=itemView.findViewById(R.id.wenname);
           place=itemView.findViewById(R.id.place);
           videoName=itemView.findViewById(R.id.videoName);
           liuyan=itemView.findViewById(R.id.liuyan);
           ll = (RelativeLayout)itemView.findViewById(R.id.ll);
            int width = ((Activity) ll.getContext()).getWindowManager().getDefaultDisplay().getWidth();
            ViewGroup.LayoutParams params = sdv.getLayoutParams();
            //设置图片的相对于屏幕的宽高比
            params.width = width/2;
            params.height =  (int) (200 + Math.random() * 400) ;
            sdv.setLayoutParams(params);
       }
   }
}
