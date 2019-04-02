package com.simon.home.biz.user.service.impl;

import com.simon.home.biz.user.dao.UserInfoRepository;
import com.simon.home.biz.user.entity.UserInfo;
import com.simon.home.biz.user.service.IUserInfoService;
import com.simon.home.biz.user.vo.UserInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public Page<UserInfo> getUserInfoList(UserInfoQuery query) {
        PageRequest request = PageRequest.of(query.getPageSize(),query.getCurrentPage());
        Page<UserInfo> userInfos = userInfoRepository.findAll(request);
        Stream<UserInfo> userInfoStream = userInfos.get();
        // 处理结果集合
        userInfoStream.filter(userInfo -> userInfo.getUserName().contains(query.getUserName()))
                .sorted(UserInfoServiceImpl :: compareUser);
        return null;
    }

    private static int compareUser(UserInfo userInfo1,UserInfo userInfo2) {
        return  userInfo1.getUserName().compareTo(userInfo2.getUserName());
    }

}
