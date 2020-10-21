package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.StoreService;

public class FilterPrice implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		StoreService service = StoreService.getInstance();
		int num = service.FilterPriceService(request, response);
		
		response.getWriter().print(num);
		return null;
	}

}
