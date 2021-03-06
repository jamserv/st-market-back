package com.st.market.stmarket.api.security.controller;

import com.st.market.stmarket.api.Constants;
import com.st.market.stmarket.api.security.JwtTokenUtil;
import com.st.market.stmarket.api.security.model.JwtResponse;
import com.st.market.stmarket.cart.model.Cart;
import com.st.market.stmarket.cart.repository.CartRepository;
import com.st.market.stmarket.user.model.User;
import com.st.market.stmarket.user.repository.UserRepository;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.URI_AUTH)
@Lazy
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    UserRepository repository;

    @Autowired
    CartRepository cartRepository;

    @PostMapping(Constants.URI_LOGIN)
    @ResponseBody
    ResponseEntity<?> auth(@RequestBody User model) {
        try {
            User user = repository.findByEmail(model.getEmail());
            if (user == null) {
                user = new User();
                user.setLastSign(new Timestamp(System.currentTimeMillis()));
                user = repository.save(model);

                Cart cart = new Cart();
                cart.setUserId(user.getId());

                cartRepository.save(cart);
            }
            final String tokenUsr = jwtTokenUtil.generateToken(user.getEmail());

            JwtResponse jwtResponse = new JwtResponse();
            jwtResponse.setToken(tokenUsr);
            jwtResponse.setUser(user);

            return ResponseEntity.ok(jwtResponse);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}
