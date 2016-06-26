package com.qf.xs.day17fragmentdemo1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by asus on 2016/6/7.
 * 注意：如果要兼容3.0以前版本，导入v4包的Fragment
 *       如果导入v4包的Fragment，需要配合v4包的FragmentActivity使用
 *
 *       1.1 定义碎片的布局文件
 *       1.2 加载布局:重写onCreateView
 */
public class XiaoMingFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("print","XiaoMingFragment......onAttach.....");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e("print","XiaoMingFragment......onPause.....");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("print","XiaoMingFragment......onStop.....");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("print","XiaoMingFragment......onResume.....");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("print","XiaoMingFragment......onStart.....");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("print","XiaoMingFragment......onActivityCreated.....");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("print","XiaoMingFragment......onDestroyView.....");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("print","XiaoMingFragment......onDestroy.....");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("print","XiaoMingFragment......onDetach.....");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("print","XiaoMingFragment......onCreate.....");
    }

    /**
     * onCreateView:回调这方法，用于创建Fragment的视图
     * @param inflater：布局加载器
     * @param container：容器
     * @param savedInstanceState：现场保护参数
     * @return  返回的是加载好的布局对象
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xiaoming_fragment_layout, null);
        Log.e("print","XiaoMingFragment......onCreateView.....");
        return view;
    }
}
