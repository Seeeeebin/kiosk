package com.groufin.finpos.kiosk.product.repository;
import com.groufin.finpos.kiosk.product.domain.Menu;

import java.util.List;

public interface MenuCustomRepository {

    List<Menu> findDetailsByCategoryCode(String categoryCode);

}
