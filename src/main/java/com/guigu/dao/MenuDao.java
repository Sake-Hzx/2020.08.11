package com.guigu.dao;

import com.guigu.vo.Menu;

import java.util.List;

public interface MenuDao {
    /**
     * 根据条件查询菜单  条件没有值 查所有
     * @param menu
     * @return
     */
    public List<Menu> queryMenubyCond(Menu menu);

    /**
     * 根据条件查询菜单总数量
     * @param menu
     * @return
     */
    public int querycountMenubyCond(Menu menu);
}
