package com.test.wayne.shishicai;

/**
 * Created by paocai on 2018/3/31.
 */

public class MessageBean {

    private String title;
    private String content;

    public MessageBean(String title,String content){
        this.title=title;
        this.content=content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
