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
@Getter
@Table(name = "fin_menu_category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id
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
    public Category(String storeCode) {
        this.storeCode   = storeCode;
    }
}
