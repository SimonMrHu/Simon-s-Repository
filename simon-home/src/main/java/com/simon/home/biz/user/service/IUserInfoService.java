package com.simon.home.biz.user.service;

import com.simon.home.biz.user.entity.UserInfo;
import com.simon.home.biz.user.vo.UserInfoQuery;
import org.springframework.data.domain.Page;

public interface IUserInfoService {

    /**
     * 获取用户列表
     * @return
     */
    Page<UserInfo> getUserInfoList(UserInfoQuery query);
}
