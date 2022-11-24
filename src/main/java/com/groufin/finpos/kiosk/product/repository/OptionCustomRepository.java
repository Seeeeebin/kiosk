package com.groufin.finpos.kiosk.product.repository;
import com.groufin.finpos.kiosk.product.domain.Menu;
import com.groufin.finpos.kiosk.product.domain.Option;
import com.groufin.finpos.kiosk.product.domain.OptionGroup;

import java.util.List;

public interface OptionCustomRepository {

    List<Option> findDetailsByMenuCode(String menuCode);
    List<Option> findDetailsByStoreCode(String storeCode);

}
