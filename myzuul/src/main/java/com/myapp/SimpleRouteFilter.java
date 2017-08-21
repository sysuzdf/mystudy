package com.myapp;
/**
 * 类SimpleFilter.java的实现描述：TODO 类实现描述 
 * @author zhoudefeng 2017年8月16日 下午4:43:38
 */
import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

public class SimpleRouteFilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(SimpleRouteFilter.class);

  @Override
  public String filterType() {
    return "route";
  }

  @Override
  public int filterOrder() {
    return FilterConstants.RIBBON_ROUTING_FILTER_ORDER+1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
    System.out.println("==RouteHost: "+ctx.getRouteHost()+", RouteService: "+ctx.get(FilterConstants.SERVICE_ID_KEY));
    log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

    return null;
  }

}