package com.flipkart.fdp.ssi.app;

import com.flipkart.fdp.dws.wrapper.app.JerseyResourcesProvider;
import com.flipkart.fdp.utils.cfg.ConfigService;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by abhijat.chowdhary on 05/07/17.
 */
public class SSIJerseyResourceProvider implements JerseyResourcesProvider {
    @Override
    public List<Class> getJerseyResources(ConfigService configService) {
        return Lists.<Class>newArrayList(

        );
    }
}
