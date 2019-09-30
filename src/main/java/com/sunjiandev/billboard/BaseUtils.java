package com.sunjiandev.billboard;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2015-2019, 北京视游互动科技有限公司
 * Author: sunjianyun
 * Date: 2019/9/30 11:38
 * Description:
 */
public class BaseUtils {
	public static String returnJson(int tag, int code, String reason, Object data) {
		Map<String, Object> returnMap = new HashMap<>(4);
		returnMap.put("tag", tag);
		returnMap.put("code", code);
		returnMap.put("reason", reason);
		returnMap.put("data", data);

		return JSON.toJSONString(returnMap);
	}
}
