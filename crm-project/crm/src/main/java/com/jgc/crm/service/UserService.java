package com.jgc.crm.service;

import com.jgc.crm.settings.transaction.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface UserService {
    User querySelectByLoginActAndLoginPwd(Map<String,Object> map);
}
