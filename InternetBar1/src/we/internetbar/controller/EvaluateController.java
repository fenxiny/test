package we.internetbar.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import we.internetbar.business.impl.EvaluateService;
import we.internetbar.enty.evaluate;
@Controller
public class EvaluateController {
	private EvaluateService ev;
	@RequestMapping("/evaluateByUser")
	public String userView(int uid){
		ev.loadAllByBusi(uid);
		return "evalByUser";
	}
	@RequestMapping("/evaluateByUser")
	public String busiView(int bid){
		ev.loadAllByBusi(bid);
		return "evalByBusi";
	}
	@RequestMapping("/evalua")
	public String add(evaluate eva){
		ev.add(eva);
		return "evalua";
	}
}
