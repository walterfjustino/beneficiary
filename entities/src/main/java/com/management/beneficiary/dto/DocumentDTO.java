package com.management.beneficiary.dto;

import java.time.LocalDateTime;

public record DocumentDTO(
        Long id,
        String tipoDocumento,
        String descricao,
        LocalDateTime insertDate,
        LocalDateTime updateDate
)  {
}
