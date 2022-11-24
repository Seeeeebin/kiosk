package com.groufin.finpos.kiosk.product.service;

import com.groufin.finpos.kiosk.product.domain.Category;
import com.groufin.finpos.kiosk.product.domain.Menu;
import com.groufin.finpos.kiosk.product.repository.MenuRepository;
import com.groufin.finpos.kiosk.product.service.dto.MenuDetails;
import com.groufin.finpos.kiosk.product.service.dto.MenuListResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {
    @Autowired
    private ModelMapper modelMapper;
    private final MenuRepository menuRepository;

    public MenuListResponse getMenusByCategoryCode(String categoryCode) {

        List<Menu> menuList = menuRepository.findDetailsByCategoryCode(categoryCode);

        List<MenuDetails> resultList = menuList.stream().map(menu -> modelMapper.map(menu, MenuDetails.class)).collect(Collectors.toList());

        return MenuListResponse.builder()
                .data(resultList)
                .build();

    }


}
