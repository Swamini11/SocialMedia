//package com.example.socialmedia.ui.main;
//
//import androidx.arch.core.util.Function;
//import androidx.lifecycle.LiveData;
//import androidx.lifecycle.MediatorLiveData;
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.Transformations;
//import androidx.lifecycle.ViewModel;
//
//public class PageViewModel extends ViewModel {
//
//    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
//    private MediatorLiveData<String> mText = new MediatorLiveData<>();
//
//    public PageViewModel() {
//        mText.addSource(mIndex, new androidx.arch.core.util.Function<Integer, String>() {
//            @Override
//            public String apply(Integer input) {
//                return "Hello world from section: " + input;
//            }
//        });
//    }
//
//    public void setIndex(int index) {
//        mIndex.setValue(index);
//    }
//
//    public LiveData<String> getText() {
//        return mText;
//    }
//}
