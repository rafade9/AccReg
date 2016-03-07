/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.ldap;

import java.util.Collection;

import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

import com.gentera.cuentasn.entities.Usuario;

/**
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class CustomUserDetailsMapper implements UserDetailsContextMapper {
	

	/* (non-Javadoc)
	 * @see org.springframework.security.ldap.userdetails.UserDetailsContextMapper#mapUserFromContext(org.springframework.ldap.core.DirContextOperations, java.lang.String, java.util.Collection)
	 */
	@Override
	public UserDetails mapUserFromContext(DirContextOperations ctx, String username, Collection<? extends GrantedAuthority> authority) {
		// TODO Auto-generated method stub
		System.out.println("Hasta aquí vas bien");
		Usuario user = new Usuario();
		System.out.println(ctx.getStringAttribute("employeeID"));
		user.setNumEmpleado(ctx.getStringAttribute("employeeID"));
		user.setOrigen("compartamos");
		System.out.println(ctx.getStringAttribute("userAccountControl"));
		
		if(!ctx.getStringAttribute("userAccountControl").equals("512")){
			throw new CredentialsExpiredException("Usuario bloqueado.");
		}
		
		return user;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.ldap.userdetails.UserDetailsContextMapper#mapUserToContext(org.springframework.security.core.userdetails.UserDetails, org.springframework.ldap.core.DirContextAdapter)
	 */
	@Override
	public void mapUserToContext(UserDetails arg0, DirContextAdapter arg1) {
		// TODO Auto-generated method stub
		
	}

}

