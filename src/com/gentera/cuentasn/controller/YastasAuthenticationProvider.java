package com.gentera.cuentasn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.gentera.cuentasn.service.impl.LeerCatalogosImpl;

@Component
public class YastasAuthenticationProvider implements AuthenticationProvider {
	
	private static Properties prop = new Properties();

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String name = authentication.getName();
		String password = "OperadorYastas";  //No usa password
		try{
			
			prop.load(LeerCatalogosImpl.class.getClassLoader().getResourceAsStream("resources/Operadores.properties"));
			if(prop.containsKey(name.toUpperCase())){
				List<GrantedAuthority> grantedAuths = new ArrayList<>();
				return new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
