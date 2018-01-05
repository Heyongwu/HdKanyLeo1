package com.video.Kanyleo.sinatv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.video.Kanyleo.R;
import com.video.Kanyleo.bean.LiveBean3;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yw_Ambition on 2018/1/3.
 */

public class SinatvAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder>{
    private Context context;
    private List<LiveBean3.DataBeanX.DataBean> list;
    OnItemClickListener listener;
    public static final int TYPE_HEADER=0;
    public static final int TYPE_ONE=1;
    private View view1;
    public interface OnItemClickListener{
        public void OnItemClick(View view,int position,String id);
    }

    public void setOnItemClick(OnItemClickListener listener){
        this.listener=listener;
    }
    public SinatvAdapter(Context context, List<LiveBean3.DataBeanX.DataBean> list) {
        this.context = context;
        this.list = list;
    }
    List<View> listheader=new ArrayList<View>();
    public void addheader(View view){
        listheader.add(view);
    }

    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==TYPE_HEADER){
            view1 = View.inflate(context, R.layout.live_banner, null);
            return new BnViewHolder(view1);
        }else {
            View view2=View.inflate(context,R.layout.sinatv_item,null);
            return new MyViewHolder(view2);
        }
    }
    @Override
    public void onBindViewHolder(XRecyclerView.ViewHolder holder, int position) {
//        LiveBean3.DataBeanX.DataBean.OwnerBean ownerBean = list.get(position);
        LiveBean3.DataBeanX.DataBean.OwnerBean ownerBean = list.get(position).getOwner();
        final LiveBean3.DataBeanX.DataBean dataBean = list.get(position);
        if(holder instanceof BnViewHolder){
            int type = getItemViewType(position);
            if (type == TYPE_HEADER) {
                StaggeredGridLayoutManager.LayoutParams layoutParams =
                        new StaggeredGridLayoutManager.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.setFullSpan(true);
                view1.setLayoutParams(layoutParams);
            }
            ArrayList<String> pic=new ArrayList<>();
            pic.add("http://p1.pstatp.com/obj/50f700051c9191b15e0c");
            pic.add("http://p9.pstatp.com/obj/3b1f00050526a4d6845a");
            pic.add("http://p3.pstatp.com/obj/477b000175a7f1979ba2");
            pic.add("http://p3.pstatp.com/obj/2bd2000f2e611afa3828");
            pic.add("http://p3.pstatp.com/obj/2eaa0000729306a3bb51");
            ((BnViewHolder)holder).live_banner.setImages(pic);
            ((BnViewHolder)holder).live_banner.setImageLoader(new GlideImageLoader());
            ((BnViewHolder)holder).live_banner.start();

            View vfHour=View.inflate(context,R.layout.hour,null);
            View vfLastHour=View.inflate(context,R.layout.lasthours,null);
            View vfGold=View.inflate(context,R.layout.kim,null);
            ((BnViewHolder)holder).vf.addView(vfHour);
            ((BnViewHolder)holder).vf.addView(vfLastHour);
            ((BnViewHolder)holder).vf.addView(vfGold);
            SimpleDraweeView h_sdv_one,h_sdv_two,h_sdv_three,lh_sdv_one,lh_sdv_two,lh_sdv_three,
                    g_sdv_one,g_sdv_two,g_sdv_three;

            h_sdv_one=vfHour.findViewById(R.id.h_sdv_one);
            h_sdv_two=vfHour.findViewById(R.id.h_sdv_two);
            h_sdv_three=vfHour.findViewById(R.id.h_sdv_three);
            h_sdv_one.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
            h_sdv_two.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
            h_sdv_three.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));


            lh_sdv_one=vfLastHour.findViewById(R.id.lh_sdv_one);
            lh_sdv_two=vfLastHour.findViewById(R.id.lh_sdv_two);
            lh_sdv_three=vfLastHour.findViewById(R.id.lh_sdv_three);
            lh_sdv_one.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
            lh_sdv_two.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
            lh_sdv_three.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));

            g_sdv_one=vfGold.findViewById(R.id.g_sdv_one);
            g_sdv_two=vfGold.findViewById(R.id.g_sdv_two);
            g_sdv_three=vfGold.findViewById(R.id.g_sdv_three);
            g_sdv_one.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
            g_sdv_two.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
            g_sdv_three.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));


        }
        if(holder instanceof MyViewHolder){

            int user_count = dataBean.getUser_count();
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            myViewHolder.live_sdv.setImageURI(Uri.parse(ownerBean.getAvatar_thumb().getUrl_list().get(0)));
            myViewHolder.name.setText(ownerBean.getNickname());
            myViewHolder.place.setText(dataBean.getUser_count()+"人");


            myViewHolder.live_sdv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, PlaySinatvActivity.class);
//                    intent.putExtra("sss",dataBean.getStream_url().getRtmp_pull_url());
                    context.startActivity(intent);
                }
            });
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    @Override
    public int getItemViewType(int position) {
        if(position < listheader.size()){
            return TYPE_HEADER;
        }else {
            return TYPE_ONE;
        }
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
    //banner的ViewHolder
    class BnViewHolder extends XRecyclerView.ViewHolder {
        Banner live_banner;
        ViewFlipper vf;
        public BnViewHolder(View itemView) {
            super(itemView);
            live_banner = itemView.findViewById(R.id.live_banner);
            vf = itemView.findViewById(R.id.vf);
        }
    }
}




















