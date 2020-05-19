package com.suloxyz.controller;

import com.suloxyz.common.Result;
import com.suloxyz.entity.CorporatePartner;
import com.suloxyz.service.IPartnerInfoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Corporate Partner Info Controller
 */
@RestController
public class PartnerInfoController {

    private IPartnerInfoService service;

    public PartnerInfoController(IPartnerInfoService service) {
        this.service = service;
    }

    @PostMapping("/partner")
    public Result savePartner(@Validated CorporatePartner partner){
        boolean save = service.save(partner);
        if (save){
            return Result.create();
        }
        return Result.expResult().setMsg("save fail");
    }

    @GetMapping("/partners")
    public Result getPartners(){
        List<CorporatePartner> corporatePartners = service.queryPartners(null);
        return Result.create().setData(corporatePartners);
    }

}
