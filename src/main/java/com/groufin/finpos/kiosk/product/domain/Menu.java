package com.groufin.finpos.kiosk.product.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "fin_menu_code")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu {


    @Column(name="store_code")
    private String storeCode;

    @Column(name="category_code")
    private String categoryCode;

    @Id
    @Column(name="menu_code")
    private String menuCode;

    @Column(name="menu_name")
    private String menuName;

    private String barcode;

    @Column(name="menu_description")
    private String menuDescription;

    @Column(name="tax_flag")
    private String taxFlag;


    @Column(name="pos_display_yn")
    private String posDisplayYn;

    @Column(name="app_display_yn")
    private String appDisplayYn;

    @Column(name="kiosk_display_yn")
    private String kioskDisplayYn;


    @Column(name="display_index")
    private String displayIndex;

    @Column(name="cost_price")
    private String costPrice;

    @Column(name="online_order_yn")
    private String onlineOrderYn;

    @Column(name="online_soldout_date")
    private String onlineSoldoutDate;

    @Column(name="f1_color")
    private String f1Color;

    @Column(name="f2_color")
    private String f2Color;

    @Column(name="b1_color")
    private String b1Color;

    @Column(name="c1_color")
    private String c1Color;

    @Column(name="stamp_yn")
    private String stampYn;

    @Column(name="point_yn")
    private String pointYn;

    @Column(name="order_state_yn")
    private String orderStateYn;

    @Column(name="inventory_yn")
    private String inventoryYn;

    @Column(name="inventory_count")
    private Integer inventoryCount;


    @Column(name="sheet_name")
    private String sheetName;


    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;

    @UpdateTimestamp
    @Column(name="mod_date")
    private LocalDateTime modDate;

    @ManyToOne
    @JoinColumn(name = "file_seq")
    private File file;

    public Menu(String storeCode) {
        this.storeCode = storeCode;
    }

    public void changeFile(File file){
        this.file = file; // 자신 변경
        file.getMenus().add(this); // 연관관계가 있는 File엔티티도 변경
    }


}