//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    public interface OnItemClickListener{
//        public void OnItemClick(View view,int position,String id);
//    }
//
//    public void setOnItemClick(OnItemClickListener listener){
//        this.listener=listener;
//    }
//
//    public SinatvAdapter(Context context, List<LiveBean3.DataBeanX.DataBean.OwnerBean> list) {
//        this.context = context;
//        this.list = list;
//    }
//    List<View> listheader=new ArrayList<View>();
//    public void addheader(View view){
//        listheader.add(view);
//    }
//
//    @Override
//    public XRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        if(viewType==TYPE_HEADER){
//            view1 = View.inflate(context, R.layout.live_banner, null);
//            return new BnViewHolder(view1);
//        }else {
//            View view2 = View.inflate(context, R.layout.sinatv_item, null);
//            return new MyViewHolder(view2);
//        }
//    }
//
//    @Override
//    public void onBindViewHolder(XRecyclerView.ViewHolder holder, int position) {
//
//        LiveBean3.DataBeanX.DataBean.OwnerBean ownerBean = list.get(position);
//        MyViewHolder myViewHolder = (MyViewHolder) holder;
//        if(holder instanceof BnViewHolder){
//            int type = getItemViewType(position);
//            if (type == TYPE_HEADER) {
//                StaggeredGridLayoutManager.LayoutParams layoutParams =
//                        new StaggeredGridLayoutManager.LayoutParams(
//                                ViewGroup.LayoutParams.MATCH_PARENT,
//                                ViewGroup.LayoutParams.WRAP_CONTENT);
//                layoutParams.setFullSpan(true);
//                view1.setLayoutParams(layoutParams);
//            }
//            ArrayList<String> pic=new ArrayList<>();
//            pic.add("http://p1.pstatp.com/obj/50f700051c9191b15e0c");
//            pic.add("http://p9.pstatp.com/obj/3b1f00050526a4d6845a");
//            pic.add("http://p3.pstatp.com/obj/477b000175a7f1979ba2");
//            pic.add("http://p3.pstatp.com/obj/2bd2000f2e611afa3828");
//            pic.add("http://p3.pstatp.com/obj/2eaa0000729306a3bb51");
//            ((BnViewHolder)holder).live_banner.setImages(pic);
//            ((BnViewHolder)holder).live_banner.setImageLoader(new GlideImageLoader());
//            ((BnViewHolder)holder).live_banner.start();
//            View vfHour=View.inflate(context,R.layout.hour,null);
//            View vfLastHour=View.inflate(context,R.layout.lasthours,null);
//            View vfGold=View.inflate(context,R.layout.kim,null);
//            ((BnViewHolder)holder).vf.addView(vfHour);
//            ((BnViewHolder)holder).vf.addView(vfLastHour);
//            ((BnViewHolder)holder).vf.addView(vfGold);
//            SimpleDraweeView h_sdv_one,h_sdv_two,h_sdv_three,lh_sdv_one,lh_sdv_two,lh_sdv_three,
//                    g_sdv_one,g_sdv_two,g_sdv_three;
//            h_sdv_one=vfHour.findViewById(R.id.h_sdv_one);
//            h_sdv_two=vfHour.findViewById(R.id.h_sdv_two);
//            h_sdv_three=vfHour.findViewById(R.id.h_sdv_three);
//            h_sdv_one.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//            h_sdv_two.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//            h_sdv_three.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//
//
//            lh_sdv_one=vfLastHour.findViewById(R.id.lh_sdv_one);
//            lh_sdv_two=vfLastHour.findViewById(R.id.lh_sdv_two);
//            lh_sdv_three=vfLastHour.findViewById(R.id.lh_sdv_three);
//            lh_sdv_one.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//            lh_sdv_two.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//            lh_sdv_three.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//
//            g_sdv_one=vfGold.findViewById(R.id.g_sdv_one);
//            g_sdv_two=vfGold.findViewById(R.id.g_sdv_two);
//            g_sdv_three=vfGold.findViewById(R.id.g_sdv_three);
//            g_sdv_one.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//            g_sdv_two.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//            g_sdv_three.setImageURI(ownerBean.getAvatar_large().getUrl_list().get(0));
//
//
//        }
//        if(holder instanceof MyViewHolder){
//            myViewHolder.live_sdv.setImageURI(Uri.parse(ownerBean.getAvatar_thumb().getUrl_list().get(0)));
//            myViewHolder.name.setText(ownerBean.getNickname());
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//    @Override
//    public int getItemViewType(int position) {
//        if(position < listheader.size()){
//            return TYPE_HEADER;
//        }else {
//            return TYPE_ONE;
//        }
//    }
//    class MyViewHolder extends XRecyclerView.ViewHolder {
//
//        private final SimpleDraweeView live_sdv;
//        private final TextView name;
//        private final TextView place;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            live_sdv = itemView.findViewById(R.id.live_sdv);
//            name = itemView.findViewById(R.id.live_nickname);
//            place = itemView.findViewById(R.id.live_place);
//        }
//    }
//    //banner的ViewHolder
//    class BnViewHolder extends XRecyclerView.ViewHolder {
//        Banner live_banner;
//        ViewFlipper vf;
//        public BnViewHolder(View itemView) {
//            super(itemView);
//            live_banner = itemView.findViewById(R.id.live_banner);
//            vf = itemView.findViewById(R.id.vf);
//        }
//    }
//}
