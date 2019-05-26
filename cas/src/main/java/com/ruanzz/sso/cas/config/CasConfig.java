package com.ruanzz.sso.cas.config;

import net.unicon.cas.client.configuration.CasClientConfigurerAdapter;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhenZhuo.Ruan
 */
@EnableCasClient
@Configuration
public class CasConfig extends CasClientConfigurerAdapter {

  @Override
  public void configureAuthenticationFilter(FilterRegistrationBean authenticationFilter) {
    super.configureAuthenticationFilter(authenticationFilter);
    authenticationFilter.getInitParameters().put("authenticationRedirectStrategyClass","com.patterncat.CustomAuthRedirectStrategy");
  }
}
