package com.rs.ys.mvpdemo;

import com.google.gson.annotations.SerializedName;
import com.rs.ys.mvpdemo.basics.BasicsResponse;

import java.util.List;

import okhttp3.ResponseBody;

/**
 * Created by 谢岳峰 on 2018/9/5.
 */
public class TestBean extends BasicsResponse {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","author":"pqpo","chapterId":401,"chapterName":"二维码","collect":false,"courseId":13,"desc":" A library for cropping image in a smart way that can identify the border and correct the cropped image. 智能图片裁剪框架。自动识别边框，手动调节选区，使用透视变换裁剪并矫正选区；适用于身份证，名片，文档等照片的裁剪。 \r\n","envelopePic":"http://wanandroid.com/blogimgs/6dd1ca2b-99df-403a-9df3-205e1ff483c6.png","fresh":true,"id":3358,"link":"http://www.wanandroid.com/blog/show/2326","niceDate":"13小时前","origin":"","projectLink":"https://github.com/pqpo/SmartCropper","publishTime":1536064696000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=401"}],"title":"智能图片裁剪框架 自动识别边框，手动调节选区 SmartCropper","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Qiu800820","chapterId":323,"chapterName":"动画","collect":false,"courseId":13,"desc":"今日头条点赞动画 连击动画 SuperLike","envelopePic":"http://wanandroid.com/blogimgs/29af95d6-67cf-49bb-9ce3-be4ae0a9c44b.png","fresh":true,"id":3357,"link":"http://www.wanandroid.com/blog/show/2325","niceDate":"13小时前","origin":"","projectLink":"https://github.com/Qiu800820/SuperLike","publishTime":1536064669000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=323"}],"title":"今日头条点赞动画 连击动画 SuperLike","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"meiniepan","chapterId":363,"chapterName":"创意汇","collect":false,"courseId":13,"desc":"抖音上炫代码的不少，有些真的让人叹为观止，作为一个androider，当我看到下面这段舞蹈的时候，终于忍不住了，想要通过android实现一样的效果。\r\n\r\n","envelopePic":"http://wanandroid.com/blogimgs/f495cc0f-2377-4dd7-83f1-bad051a96cf2.png","fresh":true,"id":3356,"link":"http://www.wanandroid.com/blog/show/2324","niceDate":"13小时前","origin":"","projectLink":"https://github.com/meiniepan/Pic2Ascii","publishTime":1536064614000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],"title":"抖音上很火的字符画 Pic2Ascii","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"minmin_1123","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3355,"link":"https://www.jianshu.com/p/eb570935d586","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535989375000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"2018Android暑期实习面试总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"minmin_1123","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3354,"link":"https://www.jianshu.com/p/0f72ac621f82","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535989353000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"2019Android秋招提前批面试总结(已拿BAT等6家口头offer)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Dogold","chapterId":186,"chapterName":"沉浸式","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3353,"link":"https://www.cnblogs.com/glorin/p/4962070.html","niceDate":"2天前","origin":"","projectLink":"","publishTime":1535878774000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"Android M如何设置状态栏图标黑白色","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"chandarlee","chapterId":186,"chapterName":"沉浸式","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3352,"link":"https://www.jianshu.com/p/d147608dc27b","niceDate":"2天前","origin":"","projectLink":"","publishTime":1535878715000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"沉浸式状态栏","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xujiaji","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一个简洁漂亮的WanAndroid客户端，用了些Python，用了360插件还有些乱七八糟的吧！主要结构框架：MVVM + Dagger2 + DataBinding + Lifecycle + OkHttp + Retrofit2","envelopePic":"http://wanandroid.com/blogimgs/1f69dcaa-730d-4b86-89d0-a87a241bc6bf.png","fresh":false,"id":3351,"link":"http://www.wanandroid.com/blog/show/2323","niceDate":"2天前","origin":"","projectLink":"https://github.com/xujiaji/WanAndroid","publishTime":1535878684000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid客户端 MVVM","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Veken","chapterId":339,"chapterName":"K线图","collect":false,"courseId":13,"desc":"一个简单的折线图 LineChartView","envelopePic":"http://www.wanandroid.com/blogimgs/3ff03326-154c-4eeb-83d6-3f9fc0d5a2e2.png","fresh":false,"id":3349,"link":"http://www.wanandroid.com/blog/show/2321","niceDate":"2018-09-01","origin":"","projectLink":"https://github.com/Veken/LineChartView","publishTime":1535794980000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=339"}],"title":"一个简单的折线图 LineChartView","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"黄林晴","chapterId":182,"chapterName":"JNI编程","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3347,"link":"https://blog.csdn.net/huangliniqng/article/details/82221283","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535730930000,"superChapterId":182,"superChapterName":"JNI","tags":[],"title":"Android 开发之 QQ变声功能实现","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"腾讯音乐技术团队","chapterId":406,"chapterName":"Android 9.0","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3346,"link":"https://mp.weixin.qq.com/s/GHYXOgbVL17d-UQwAy9-zg","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535703584000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"QQ 音乐 Android 吃 Pie 之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Sunzxyong","chapterId":87,"chapterName":"图片加载库","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3345,"link":"https://blog.csdn.net/u010687392/article/details/50266633","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535686154000,"superChapterId":87,"superChapterName":"图片加载","tags":[],"title":"Fresco图片框架内部实现原理探索","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"老实李","chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3344,"link":"https://www.jianshu.com/p/2db05dbcba2d","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535647001000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"HashMap的底层原理探索","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"pphdsny","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3343,"link":"https://www.jianshu.com/p/9ee00b90820d","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535646852000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"【项目优化】App启动优化实战","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"zeleven","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"干货集中营Android app（MVP + RxJava2 + Dagger2 + Retrofit）\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/e43c013b-2475-4335-8983-236aa4687d17.png","fresh":false,"id":3342,"link":"http://www.wanandroid.com/blog/show/2319","niceDate":"2018-08-31","origin":"","projectLink":"https://github.com/zeleven/scallop","publishTime":1535646376000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"干货集中营Android app（MVP + RxJava2 + Dagger2 + Retrofit）scallop ","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"kdn251","chapterId":367,"chapterName":"资源聚合类","collect":false,"courseId":13,"desc":"软件工程技术面试个人指南  interviews","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":3341,"link":"http://www.wanandroid.com/blog/show/2318","niceDate":"2018-08-29","origin":"","projectLink":"https://github.com/kdn251/interviews","publishTime":1535557558000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=367"}],"title":"软件工程技术面试个人指南  interviews","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"李晨玮","chapterId":125,"chapterName":"CoordinatorLayout","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3340,"link":"https://www.jianshu.com/p/36e974cb3af5","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557438000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"Android开发之CoordinatorLayout打造滑动越界弹性放大图片效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"宇是我 ","chapterId":142,"chapterName":"ConstraintLayout","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3339,"link":"https://www.jianshu.com/p/f110b4fcfe93","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557412000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"ConstraintLayout在项目中实践与总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"19snow93","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3338,"link":"https://www.jianshu.com/p/f73a715840fd","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557365000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"Android:一个线程玩转商品列表所有item的倒计时器，并对Adapter进行单控件刷新优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"杨哲丶","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3337,"link":"https://juejin.im/post/5b855bff51882542f0380e4c","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557254000,"superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"音视频入门系列之绘制图片三种方式","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":81,"size":20,"total":1607}
     */

