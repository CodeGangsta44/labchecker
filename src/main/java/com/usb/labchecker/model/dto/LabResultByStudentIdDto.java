package com.usb.labchecker.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LabResultByStudentIdDto {

    private Integer id;
    private Integer subjectId;
    private Integer labId;
    private Double result;

}
