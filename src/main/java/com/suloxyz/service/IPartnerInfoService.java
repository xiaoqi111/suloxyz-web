package com.suloxyz.service;

import com.suloxyz.entity.CorporatePartner;

import java.util.List;

public interface IPartnerInfoService {

    boolean save(CorporatePartner partner);

    boolean deleteById(Integer id);

    boolean update(CorporatePartner partner);

    List<CorporatePartner> queryPartners(CorporatePartner corporatePartner);

    CorporatePartner queryPartnerById(CorporatePartner corporatePartner);



}
