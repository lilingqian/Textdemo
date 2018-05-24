package com.example.lenovo.text_demo.component;



import com.example.lenovo.text_demo.module.HttpModule;
import com.example.lenovo.text_demo.ui.fragment.ImgFragmet;
import com.example.lenovo.text_demo.ui.fragment.VideoFragment;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(ImgFragmet imgFragmet);

    void inject(VideoFragment videoFragment);
}
