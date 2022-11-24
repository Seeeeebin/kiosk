package com.groufin.finpos.kiosk.product.repository;

import com.groufin.finpos.kiosk.product.domain.*;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class OptionCustomRepositoryImpl extends QuerydslRepositorySupport implements OptionCustomRepository {

    private static final QOption option = QOption.option;
    private static final QOptionGroup optionGroup = QOptionGroup.optionGroup;
    private static final QMenuOptionGroup menuOptionGroup = QMenuOptionGroup.menuOptionGroup;

    public OptionCustomRepositoryImpl() { super(Menu.class); }


    @Override
    public List<Option> findDetailsByMenuCode(String menuCode) {

        return from(option)
                .leftJoin(option.optionGroup, optionGroup).fetchJoin()
                .leftJoin(optionGroup.menuOptionGroup, menuOptionGroup).fetchJoin()
                .where(menuOptionGroup.menuCode.eq(menuCode))
                .fetch();

    }

    @Override
    public List<Option> findDetailsByStoreCode(String storeCode) {

        return from(option)
                .leftJoin(option.optionGroup, optionGroup).fetchJoin()
                .where(option.storeCode.eq(storeCode))
                .fetch();

    }




}
