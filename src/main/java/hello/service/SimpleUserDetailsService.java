package hello.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hello.domain.UserRepository;

@Service
public class SimpleUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		hello.domain.User user = userRepository.findByUsername(username);

		Collection<GrantedAuthority> authorities = Arrays.asList((GrantedAuthority) new SimpleGrantedAuthority(user.getRole()));
		UserDetails userDetails = new User(user.getUsername(), user.getPassword(), authorities);

		return userDetails;
	}
}