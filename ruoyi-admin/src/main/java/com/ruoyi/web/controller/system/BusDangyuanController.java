package com.ruoyi.web.controller.system;

import java.util.List;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.BusDangyuan;
import com.ruoyi.system.service.IBusDangyuanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 党员信息管理Controller
 * 
 * @author ruoyi
 * @date 2025-05-17
 */
@RestController
@RequestMapping("/system/dangyuan")
public class BusDangyuanController extends BaseController
{
    @Autowired
    private IBusDangyuanService busDangyuanService;

    /**
     * 查询党员信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:dangyuan:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusDangyuan busDangyuan)
    {
        startPage();
        List<BusDangyuan> list = busDangyuanService.selectBusDangyuanList(busDangyuan);
        return getDataTable(list);
    }

    /**
     * 导出党员信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:dangyuan:export')")
    @Log(title = "党员信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusDangyuan busDangyuan)
    {
        List<BusDangyuan> list = busDangyuanService.selectBusDangyuanList(busDangyuan);
        ExcelUtil<BusDangyuan> util = new ExcelUtil<BusDangyuan>(BusDangyuan.class);
        util.exportExcel(response, list, "党员信息管理数据");
    }

    /**
     * 获取党员信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:dangyuan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(busDangyuanService.selectBusDangyuanById(id));
    }

    /**
     * 新增党员信息管理
     */
    @PreAuthorize("@ss.hasPermi('system:dangyuan:add')")
    @Log(title = "党员信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusDangyuan busDangyuan)
    {
        return toAjax(busDangyuanService.insertBusDangyuan(busDangyuan));
    }

    /**
     * 修改党员信息管理
     */
    @PreAuthorize("@ss.hasPermi('system:dangyuan:edit')")
    @Log(title = "党员信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusDangyuan busDangyuan)
    {
        return toAjax(busDangyuanService.updateBusDangyuan(busDangyuan));
    }

    /**
     * 删除党员信息管理
     */
    @PreAuthorize("@ss.hasPermi('system:dangyuan:remove')")
    @Log(title = "党员信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(busDangyuanService.deleteBusDangyuanByIds(ids));
    }
}
