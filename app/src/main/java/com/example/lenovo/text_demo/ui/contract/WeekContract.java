package com.example.lenovo.text_demo.ui.contract;



import com.example.lenovo.text_demo.bean.ImgBean;
import com.example.lenovo.text_demo.bean.VideoBean;
import com.example.lenovo.text_demo.ui.base.BaseContract;

import java.util.List;

public interface WeekContract {
    interface View extends BaseContract.BaseView {
        void imgSuccess(List<ImgBean.DataBean> data);

        void videoSuccess(List<VideoBean.DataBean> data);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getImage();
        void getVideo();
    }
}
