package com.luoromeo.ccm.credit.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.luoromeo.ccm.base.entity.ResultList;
import com.luoromeo.ccm.base.service.impl.BaseServiceImpl;
import com.luoromeo.ccm.credit.entity.CreditAccount;
import com.luoromeo.ccm.credit.repository.CreditAccountRepository;
import com.luoromeo.ccm.credit.service.CreditAccountService;

/**
 * @description
 * @author zhanghua.luo
 * @date 2018年04月23日 23:25
 * @modified By
 */
@Service
public class CreditAccountServiceImpl extends BaseServiceImpl<CreditAccount, CreditAccountRepository> implements CreditAccountService {

    @Override
    @SuppressWarnings("unchecked")
    public ResultList<CreditAccount> findByAvailableCreditGtEq(BigDecimal money) {
        List<CreditAccount> creditAccountList = this.getDao().findAllByAvailableCreditGreaterThanEqual(money);
        return ResultList.success("获取账户列表成功!", creditAccountList);
    }
}
