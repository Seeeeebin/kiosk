package com.groufin.finpos.kiosk.product.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "fin_option_group_list")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OptionGroup implements Serializable {

    @Id
    @GeneratedValue
    private Long seq;

   /* @Column(name="option_group_seq")
    private Long optionGroupSeq;*/

    @Column(name="option_code")
    private String optionCode;

    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName="option_group_seq", name="optionGroupSeq")
    private MenuOptionGroup menuOptionGroup;

    @OneToMany(mappedBy = "optionGroup")
    private List<Option> options = new ArrayList<>();




}
