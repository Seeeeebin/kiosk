package com.groufin.finpos.kiosk.product.repository;
import com.groufin.finpos.kiosk.product.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface MenuRepository extends JpaRepository<Menu, String>, MenuCustomRepository {

    List<Menu> findDetailsByCategoryCode(String categoryCode);

}
