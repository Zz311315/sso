package com.by.controller;

import com.by.entity.TStu;
import com.by.service.TStuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TStu)表控制层
 *
 * @author makejava
 * @since 2019-12-12 21:13:27
 */
@Controller
@RequestMapping("stu")
public class TStuController {
    /**
     * 服务对象
     */
    @Resource
    private TStuService stuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("list")
    public String list(){
        return "list";
    }
    @ResponseBody
    @RequestMapping("findAll")
    public List<TStu> findAll(){
        List<TStu> list = stuService.findAll();
        return list;
    }
    @ResponseBody
    @RequestMapping("deleteById")
    public String deleteById(Integer id){
        stuService.deleteById(id);
        return "success";
    }
    @ResponseBody
    @RequestMapping("add")
    public String add(TStu stu){
    stuService.insert(stu);
        return "success";
    }
    @ResponseBody
    @RequestMapping("updataById")
    public TStu updataById(Integer id){
        TStu tStu = stuService.queryById(id);
        return tStu;
    }
    @ResponseBody
    @RequestMapping("update")
    public String update(TStu stu){
        stuService.update(stu);
        return "success";
    }



}