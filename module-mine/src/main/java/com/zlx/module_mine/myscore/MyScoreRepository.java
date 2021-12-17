package com.zlx.module_mine.myscore;

import com.zlx.module_base.base_ac.BaseModel;
import com.zlx.module_base.base_api.res_data.RankListRes;
import com.zlx.module_base.base_api.util.ApiUtil;
import com.zlx.module_network.factory.ApiCallback;

public class MyScoreRepository extends BaseModel {
    private int page = 1;

    public void listScore(boolean refresh, ApiCallback<RankListRes> callback) {
        if (refresh) {
            page = 1;
        } else {
            page++;
        }
        ApiUtil.getUserApi().listIntegral(page).enqueue(callback);
    }
}
