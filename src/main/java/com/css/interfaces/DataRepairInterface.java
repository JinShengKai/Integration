package com.css.interfaces;

import com.css.entity.RepairInfo;

import java.util.List;

public interface DataRepairInterface {
    public List<RepairInfo> queryDataRepairList(int datetime);
}
