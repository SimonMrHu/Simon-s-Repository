package com.simon.home.biz.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoQuery {

    private String userName;

    private int currentPage;

    private int pageSize;
}
