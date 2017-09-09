package we.internetbar.dao;

import java.util.List;

import we.internetbar.enty.evaluate;

public interface IEvaluateDao {
	public List<evaluate> loadAllByUser(int uid);
	public List<evaluate> loadAllByBusi(int uid);
	public void Add(evaluate eva);
}
