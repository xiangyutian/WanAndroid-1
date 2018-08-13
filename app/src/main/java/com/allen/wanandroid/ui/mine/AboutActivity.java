package com.allen.wanandroid.ui.mine;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.allen.common.arouter.ARouterPath;
import com.allen.wanandroid.BuildConfig;
import com.allen.wanandroid.R;
import com.library.base.base.BaseActivity;
import com.library.base.widget.TopBar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * <pre>
 *      @author : xiaoyao
 *      e-mail  : xiaoyao@51vest.com
 *      date    : 2018/08/03
 *      desc    : 关于我们
 *      version : 1.0
 * </pre>
 */
@Route(path = ARouterPath.aboutActPath)
public class AboutActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.about_tv)
    TextView aboutTv;
    @BindView(R.id.toolbar_layout)
    CollapsingToolbarLayout toolbarLayout;
    @BindView(R.id.version_tv)
    TextView versionTv;

    @Override
    protected void getBundleData(Bundle params) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_about;
    }

    @Override
    public void setTopBar(TopBar topBar) {
        hideTopBar();
    }

    @Override
    public boolean isCanRefresh() {
        return false;
    }

    @Override
    public void doOnRefresh() {

    }

    @Override
    public void doBusiness(Context context) {
        versionTv.setText(BuildConfig.VERSION_NAME);
        toolbarLayout.setExpandedTitleColor(Color.WHITE);//设置展开后标题的颜色
        toolbarLayout.setCollapsedTitleTextColor(Color.WHITE);//设置收缩后标题的颜色
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        aboutTv.setText(Html.fromHtml(getResources().getString(R.string.about_content)));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
