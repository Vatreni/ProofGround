package com.anddevs.proofground.common;

import com.anddevs.proofground.common.interfaces.PassiveView;
import com.anddevs.proofground.common.interfaces.Presenter;

/**
 * Created by Homepunk on 30.01.2018.
 **/

public abstract class BasePresenter<V extends PassiveView> implements Presenter<V> {
    protected V view;

    protected abstract void onPresenterBound();
    protected abstract void onPresenterTerminate();

    @Override
    public void bind(V view) {
        this.view = view;
        onPresenterBound();
    }

    @Override
    public void terminate() {
        view = null;
        onPresenterTerminate();
    }
}
