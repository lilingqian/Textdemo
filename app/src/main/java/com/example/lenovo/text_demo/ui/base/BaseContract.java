package com.example.lenovo.text_demo.ui.base;

public interface BaseContract {
    interface BasePresenter<T extends BaseView> {
        void attachView(T view);

        void detachView();

    }

    interface BaseView {
        void showLoading();
    }
}
