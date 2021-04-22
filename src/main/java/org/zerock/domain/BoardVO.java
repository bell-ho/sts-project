package org.zerock.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {

    private int boardNumber;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private Date boardRegisterDate;
    private Date boardUpdateDate;
}
