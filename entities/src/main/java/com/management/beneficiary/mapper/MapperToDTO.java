package com.management.beneficiary.mapper;

import com.management.beneficiary.dto.DocumentDTO;
import com.management.beneficiary.entities.Document;

import java.util.Optional;
import java.util.function.Function;

public class MapperToDTO implements Function<Document, Optional<DocumentDTO>> {

  @Override
  public Optional<DocumentDTO> apply(Document document) {

    return Optional.of(new DocumentDTO(
                    document.getId(),
                    document.getTipoDocumento(),
                    document.getDescricao(),
                    document.getInsertDate(),
                    document.getUpdateDate()
            )
    );
  }
}
