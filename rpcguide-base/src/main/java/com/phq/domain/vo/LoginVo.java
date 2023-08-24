package com.phq.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: phq
 * @date: 2023/8/19
 */

@Data
@AllArgsConstructor
public class LoginVo {
    private String token;
    private LoginUserVo loginUser;

}
