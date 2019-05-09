package com.zc.web.util;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderImpl implements PasswordEncoder{

    @Override
    public String encode(CharSequence rawPassword) {
        return new Sha256Hash(rawPassword).toHex();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return new Sha256Hash(rawPassword).toHex().equals(encodedPassword);
    }

}