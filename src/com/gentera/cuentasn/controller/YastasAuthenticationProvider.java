package com.gentera.cuentasn.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.util.OperadoresArchivo;

@Component
public class YastasAuthenticationProvider implements AuthenticationProvider {

	final static Logger logger = Logger.getLogger(YastasAuthenticationProvider.class);

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String name = authentication.getName();
		String password = "OperadorYastas";  //No usa password
		try{

			List<String> operadores = OperadoresArchivo.getNumOperadores();

			if(operadores != null){
				if(operadores.size()!=0){
					if(operadores.contains(name)){
						List<GrantedAuthority> grantedAuths = new ArrayList<>();
						logger.info("Ingreso del Operador: " + name);
//						return new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
						Usuario user = new Usuario();
						user.setUsername(name);
						user.setOrigen("yastas");
						return new UsernamePasswordAuthenticationToken(user, name);
					}else{
						return null;
					}
				}else{
					logger.error("*****El archivo de Operadores Yastas esta vacio*****");
					return null;
				}
			}else{
				logger.error("*****El archivo de Operadores Yastas no existe*****");
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
