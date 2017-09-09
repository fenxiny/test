package we.internetbar.business;

import java.util.List;

import we.internetbar.enty.evaluate;

public interface IEvaluateService {
	public List<evaluate> loadAllByUser(int uid);
	public List<evaluate> loadAllByBusi(int bid);
	public void add(evaluate eva);
}
