package com.guigu.service;

import com.guigu.vo.Menu;
import com.guigu.vo.PageVo;

import java.util.List;

public interface MenuService {
    /**
     * 根据条件查询菜单  条件没有值 查所有
     * @param menu
     * @return
     */
    public List<Menu> queryMenubyCond(Menu menu,int page,int rows);

    /**
     * 根据条件查询菜单总数量
     * @param menu
     * @return
     */
    public PageVo<Menu> querycountMenubyCond(Menu menu, int page, int rows);
}
