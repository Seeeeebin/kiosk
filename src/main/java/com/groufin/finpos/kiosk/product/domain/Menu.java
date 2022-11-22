package com.groufin.finpos.kiosk.product.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/*@Getter
@ToString
@EqualsAndHashCode(of = "storeCode")*/
@Entity
@Table(name = "fin_menu_code")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@ToString(exclude = "lMember")
public class Menu {


    @Column(name="store_code")
    private String storeCode;

    @Column(name="category_code")
    private String categoryCode;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="menu_code")
    private String menuCode;

    @Column(name="menu_name")
    private String menuName;

    private String barcode;

    @Column(name="menu_description")
    private String menuDescription;

    @Column(name="tax_flag")
    private String taxFlag;

    @Column(name="display_index")
    private String displayIndex;

    @Column(name="cost_price")
    private String costPrice;


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

    @Column(name = "file_seq")
    private Integer fileSeq;

    /*@OneToOne(mappedBy = "menu", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private File file;*/


    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;

    @UpdateTimestamp
    @Column(name="mod_date")
    private LocalDateTime modDate;

    public Menu(String storeCode, String categoryCode, String menuCode, String menuName, String barcode, String menuDescription, String taxFlag, String displayIndex, String costPrice, String f1Color, String f2Color, String b1Color, String c1Color, String stampYn, String pointYn, String orderStateYn, String inventoryYn, Integer fileSeq, LocalDateTime regDate, LocalDateTime modDate) {
        this.storeCode = storeCode;
        this.categoryCode = categoryCode;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.barcode = barcode;
        this.menuDescription = menuDescription;
        this.taxFlag = taxFlag;
        this.displayIndex = displayIndex;
        this.costPrice = costPrice;
        this.f1Color = f1Color;
        this.f2Color = f2Color;
        this.b1Color = b1Color;
        this.c1Color = c1Color;
        this.stampYn = stampYn;
        this.pointYn = pointYn;
        this.orderStateYn = orderStateYn;
        this.inventoryYn = inventoryYn;
        this.fileSeq = fileSeq;
        this.regDate = regDate;
        this.modDate = modDate;
    }
}
