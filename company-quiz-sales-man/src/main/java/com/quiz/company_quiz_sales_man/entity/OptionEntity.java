package com.quiz.company_quiz_sales_man.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class OptionEntity extends BaseEntity {

    private String opt;
}
