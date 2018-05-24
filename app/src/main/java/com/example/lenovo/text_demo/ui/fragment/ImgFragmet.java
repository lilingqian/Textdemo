package com.example.lenovo.text_demo.ui.fragment;

import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.example.lenovo.text_demo.R;
import com.example.lenovo.text_demo.bean.ImgBean;
import com.example.lenovo.text_demo.bean.VideoBean;
import com.example.lenovo.text_demo.component.DaggerHttpComponent;
import com.example.lenovo.text_demo.ui.adapter.ImgAdapter;
import com.example.lenovo.text_demo.ui.base.BaseFragment;
import com.example.lenovo.text_demo.ui.contract.WeekContract;
import com.example.lenovo.text_demo.ui.presenter.WeekPresenter;

import java.util.ArrayList;
import java.util.List;

public class ImgFragmet extends BaseFragment<WeekPresenter> implements WeekContract.View {
    private List<ImgBean.DataBean> data = new ArrayList<>();
    private ImgAdapter imgAdapter;

    @Override
    public int getContentLayout() {
        return R.layout.fragment_img;
    }

    @Override
    public void inject() {
        DaggerHttpComponent.builder()
                .build()
                .inject(this);
    }

    @Override
    public void initView(View view) {
        RecyclerView rv = view.findViewById(R.id.rv);
        //设置布局管理器
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        //加分割线
        rv.addItemDecoration(new DividerItemDecoration(getContext(),RecyclerView.VERTICAL));
        //设置适配器
        imgAdapter = new ImgAdapter(getContext(), data);
        rv.setAdapter(imgAdapter);

        //先去请求数据
        mPresenter.getImage();

    }

    @Override
    public void imgSuccess(List<ImgBean.DataBean> data) {
        if (imgAdapter!=null){
            imgAdapter.setData(data);
        }
    }

    @Override
    public void videoSuccess(List<VideoBean.DataBean> data) {

    }
}
