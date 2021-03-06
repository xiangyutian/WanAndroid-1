package com.allen.wanandroid.ui.article;

import com.allen.wanandroid.bean.BannerBean;
import com.allen.wanandroid.bean.HomeBean;
import com.library.base.mvp.IBaseMvpView;

import java.util.List;

/**
 * <pre>
 *      @author : Allen
 *      e-mail  : lygttpod@163.com
 *      date    : 2018/07/21
 *      desc    :
 *      version : 1.0
 * </pre>
 */
public interface ArticleView extends IBaseMvpView {

     void showBanner(List<BannerBean> list);
     void showNewArticleList(List<HomeBean.DatasEntity> list);
     void showMoreArticleList(List<HomeBean.DatasEntity> list);

     void collectSuccess(int position, String msg);
     void cancelCollectSuccess(int position, String msg);

     void loadMoreComplete();
     void loadMoreEnd();
     void enableLoadMore(boolean enable);

}
