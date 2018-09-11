package com.rs.ys.mvpdemo.http;

/**
 * Created by admin on 2018/3/21.
 */

public abstract class PageRequest extends BasicsRequest {

    public PageRequest(){
        init();
    }

    protected void init() {

    }

    private int page = 1 ;
    private int rows = 10 ;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
