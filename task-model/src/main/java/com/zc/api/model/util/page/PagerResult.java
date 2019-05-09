package com.zc.api.model.util.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @Description 分页出参
 * @Author       Peihan.Zhang
 * @CreateTime  2018/4/19
 * @Email       zhangpeihan@jchzbj.com
 */
public class PagerResult<T> implements Serializable {
    private static final long serialVersionUID = 3141067807832984876L;
    //返回集合
    private List<T> rows;
    //总条数
    private int total;

    private int pageNum;    //当前页,从请求那边传过来
    private int pageSize;    //每页显示的数据条数。

    public PagerResult() {
        this.rows = Collections.emptyList();
    }

    public PagerResult(int pageNum,int pageSize,List<T> list) {
        this.pageNum = --pageNum;
        this.pageSize = pageSize;
        if(list!=null){
            this.total=list.size();
            List<T> result= list.stream().skip(pageNum*pageSize).limit(pageSize).collect(Collectors.toList());
            this.rows=result;
        }
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public <K> PagerResult<K> convertPagerResult(PagerResult.Converter<Object, K> converter) {
        ArrayList kList = new ArrayList(this.rows.size());
        Iterator prK = this.getRows().iterator();

        while(prK.hasNext()) {
            Object entity = prK.next();
            kList.add(converter.convert(entity));
        }

        PagerResult prK1 = new PagerResult();
        prK1.setTotal(this.getTotal());
        prK1.setRows(kList);
        return prK1;
    }

    public <K> PagerResult<K> clonePagerResult(PagerResult<K> result) {
        if(result == null) {
            result = new PagerResult();
        }
        result.total = this.total;
        return result;
    }

    public static <T> PagerResult<T> emptyPagerResult() {
        PagerResult result = new PagerResult();
        result.setTotal(0);
        return result;
    }

    public interface Converter<T, K> {
        K convert(T var1);
    }
}
