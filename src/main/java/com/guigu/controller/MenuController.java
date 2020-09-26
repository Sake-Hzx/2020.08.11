package com.guigu.controller;

import com.guigu.service.MenuService;
import com.guigu.vo.Menu;
import com.guigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    MenuService menuService;

    /**
     *page  获取当前的页码数
     * rows  获取当前的每页显示条数
     */
    //页数只有一页
    @RequestMapping("/querymenubycond.action")
    @ResponseBody
    public List<Menu> queryMenubyCond(Menu menu,
                                        @RequestParam(value = "page",defaultValue = "1") int page,
                                        @RequestParam(value = "rows",defaultValue = "5")int rows){
        return menuService.queryMenubyCond(menu,page,rows);
    }

    //分页查询所有
    @RequestMapping("/querymenubycond2.action")
    @ResponseBody
    public PageVo<Menu> queryPersonbyCond2(Menu menu,
                                           @RequestParam(value = "page",defaultValue = "1") int page,
                                           @RequestParam(value = "rows",defaultValue = "5")int rows){
        return menuService.querycountMenubyCond(menu,page,rows);
    }
}
