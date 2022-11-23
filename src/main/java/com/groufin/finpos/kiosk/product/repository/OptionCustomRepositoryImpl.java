package com.groufin.finpos.kiosk.product.repository;

import com.groufin.finpos.kiosk.product.domain.*;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class OptionCustomRepositoryImpl extends QuerydslRepositorySupport implements OptionCustomRepository {

    private static final QOption option = QOption.option;
    private static final QOptionGroupList optionGroupList = QOptionGroupList.optionGroupList;
    private static final QMenuOptionGroup menuOptionGroup = QMenuOptionGroup.menuOptionGroup;

    public OptionCustomRepositoryImpl() { super(Menu.class); }


    @Override
    public List<Option> findDetailsByMenuCode(String menuCode) {
        /*return from(menuOptionGroup)
                .leftJoin(menuOptionGroup.optionGroups, optionGroupList).fetchJoin()
                .leftJoin(optionGroupList.options, option).fetchJoin()
                .where(menuOptionGroup.menuCode.eq(menuCode))
                .fetch();*/


        return from(option)
                .leftJoin(option.optionGroupList, optionGroupList).fetchJoin()
                .leftJoin(optionGroupList.menuOptionGroup, menuOptionGroup).fetchJoin()
                .where(menuOptionGroup.menuCode.eq(menuCode))
                .fetch();

    }




}
