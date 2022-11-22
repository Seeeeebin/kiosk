package com.groufin.finpos.kiosk.product.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/*@Getter
@ToString
@EqualsAndHashCode(of = "storeCode")*/
@Entity
@Table(name = "fin_menu_category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_code")
    private String categoryCode;

    @Column(name="store_code")
    private String storeCode;

    @Column(name="category_name")
    private String categoryName;

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

    private Integer sort;

    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;

    @UpdateTimestamp
    @Column(name="mod_date")
    private LocalDateTime modDate;

    @Builder
    public Category(String categoryCode, String storeCode, String categoryName, String useYn, int displayIndex, String posDisplayYn, String appDisplayYn, String kioskDisplyYn, String f1Color, String f2Color, String b1Color, String c1Color, int sort, LocalDateTime regDate, LocalDateTime modDate) {
        this.categoryCode   = categoryCode;
        this.storeCode      = storeCode;
        this.categoryName   = categoryName;
        this.useYn          = useYn;
        this.displayIndex   = displayIndex;
        this.posDisplayYn   = posDisplayYn;
        this.appDisplayYn   = appDisplayYn;
        this.kioskDisplyYn  = kioskDisplyYn;
        this.f1Color        = f1Color;
        this.f2Color        = f2Color;
        this.b1Color        = b1Color;
        this.c1Color        = c1Color;
        this.sort           = sort;
        this.regDate        = regDate;
        this.modDate        = modDate;
    }
}
