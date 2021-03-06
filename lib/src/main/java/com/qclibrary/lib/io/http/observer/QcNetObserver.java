package com.qclibrary.lib.io.http.observer;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class QcNetObserver<T> implements Observer<T> {

    public abstract void onSuccess(T t);
    public abstract void onFailed(Throwable e);

    @Override
    public void onSubscribe(Disposable d) {
    }

    @Override
    public void onNext(T t) {
        //Do some general processing
        onSuccess(t);
    }

    @Override
    public void onError(Throwable e) {
        //Do some general processing
        onFailed(e);
    }

    @Override
    public void onComplete() {

    }
}
