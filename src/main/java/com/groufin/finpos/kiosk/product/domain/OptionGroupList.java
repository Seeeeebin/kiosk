package com.groufin.finpos.kiosk.product.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "fin_option_group_list")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OptionGroupList {

    @Id
    @GeneratedValue
    private Long seq;

    @Column(name="option_group_seq")
    private Long optionGroupSeq;

    @Column(name="option_code")
    private String optionCode;

    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;


    @ManyToOne
    @JoinColumn(name="option_group_seq", insertable = false, updatable = false)
    private MenuOptionGroup menuOptionGroup;

    @OneToMany(mappedBy = "optionGroupList")
    private List<Option> options = new ArrayList<>();




}
