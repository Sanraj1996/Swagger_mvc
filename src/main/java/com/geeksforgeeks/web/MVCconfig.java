package com.geeksforgeeks.web;
import org.springframework.context
.annotation.ComponentScan;
import org.springframework.context
.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet
.config.annotation
.WebMvcConfigurerAdapter;

import springfox.documentation.oas.annotations.EnableOpenApi;

@Configuration
@ComponentScan({ "com.geeksforgeeks.web" })
@EnableWebMvc
@EnableOpenApi
public class MVCconfig
extends WebMvcConfigurerAdapter {
}