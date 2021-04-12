package com.dxn.service.cargo;

import com.dxn.domain.cargo.Contract;
import com.dxn.domain.cargo.ContractExample;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author dxn
 * @version 1.0
 * @date 2021/3/11 20:21
 */
public interface ContractService {

    int deleteByPrimaryKey(String id);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);

    /**
     * @param contractExample
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo findAll(ContractExample contractExample, int pageNum, int pageSize);
}