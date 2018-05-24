package com.example.lenovo.text_demo.net;



import com.example.lenovo.text_demo.bean.ImgBean;
import com.example.lenovo.text_demo.bean.VideoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface WeekApiService {

    @GET("satinApi?type=3&page=1")
    Observable<ImgBean> getImage();

    @GET("satinApi?type=4&page=1")
    Observable<VideoBean> getVideo();
}
