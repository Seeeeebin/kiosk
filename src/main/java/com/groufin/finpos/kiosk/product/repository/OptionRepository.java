package com.groufin.finpos.kiosk.product.repository;

import com.groufin.finpos.kiosk.product.domain.Menu;
import com.groufin.finpos.kiosk.product.domain.Option;
import com.groufin.finpos.kiosk.product.domain.OptionGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, String>, OptionCustomRepository {

    List<Option> findDetailsByMenuCode(String menuCode);

    List<Option> findDetailsByStoreCode(String storeCode);

}
