package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BusDangyuanMapper;
import com.ruoyi.system.domain.BusDangyuan;
import com.ruoyi.system.service.IBusDangyuanService;

/**
 * 党员信息管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-17
 */
@Service
public class BusDangyuanServiceImpl implements IBusDangyuanService 
{
    @Autowired
    private BusDangyuanMapper busDangyuanMapper;

    /**
     * 查询党员信息管理
     * 
     * @param id 党员信息管理主键
     * @return 党员信息管理
     */
    @Override
    public BusDangyuan selectBusDangyuanById(Long id)
    {
        return busDangyuanMapper.selectBusDangyuanById(id);
    }

    /**
     * 查询党员信息管理列表
     * 
     * @param busDangyuan 党员信息管理
     * @return 党员信息管理
     */
    @Override
    public List<BusDangyuan> selectBusDangyuanList(BusDangyuan busDangyuan)
    {
        return busDangyuanMapper.selectBusDangyuanList(busDangyuan);
    }

    /**
     * 新增党员信息管理
     * 
     * @param busDangyuan 党员信息管理
     * @return 结果
     */
    @Override
    public int insertBusDangyuan(BusDangyuan busDangyuan)
    {
        return busDangyuanMapper.insertBusDangyuan(busDangyuan);
    }

    /**
     * 修改党员信息管理
     * 
     * @param busDangyuan 党员信息管理
     * @return 结果
     */
    @Override
    public int updateBusDangyuan(BusDangyuan busDangyuan)
    {
        return busDangyuanMapper.updateBusDangyuan(busDangyuan);
    }

    /**
     * 批量删除党员信息管理
     * 
     * @param ids 需要删除的党员信息管理主键
     * @return 结果
     */
    @Override
    public int deleteBusDangyuanByIds(Long[] ids)
    {
        return busDangyuanMapper.deleteBusDangyuanByIds(ids);
    }

    /**
     * 删除党员信息管理信息
     * 
     * @param id 党员信息管理主键
     * @return 结果
     */
    @Override
    public int deleteBusDangyuanById(Long id)
    {
        return busDangyuanMapper.deleteBusDangyuanById(id);
    }
}
