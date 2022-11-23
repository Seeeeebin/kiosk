package com.groufin.finpos.kiosk.product.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "fin_option")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Option {

    @Column(name="store_code")
    private String storeCode;

    @Id @GeneratedValue
    @Column(name="option_code")
    private String optionCode;

    @Column(name="option_name")
    private String optionName;

    @Column(name="option_price")
    private String optionPrice;

    @Column(name="use_yn")
    private String useYn;

    @Column(name="display_index")
    private int displayIndex;

    @Column(name="pos_display_yn")
    private String posDisplayYn;

    @Column(name="app_display_yn")
    private String appDisplayYn;

    @Column(name="kiosk_display_yn")
    private String kioskDisplyYn;

    @Column(name="f1_color")
    private String f1Color;

    @Column(name="f2_color")
    private String f2Color;

    @Column(name="b1_color")
    private String b1Color;

    @Column(name="c1_color")
    private String c1Color;

    @Column(name="kaffa_seq")
    private Integer kaffaSeq;

    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;

    @UpdateTimestamp
    @Column(name="mod_date")
    private LocalDateTime modDate;


    @Column(name="sheet_name")
    private String sheetName;

    @Column(name="duplicate_yn")
    private String duplicateYn;

    @Column(name="inventory_yn")
    private String inventoryYn;

    @Column(name="inventory_count")
    private Integer inventoryCount;


    @Column(name="option_group_seq")
    private Integer optionGroupSeq;

    @ManyToOne
    @JoinColumn(name="option_code")
    private OptionGroupList optionGroupList;



}
