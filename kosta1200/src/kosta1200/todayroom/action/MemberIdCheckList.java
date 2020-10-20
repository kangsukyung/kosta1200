package kosta1200.todayroom.action;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@RequestWrapperMapping("/idcheck.do")
@ResponseWrappereBody

public Map<Object, Object> MemberIdCheckList(@RequestBody String userid) {
	int count = 0;
    Map<Object, Object> map = new HashMap<Object, Object>();

    count = signupService.idcheck(userid);
    map.put("cnt", count);

    return map;
}