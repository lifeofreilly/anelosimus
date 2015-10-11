package com.gmail.lifeofreilly.anelosimus;

import com.gmail.lifeofreilly.anelosimus.health.AnelosimusHealthCheck;
import com.gmail.lifeofreilly.anelosimus.resources.AnelosimusViewResource;
import com.gmail.lifeofreilly.anelosimus.resources.AnelosimusResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

/**
 * The main entry point into the Anelosimus Dropwizard application.
 */
public class AnelosimusApplication extends Application<AnelosimusConfiguration> {

    /**
     * The main entry point
     *
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        new AnelosimusApplication().run(args);
    }

    /**
     * Gets the name of the application
     *
     * @return the name
     */
    @Override
    public String getName() {
        return "anelosimus";
    }

    /**
     * The initialize method is called before running the service run method
     *
     * @param bootstrap the configuration information
     */
    @Override
    public void initialize(final Bootstrap<AnelosimusConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<AnelosimusConfiguration>());
    }

    /**
     * Called when the service runs and registers the desired resources
     *
     * @param configuration the configuration
     * @param environment   the environment
     */
    @Override
    public void run(AnelosimusConfiguration configuration, Environment environment) {
        environment.jersey().register(new AnelosimusResource(configuration.getBaseURL()));
        environment.jersey().register(new AnelosimusViewResource(configuration.getBaseURL()));
        environment.healthChecks().register("resource", new AnelosimusHealthCheck());
    }

}
