package com.groufin.finpos.kiosk.product.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "fin_menu_option_group")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuOptionGroup {

    @Id
    @GeneratedValue
    private Long seq;

    @Column(name="option_group_seq")
    private Long optionGroupSeq;

    @OneToMany(mappedBy = "menuOptionGroup")
    private List<OptionGroupList> optionGroups = new ArrayList<>();




    @Column(name="menu_code")
    private String menuCode;


}
