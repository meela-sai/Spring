package us.mi.state.dhs.bridges.ws.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"us.mi.state.dhs.bridges.ws.rest"})
public class Applicaiton {

}
