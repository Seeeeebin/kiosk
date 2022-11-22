package com.groufin.finpos.kiosk.product.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/*@Getter
@ToString
@EqualsAndHashCode(of = "storeCode")*/
@Entity
@Table(name = "fin_file")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File {

    @Id
    @Column(name = "seq")
    private Integer seq;

    /*@OneToOne
    @MapsId
    @JoinColumn(name = "seq")
    private Menu menu;*/

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

    public File(Integer seq, String fileName, String fileOriginalName, String filePath, String fileDescription, String useYn, String brandTypeCode, LocalDateTime regDate) {
        this.seq = seq;
        this.fileName = fileName;
        this.fileOriginalName = fileOriginalName;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
        this.useYn = useYn;
        this.brandTypeCode = brandTypeCode;
        this.regDate = regDate;
    }
}
