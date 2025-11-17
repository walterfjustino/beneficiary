package com.management.beneficiary.service;

import com.management.beneficiary.dto.BeneficiaryRequestDTO;
import com.management.beneficiary.dto.BeneficiaryResponseDTO;

import java.util.List;

public interface BeneficiaryService {


  //TODO: ADD AuthenticatedUser authenticatedUser IN ALL METHODS

  BeneficiaryResponseDTO create(BeneficiaryRequestDTO bookRequestDTO);

  BeneficiaryResponseDTO findById(Long id);

  List<BeneficiaryResponseDTO> findAllByUser();

  void deleteByIdAndUser(Long id);

  BeneficiaryResponseDTO updateByUser(Long id, BeneficiaryRequestDTO bookRequestDTO);

}
