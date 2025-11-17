package com.management.beneficiary.service.impl;

import com.management.beneficiary.dto.BeneficiaryRequestDTO;
import com.management.beneficiary.dto.BeneficiaryResponseDTO;
import com.management.beneficiary.service.BeneficiaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

  @Override
  public BeneficiaryResponseDTO create(BeneficiaryRequestDTO bookRequestDTO) {
    return null;
  }

  @Override
  public BeneficiaryResponseDTO findById(Long id) {
    return null;
  }

  @Override
  public List<BeneficiaryResponseDTO> findAllByUser() {
    return List.of();
  }

  @Override
  public void deleteByIdAndUser(Long id) {

  }

  @Override
  public BeneficiaryResponseDTO updateByUser(Long id, BeneficiaryRequestDTO bookRequestDTO) {
    return null;
  }
}
