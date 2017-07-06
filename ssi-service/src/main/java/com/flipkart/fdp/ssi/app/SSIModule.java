package com.flipkart.fdp.ssi.app;

import com.flipkart.fdp.utils.cfg.ConfigService;
import com.google.common.collect.Lists;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by abhijat.chowdhary on 05/07/17.
 */
@Slf4j
public class SSIModule extends AbstractModule {

    private final ConfigService configService;

    private final SSIServiceConfiguration config;

    private List<? extends Module> modules;

    public SSIModule(ConfigService configService){
        this.configService = configService;
        this.config = configService.getConfig(SSIServiceConfiguration.class);
        modules = Lists.newArrayList(
                this
        );
    }

    @Override
    protected void configure() {
        try {
            bind(ConfigService.class).toInstance(configService);
            bind(SSIServiceConfiguration.class).toInstance(config);
        }
        catch (Exception ex) {
            log.error("Error while configuring guice :", ex);
            throw ex;
        }

    }

    public List<? extends Module> getModules()
    {
        return modules;
    }


}
