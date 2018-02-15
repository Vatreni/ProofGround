package com.anddevs.proofground.common.interfaces;

/**
 * Created by Homepunk on 30.01.2018.
 **/

public interface Presenter<V extends PassiveView> {
    void bind(V view);

    void terminate();
}
