package com.stackroute;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}