    private DataBean data;

    public TestBean(ResponseBody responseBody, boolean showMsg) {
        super(responseBody, showMsg);
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","author":"pqpo","chapterId":401,"chapterName":"二维码","collect":false,"courseId":13,"desc":" A library for cropping image in a smart way that can identify the border and correct the cropped image. 智能图片裁剪框架。自动识别边框，手动调节选区，使用透视变换裁剪并矫正选区；适用于身份证，名片，文档等照片的裁剪。 \r\n","envelopePic":"http://wanandroid.com/blogimgs/6dd1ca2b-99df-403a-9df3-205e1ff483c6.png","fresh":true,"id":3358,"link":"http://www.wanandroid.com/blog/show/2326","niceDate":"13小时前","origin":"","projectLink":"https://github.com/pqpo/SmartCropper","publishTime":1536064696000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=401"}],"title":"智能图片裁剪框架 自动识别边框，手动调节选区 SmartCropper","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Qiu800820","chapterId":323,"chapterName":"动画","collect":false,"courseId":13,"desc":"今日头条点赞动画 连击动画 SuperLike","envelopePic":"http://wanandroid.com/blogimgs/29af95d6-67cf-49bb-9ce3-be4ae0a9c44b.png","fresh":true,"id":3357,"link":"http://www.wanandroid.com/blog/show/2325","niceDate":"13小时前","origin":"","projectLink":"https://github.com/Qiu800820/SuperLike","publishTime":1536064669000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=323"}],"title":"今日头条点赞动画 连击动画 SuperLike","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"meiniepan","chapterId":363,"chapterName":"创意汇","collect":false,"courseId":13,"desc":"抖音上炫代码的不少，有些真的让人叹为观止，作为一个androider，当我看到下面这段舞蹈的时候，终于忍不住了，想要通过android实现一样的效果。\r\n\r\n","envelopePic":"http://wanandroid.com/blogimgs/f495cc0f-2377-4dd7-83f1-bad051a96cf2.png","fresh":true,"id":3356,"link":"http://www.wanandroid.com/blog/show/2324","niceDate":"13小时前","origin":"","projectLink":"https://github.com/meiniepan/Pic2Ascii","publishTime":1536064614000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],"title":"抖音上很火的字符画 Pic2Ascii","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"minmin_1123","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3355,"link":"https://www.jianshu.com/p/eb570935d586","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535989375000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"2018Android暑期实习面试总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"minmin_1123","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3354,"link":"https://www.jianshu.com/p/0f72ac621f82","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535989353000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"2019Android秋招提前批面试总结(已拿BAT等6家口头offer)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Dogold","chapterId":186,"chapterName":"沉浸式","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3353,"link":"https://www.cnblogs.com/glorin/p/4962070.html","niceDate":"2天前","origin":"","projectLink":"","publishTime":1535878774000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"Android M如何设置状态栏图标黑白色","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"chandarlee","chapterId":186,"chapterName":"沉浸式","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3352,"link":"https://www.jianshu.com/p/d147608dc27b","niceDate":"2天前","origin":"","projectLink":"","publishTime":1535878715000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"沉浸式状态栏","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xujiaji","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一个简洁漂亮的WanAndroid客户端，用了些Python，用了360插件还有些乱七八糟的吧！主要结构框架：MVVM + Dagger2 + DataBinding + Lifecycle + OkHttp + Retrofit2","envelopePic":"http://wanandroid.com/blogimgs/1f69dcaa-730d-4b86-89d0-a87a241bc6bf.png","fresh":false,"id":3351,"link":"http://www.wanandroid.com/blog/show/2323","niceDate":"2天前","origin":"","projectLink":"https://github.com/xujiaji/WanAndroid","publishTime":1535878684000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid客户端 MVVM","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Veken","chapterId":339,"chapterName":"K线图","collect":false,"courseId":13,"desc":"一个简单的折线图 LineChartView","envelopePic":"http://www.wanandroid.com/blogimgs/3ff03326-154c-4eeb-83d6-3f9fc0d5a2e2.png","fresh":false,"id":3349,"link":"http://www.wanandroid.com/blog/show/2321","niceDate":"2018-09-01","origin":"","projectLink":"https://github.com/Veken/LineChartView","publishTime":1535794980000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=339"}],"title":"一个简单的折线图 LineChartView","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"黄林晴","chapterId":182,"chapterName":"JNI编程","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3347,"link":"https://blog.csdn.net/huangliniqng/article/details/82221283","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535730930000,"superChapterId":182,"superChapterName":"JNI","tags":[],"title":"Android 开发之 QQ变声功能实现","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"腾讯音乐技术团队","chapterId":406,"chapterName":"Android 9.0","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3346,"link":"https://mp.weixin.qq.com/s/GHYXOgbVL17d-UQwAy9-zg","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535703584000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"QQ 音乐 Android 吃 Pie 之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Sunzxyong","chapterId":87,"chapterName":"图片加载库","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3345,"link":"https://blog.csdn.net/u010687392/article/details/50266633","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535686154000,"superChapterId":87,"superChapterName":"图片加载","tags":[],"title":"Fresco图片框架内部实现原理探索","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"老实李","chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3344,"link":"https://www.jianshu.com/p/2db05dbcba2d","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535647001000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"HashMap的底层原理探索","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"pphdsny","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3343,"link":"https://www.jianshu.com/p/9ee00b90820d","niceDate":"2018-08-31","origin":"","projectLink":"","publishTime":1535646852000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"【项目优化】App启动优化实战","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"zeleven","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"干货集中营Android app（MVP + RxJava2 + Dagger2 + Retrofit）\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/e43c013b-2475-4335-8983-236aa4687d17.png","fresh":false,"id":3342,"link":"http://www.wanandroid.com/blog/show/2319","niceDate":"2018-08-31","origin":"","projectLink":"https://github.com/zeleven/scallop","publishTime":1535646376000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"干货集中营Android app（MVP + RxJava2 + Dagger2 + Retrofit）scallop ","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"kdn251","chapterId":367,"chapterName":"资源聚合类","collect":false,"courseId":13,"desc":"软件工程技术面试个人指南  interviews","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":3341,"link":"http://www.wanandroid.com/blog/show/2318","niceDate":"2018-08-29","origin":"","projectLink":"https://github.com/kdn251/interviews","publishTime":1535557558000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=367"}],"title":"软件工程技术面试个人指南  interviews","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"李晨玮","chapterId":125,"chapterName":"CoordinatorLayout","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3340,"link":"https://www.jianshu.com/p/36e974cb3af5","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557438000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"Android开发之CoordinatorLayout打造滑动越界弹性放大图片效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"宇是我 ","chapterId":142,"chapterName":"ConstraintLayout","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3339,"link":"https://www.jianshu.com/p/f110b4fcfe93","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557412000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"ConstraintLayout在项目中实践与总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"19snow93","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3338,"link":"https://www.jianshu.com/p/f73a715840fd","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557365000,"superChapterId":54,"superChapterName":"5.+高新技术","tags":[],"title":"Android:一个线程玩转商品列表所有item的倒计时器，并对Adapter进行单控件刷新优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"杨哲丶","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3337,"link":"https://juejin.im/post/5b855bff51882542f0380e4c","niceDate":"2018-08-29","origin":"","projectLink":"","publishTime":1535557254000,"superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"音视频入门系列之绘制图片三种方式","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 81
         * size : 20
         * total : 1607
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * author : pqpo
             * chapterId : 401
             * chapterName : 二维码
             * collect : false
             * courseId : 13
             * desc :  A library for cropping image in a smart way that can identify the border and correct the cropped image. 智能图片裁剪框架。自动识别边框，手动调节选区，使用透视变换裁剪并矫正选区；适用于身份证，名片，文档等照片的裁剪。

             * envelopePic : http://wanandroid.com/blogimgs/6dd1ca2b-99df-403a-9df3-205e1ff483c6.png
             * fresh : true
             * id : 3358
             * link : http://www.wanandroid.com/blog/show/2326
             * niceDate : 13小时前
             * origin :
             * projectLink : https://github.com/pqpo/SmartCropper
             * publishTime : 1536064696000
             * superChapterId : 294
             * superChapterName : 开源项目主Tab
             * tags : [{"name":"项目","url":"/project/list/1?cid=401"}]
             * title : 智能图片裁剪框架 自动识别边框，手动调节选区 SmartCropper
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String origin;
            private String projectLink;
            private long publishTime;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 项目
                 * url : /project/list/1?cid=401
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
