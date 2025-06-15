package br.com.doni.crud.controller;

import br.com.doni.crud.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")  //  prefixo de rota
public class CloudVendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId)
    {
        return cloudVendor;
                //new CloudVendor("C1", "Vendor 1", "Address One", "xxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return  "Cloud Vendor created successfully";
    }
}
