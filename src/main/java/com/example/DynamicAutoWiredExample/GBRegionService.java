package com.example.DynamicAutoWiredExample;

import org.springframework.stereotype.Service;

@Service("GBRegionService")
public class GBRegionService implements RegionService
{

    @Override
    public boolean isServerActive(int serverId) {
        return false;
    }

    @Override
    public String getISOCountryCode() {
        return "GB";
    }
}
