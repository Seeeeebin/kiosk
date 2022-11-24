package com.groufin.finpos.kiosk.product.service;

import com.groufin.finpos.kiosk.product.domain.Option;
import com.groufin.finpos.kiosk.product.domain.OptionGroup;
import com.groufin.finpos.kiosk.product.repository.OptionRepository;
import com.groufin.finpos.kiosk.product.service.dto.OptionDetails;
import com.groufin.finpos.kiosk.product.service.dto.OptionGroupDetails;
import com.groufin.finpos.kiosk.product.service.dto.OptionGroupListResponse;
import com.groufin.finpos.kiosk.product.service.dto.OptionListResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OptionService {
    @Autowired
    private ModelMapper modelMapper;
    private final OptionRepository optionRepository;

    public OptionListResponse getOptionsByMenuCode(String menuCode) {

        List<Option> optionList = optionRepository.findDetailsByMenuCode(menuCode);

        List<OptionDetails> resultList = optionList.stream().map(option -> modelMapper.map(option, OptionDetails.class)).collect(Collectors.toList());

        return OptionListResponse.builder()
                .data(resultList)
                .build();

    }


    public OptionGroupListResponse getOptionGroupsByStoreCode(String storeCode) {

        List<Option> optionGroupList = optionRepository.findDetailsByStoreCode(storeCode);

        List<OptionGroupDetails> resultList = optionGroupList.stream().map(optionGroup -> modelMapper.map(optionGroup, OptionGroupDetails.class)).collect(Collectors.toList());

        return OptionGroupListResponse.builder()
                .data(resultList)
                .build();

    }

}
