package zyrs.xyz.obadmin.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单项目关联
 */
public class MenuProject implements Serializable {
    //序列化ID
    private static final long serialVersionUID = 1;

    //二级菜单下的项目列表
    private List<Ob> obList;

    private Integer id;

    //二菜单属性...没有存一级菜单
    private Integer mid;
    private String mname;

    public List<Ob> getObList() {
        return obList;
    }

    public void setObList(List<Ob> obList) {
        this.obList = obList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "MenuProject{" +
                "obList=" + obList +
                ", id=" + id +
                ", mid=" + mid +
                ", mname='" + mname + '\'' +
                '}';
    }
}
