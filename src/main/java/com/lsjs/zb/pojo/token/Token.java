package com.lsjs.zb.pojo.token;

import com.fasterxml.jackson.annotation.JsonView;
import com.lsjs.zb.pojo.Permission;
import lombok.Data;


@Data
public class Token {
    public interface NeedFillIn {};
    public interface NotNeedFillIn extends NeedFillIn {};

    @JsonView(NeedFillIn.class)
    private String token;
    @JsonView(NeedFillIn.class)
    private String phoneNumber;

    @JsonView(NotNeedFillIn.class)
    private Integer role;

    @JsonView(NotNeedFillIn.class)
    private Permission permission;


}
