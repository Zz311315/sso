package com.by.service.impl;

import com.by.entity.TStu;
import com.by.dao.TStuDao;
import com.by.service.TStuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TStu)表服务实现类
 *
 * @author makejava
 * @since 2019-12-12 21:13:27
 */
@Service("tStuService")
public class TStuServiceImpl implements TStuService {
    @Resource
    private TStuDao tStuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stuId 主键
     * @return 实例对象
     */
    @Override
    public TStu queryById(Integer stuId) {
        return this.tStuDao.queryById(stuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TStu> queryAllByLimit(int offset, int limit) {
        return this.tStuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tStu 实例对象
     * @return 实例对象
     */
    @Override
    public TStu insert(TStu tStu) {
        this.tStuDao.insert(tStu);
        return tStu;
    }

    /**
     * 修改数据
     *
     * @param tStu 实例对象
     * @return 实例对象
     */
    @Override
    public TStu update(TStu tStu) {
        this.tStuDao.update(tStu);
        return this.queryById(tStu.getStuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param stuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stuId) {
        return this.tStuDao.deleteById(stuId) > 0;
    }

    @Override
    public List<TStu> findAll() {
        return tStuDao.findAll();
    }
}