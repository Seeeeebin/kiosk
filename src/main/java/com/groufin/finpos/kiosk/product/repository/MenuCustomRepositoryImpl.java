package com.groufin.finpos.kiosk.product.repository;

import com.groufin.finpos.kiosk.product.domain.Menu;
import com.groufin.finpos.kiosk.product.domain.QFile;
import com.groufin.finpos.kiosk.product.domain.QMenu;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import java.util.List;

public class MenuCustomRepositoryImpl extends QuerydslRepositorySupport implements MenuCustomRepository {

    private static final QMenu menu = QMenu.menu;
    private static final QFile file = QFile.file;

    public MenuCustomRepositoryImpl() { super(Menu.class); }


    @Override
    public List<Menu> findDetailsByCategoryCode(String categoryCode) {
        return from(menu)
                .leftJoin(menu.file, file)//.on(menu.file.seq.eq(file.seq))
                .fetchJoin()
                .where(menu.categoryCode.eq(categoryCode))
                .fetch();
    }




}
