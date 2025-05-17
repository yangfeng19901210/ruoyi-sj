package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BusDangyuan;

/**
 * 党员信息管理Service接口
 * 
 * @author ruoyi
 * @date 2025-05-17
 */
public interface IBusDangyuanService 
{
    /**
     * 查询党员信息管理
     * 
     * @param id 党员信息管理主键
     * @return 党员信息管理
     */
    public BusDangyuan selectBusDangyuanById(Long id);

    /**
     * 查询党员信息管理列表
     * 
     * @param busDangyuan 党员信息管理
     * @return 党员信息管理集合
     */
    public List<BusDangyuan> selectBusDangyuanList(BusDangyuan busDangyuan);

    /**
     * 新增党员信息管理
     * 
     * @param busDangyuan 党员信息管理
     * @return 结果
     */
    public int insertBusDangyuan(BusDangyuan busDangyuan);

    /**
     * 修改党员信息管理
     * 
     * @param busDangyuan 党员信息管理
     * @return 结果
     */
    public int updateBusDangyuan(BusDangyuan busDangyuan);

    /**
     * 批量删除党员信息管理
     * 
     * @param ids 需要删除的党员信息管理主键集合
     * @return 结果
     */
    public int deleteBusDangyuanByIds(Long[] ids);

    /**
     * 删除党员信息管理信息
     * 
     * @param id 党员信息管理主键
     * @return 结果
     */
    public int deleteBusDangyuanById(Long id);
}
