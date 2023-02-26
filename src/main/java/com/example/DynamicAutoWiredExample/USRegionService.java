package com.example.DynamicAutoWiredExample;

import org.springframework.stereotype.Service;

@Service("USregionService")
public class USRegionService implements RegionService{

    @Override
    public boolean isServerActive(int serverId) {
        return false;
    }

    @Override
    public String getISOCountryCode() {
        return "US";
    }
}
