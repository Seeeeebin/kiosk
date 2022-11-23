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
@Table(name = "fin_file")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File {

    @Id @GeneratedValue
    @Column(name = "seq")
    private Long seq;


    @Column(name="file_name")
    private String fileName;


    @Column(name="file_original_name")
    private String fileOriginalName;

    @Column(name="file_path")
    private String filePath;

    @Column(name="file_description")
    private String fileDescription;

    @Column(name="use_yn")
    private String useYn;

    @Column(name="brand_type_code")
    private String brandTypeCode;


    @CreationTimestamp
    @Column(name="reg_date")
    private LocalDateTime regDate;


    @OneToMany(mappedBy = "file")
    private List<Menu> menus = new ArrayList<>();

    public File(Long seq) {
        this.seq = seq;
    }
}
