package com.guigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.guigu.dao.MenuDao;
import com.guigu.service.MenuService;
import com.guigu.vo.Menu;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    //页数只有一页
    @Override
    public List<Menu> queryMenubyCond(Menu menu, int page, int rows) {
        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);

        return menuDao.queryMenubyCond(menu);
    }

    //分页查询所有
    @Override
    public PageVo<Menu> querycountMenubyCond(Menu menu, int page, int rows) {
        PageVo<Menu> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(menuDao.queryMenubyCond(menu));
        //获取总的记录数量
        pageVo.setTotal(menuDao.querycountMenubyCond(menu));

        return pageVo;
    }


}
