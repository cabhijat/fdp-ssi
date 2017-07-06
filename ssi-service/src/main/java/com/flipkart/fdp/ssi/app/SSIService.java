package com.flipkart.fdp.ssi.app;

import com.flipkart.fdp.dws.wrapper.app.DWApp;
import com.flipkart.fdp.dws.wrapper.app.GuiceModulesProvider;
import com.flipkart.fdp.dws.wrapper.app.JerseyResourcesProvider;
import io.dropwizard.setup.Bootstrap;

import java.io.IOException;

/**
 * Created by abhijat.chowdhary on 05/07/17.
 */
public class SSIService extends DWApp<SSIServiceConfiguration>{

    private SSIService(GuiceModulesProvider guiceModulesProvider, JerseyResourcesProvider jerseyResourcesProvider) throws IOException {
        super(guiceModulesProvider, jerseyResourcesProvider);
    }

    public static void main(final String[] args) throws Exception {

        final DWApp<SSIServiceConfiguration> application = new SSIService(
                new SSIModuleProvider(),
                new SSIJerseyResourceProvider()
        );
        application.run();
    }

    public void initializeApp(Bootstrap<SSIServiceConfiguration> appHandle){

    }
}
