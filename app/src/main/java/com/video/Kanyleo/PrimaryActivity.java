package com.video.Kanyleo;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.video.Kanyleo.mine.MyLoginActivity;
import com.video.Kanyleo.setting.ImgApp2;
import com.video.Kanyleo.sinatv.SinatvFragment;
import com.video.Kanyleo.video.VideoFragment;

import java.util.Map;

public class PrimaryActivity extends AppCompatActivity implements View.OnClickListener {


    private TabLayout mTb;
    private ViewPager mVp;
    /**
     * 注册/登录
     */
    private TextView mLogin;
    String[] itemName = {"直播", "视频"};
    TbAdapter tbAdapter;
    private Dialog dialog;
    private View inflate;
    private EditText edit_phone;
    private Button next_jump;
    private ImageView guanbi;
    private ImageView qq;
    private ImageView sina;
    private ImageView weixin;
    private LinearLayout mLayouHide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr);
        initView();
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        tbAdapter = new TbAdapter(getSupportFragmentManager());
        mTb.setupWithViewPager(mVp);
        mVp.setAdapter(tbAdapter);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(inflate);

            }
        });
    }

    private void initView() {
        mTb = (TabLayout) findViewById(R.id.tb);
        mVp = (ViewPager) findViewById(R.id.vp);
        mLogin = (TextView) findViewById(R.id.login);

    }
    public void show(View view) {
        dialog = new Dialog(this, R.style.ActionSheetDialogStyle);
        //填充对话框的布局
        inflate = LayoutInflater.from(this).inflate(R.layout.bottom_dialog, null);
        //初始化控件
        edit_phone = (EditText) inflate.findViewById(R.id.edit_phone);
        next_jump = (Button) inflate.findViewById(R.id.next_jump);
        guanbi = (ImageView) inflate.findViewById(R.id.turnoff);
        qq = (ImageView) inflate.findViewById(R.id.QQ_Login);
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UMShareAPI.get(PrimaryActivity.this).getPlatformInfo(PrimaryActivity.this,SHARE_MEDIA.QQ,umAuthListener);
                hide();
            }
        });
        sina = (ImageView) inflate.findViewById(R.id.sina_Login);
        weixin = (ImageView) inflate.findViewById(R.id.wechat_Login);
        mLayouHide = (LinearLayout) inflate.findViewById(R.id.layou_hide);
        guanbi.setOnClickListener(this);
        edit_phone.setOnClickListener(this);
        next_jump.setOnClickListener(this);
        //将布局设置给Dialog
        dialog.setContentView(inflate);
        //获取当前Activity所在的窗体
        Window dialogWindow = dialog.getWindow();
        //dialogWindow.getDecorView().setPadding(5,5,5,5);
        //设置Dialog从窗体底部弹出
        dialogWindow.setGravity(Gravity.BOTTOM);
        //获得窗体的属性
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        lp.y = 5;//设置Dialog距离底部的距离
//       将属性设置给窗体
        dialogWindow.setAttributes(lp);
        WindowManager.LayoutParams attributes = dialogWindow.getAttributes();
        attributes.width = WindowManager.LayoutParams.MATCH_PARENT;
        attributes.height = WindowManager.LayoutParams.WRAP_CONTENT;
        attributes.gravity = Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL;
        // 一定要重新设置, 才能生效
        dialogWindow.setAttributes(attributes);
        dialog.show();//显示对话框
    }
    public void hide() {
        dialog.dismiss();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.edit_phone:
                Checkout_phoneleght();
                break;
            case R.id.turnoff:
                hide();
                break;
            case R.id.next_jump:
                Checkout_phone();
                hide();
                break;
            case R.id.QQ_Login:
                UMShareAPI.get(PrimaryActivity.this).getPlatformInfo(PrimaryActivity.this,SHARE_MEDIA.QQ,umAuthListener);
                hide();
                break;        }
    }
    private void Checkout_phoneleght() {
        String phoneNums=edit_phone.getText().toString();
        if (phoneNums.length() <= 1 && phoneNums == "") {
            return;
        } else {
            mLayouHide.setVisibility(View.GONE);
            next_jump.setVisibility(View.VISIBLE);
        }
    }
    public static boolean isMatchLength(String str, int length) {
        if (str.isEmpty()) {
            return false;
        } else {
            return str.length() == length ? true : false;
        }
    }

    /**
     * 验证手机格式
     */
    public static boolean isMobileNO(String mobileNums) {
        /*
         * 移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
         * 联通：130、131、132、152、155、156、185、186 电信：133、153、180、189、（1349卫通）
         * 总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
         */
        String telRegex = "[1][358]\\d{9}";// "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(mobileNums))
            return false;
        else
            return mobileNums.matches(telRegex);
    }
    private boolean judgePhoneNums(String phoneNums) {
        if (isMatchLength(phoneNums, 11)
                && isMobileNO(phoneNums)) {
            return true;
        }
        Toast.makeText(this, "手机号码输入有误！", Toast.LENGTH_SHORT).show();
        return false;
    }

    private void Checkout_phone() {
        String phoneNums = edit_phone.getText().toString();
//        if (judgePhoneNums(phoneNums) == true) {
            Intent intent = new Intent(PrimaryActivity.this, MyLoginActivity.class);
            intent.putExtra("name",phoneNums);
            startActivity(intent);
//        }
    }

    class TbAdapter extends FragmentPagerAdapter {


        public TbAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                //注意：activity中导入的包必须和碎片一致 v4包
                case 0:
                    return new SinatvFragment();
                case 1:
                    return new VideoFragment();
            }
            return new VideoFragment();
        }

        @Override
        public int getCount() {
            return itemName.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return itemName[position];
        }
    }
    private UMAuthListener umAuthListener = new UMAuthListener() {
        @Override
        public void onStart(SHARE_MEDIA platform) {
            //授权开始的回调
        }
        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            Toast.makeText(PrimaryActivity.this, "登录成功", Toast.LENGTH_LONG).show();
            String iconurl = data.get("iconurl");
            String name = data.get("name");
            ImgApp2.edit.putString("nickname",name);
            ImgApp2.edit.putBoolean("isLogin",true);
            ImgApp2.edit.commit();
            finish();
            //使用EventBus把值传给我的
            Intent intent = new Intent(PrimaryActivity.this,LoginNRActivity.class);
            startActivity(intent);
            finish();

        }

        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {
            Toast.makeText( getApplicationContext(), "Authorize fail", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText( getApplicationContext(), "Authorize cancel", Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }
}
