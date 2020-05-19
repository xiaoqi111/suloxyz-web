package com.suloxyz.service.impl;

import com.suloxyz.entity.CorporatePartner;
import com.suloxyz.mapper.PartnerInfoMapper;
import com.suloxyz.service.IPartnerInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerInfoServiceImpl implements IPartnerInfoService {

    private PartnerInfoMapper mapper;

    public PartnerInfoServiceImpl(PartnerInfoMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public boolean save(CorporatePartner partner) {
        int insert = mapper.insert(partner);
        return insert == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public boolean update(CorporatePartner partner) {
        return false;
    }

    @Override
    public List<CorporatePartner> queryPartners(CorporatePartner corporatePartner) {
        List<CorporatePartner> corporatePartners = mapper.selectList(null);
        if (corporatePartner == null )
        {
            corporatePartners = mapper.selectList(null);
            return corporatePartners;
        }
        return null;
    }

    @Override
    public CorporatePartner queryPartnerById(CorporatePartner corporatePartner) {
        return null;
    }
}
