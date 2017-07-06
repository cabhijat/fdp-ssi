package com.flipkart.fdp.ssi.app;

import com.flipkart.fdp.dws.wrapper.app.GuiceModulesProvider;
import com.flipkart.fdp.utils.cfg.ConfigService;
import com.google.inject.Module;

import java.util.List;

/**
 * Created by abhijat.chowdhary on 05/07/17.
 */
public class SSIModuleProvider implements GuiceModulesProvider {
    @Override
    public List<? extends Module> getModules(ConfigService configService) {
        return new SSIModule(configService).getModules();
    }
}
