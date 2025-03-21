//package com.airsofka.authentication.infra.jwt.config;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//  @Override
//  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//    final String token = getToken(request);
//
//    if (token == null ) {
//      filterChain.doFilter(request, response);
//      return;
//    }
//
//    filterChain.doFilter(request, response);
//  }
//
//  private String getToken(HttpServletRequest request) {
//    final String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
//    if (StringUtils.hasText(authorizationHeader) && authorizationHeader.startsWith("Bearer ")) {
//      return authorizationHeader.substring(7);
//    }
//    return null;
//  }
//}
