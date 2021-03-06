package com.hotbitmapgg.studyproject.hcc.ui.fragment;

import android.content.Intent;

import com.hotbitmapgg.studyproject.R;
import com.hotbitmapgg.studyproject.hcc.base.RxBaseFragment;
import com.hotbitmapgg.studyproject.hcc.notes.android_develop_art_explore.AndroidDevelopActivity;
import com.hotbitmapgg.studyproject.hcc.notes.effective_java.EffectiveJavaNoteActivity;
import com.hotbitmapgg.studyproject.hcc.notes.rxjava_operator.RxJavaOperatorActivity;

import butterknife.OnClick;

public class RxjavaAndNotesFragment extends RxBaseFragment
{

    public static RxjavaAndNotesFragment newInstance()
    {

        return new RxjavaAndNotesFragment();
    }

    @Override
    public int getLayoutId()
    {

        return R.layout.fragment_rxjava_notes;
    }

    @Override
    public void initViews()
    {

    }


    @OnClick(R.id.btn_3)
    void startRxJavaOperator()
    {

        startActivity(new Intent(getActivity(), RxJavaOperatorActivity.class));
    }

    @OnClick(R.id.btn_4)
    void startAndroidDevelopArtExplore()
    {

        startActivity(new Intent(getActivity(), AndroidDevelopActivity.class));
    }

    @OnClick(R.id.btn_5)
    void startEffectiveJava()
    {

        startActivity(new Intent(getActivity(), EffectiveJavaNoteActivity.class));
    }
}
