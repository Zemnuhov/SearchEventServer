package com.zemnuhov.server;

import com.zemnuhov.server.config.WebConfig;
import com.zemnuhov.server.controller.IventConroller;
import com.zemnuhov.server.repository.IventRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInit implements WebApplicationInitializer {

    private final static String DISPATCHER="dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx= new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener((WebApplicationContext) ctx));

        ServletRegistration.Dynamic servlet=servletContext.addServlet(DISPATCHER,new DispatcherServlet((WebApplicationContext) ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        System.out.println("Hello World!");


    }
}
