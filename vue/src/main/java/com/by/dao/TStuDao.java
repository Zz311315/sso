package com.by.dao;

import com.by.entity.TStu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TStu)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-12 21:13:27
 */
@Mapper
public interface TStuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param stuId 主键
     * @return 实例对象
     */
    TStu queryById(Integer stuId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TStu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tStu 实例对象
     * @return 对象列表
     */
    List<TStu> queryAll(TStu tStu);

    /**
     * 新增数据
     *
     * @param tStu 实例对象
     * @return 影响行数
     */
    int insert(TStu tStu);

    /**
     * 修改数据
     *
     * @param tStu 实例对象
     * @return 影响行数
     */
    int update(TStu tStu);

    /**
     * 通过主键删除数据
     *
     * @param stuId 主键
     * @return 影响行数
     */
    int deleteById(Integer stuId);

    List<TStu> findAll();
}