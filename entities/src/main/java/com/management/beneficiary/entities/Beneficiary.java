package com.management.beneficiary.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "beneficiary")
public class Beneficiary extends Auditable {

    private Long id;
    private String name;
    private String telephone;
    private String birthDate;

    @Override
    public LocalDateTime getInsertDate() {
        return super.getInsertDate();
    }

    @Override
    public void setInsertDate(LocalDateTime insertDate) {
        super.setInsertDate(insertDate);
    }

    @Override
    public LocalDateTime getUpdateDate() {
        return super.getUpdateDate();
    }

    @Override
    public void setUpdateDate(LocalDateTime updateDate) {
        super.setUpdateDate(updateDate);
    }
}
