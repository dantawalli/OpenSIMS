//package com.OpenSIMS.controller;
//
//    import com.OpenSIMS.request.AuthenticationRequest;
//    import com.OpenSIMS.response.AuthenticationResponse;
//    import org.springframework.beans.factory.annotation.Autowired;
//    import org.springframework.security.authentication.AuthenticationManager;
//    import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//    import org.springframework.security.core.Authentication;
//    import org.springframework.security.core.context.SecurityContextHolder;
//    import org.springframework.security.core.userdetails.UserDetailsService;
//    import org.springframework.web.bind.annotation.PostMapping;
//    import org.springframework.web.bind.annotation.RequestBody;
//    import org.springframework.web.bind.annotation.RequestMapping;
//    import org.springframework.web.bind.annotation.RestController;
//
//    import javax.validation.Valid;
//
//@RestController
//    @RequestMapping("/api/auth")
//    public class LoginController {
//
////        @Autowired
////        private AuthenticationManager authenticationManager;
//
////        @Autowired
////        private JwtUtils jwtUtils;
//
////        @Autowired
////        private UserDetailsService userDetailsService;
//
//        @PostMapping("/login")
//        public AuthenticationResponse authenticate(@RequestBody @Valid AuthenticationRequest authenticationRequest) {
//            // Authenticate the user
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            authenticationRequest.getUsername(),
//                            authenticationRequest.getPassword()
//                    )
//            );
//
//            // Set the authentication in the security context
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            // Generate JWT token
////            String jwtToken = jwtUtils.generateToken(userDetailsService.loadUserByUsername(authenticationRequest.getUsername()));
//
//            // Return the JWT token in the response
//            return new AuthenticationResponse(null);
//        }
//    }
