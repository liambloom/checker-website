package dev.liambloom.checker.server;

import org.springframework.boot.web.server.MimeMappings;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Customizer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        MimeMappings mimeMappings = new MimeMappings(MimeMappings.DEFAULT);
        mimeMappings.add("xsd", "application/xml; charset=UTF-8");
        factory.setMimeMappings(mimeMappings);
    }
}
