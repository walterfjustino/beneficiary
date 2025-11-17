package com.management.beneficiary.dto;

import java.time.LocalDateTime;

public record BeneficiaryResponseDTO(
        Long id,
        String name,
        String telephone,
        String birthDate,
        LocalDateTime insertDate,
        LocalDateTime updateDate
) {
}
