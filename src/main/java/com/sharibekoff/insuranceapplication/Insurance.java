package com.sharibekoff.insuranceapplication;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Insurance {
    private String id;
    @NotBlank(message = "Insurance name shouldn't be empty")
    private String name;
    private InsuranceType type;

    public enum InsuranceType {
        AUTO, PROPERTY, LIFE, HEALTH
    }
}
