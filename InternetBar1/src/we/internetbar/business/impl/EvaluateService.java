package we.internetbar.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import we.internetbar.business.IEvaluateService;
import we.internetbar.dao.IEvaluateDao;
import we.internetbar.enty.evaluate;
@Service("iEvaluateService")
public class EvaluateService implements IEvaluateService {
	@Autowired
	private IEvaluateDao iEvaluateDao;
	@Override
	public List<evaluate> loadAllByUser(int uid) {
		return  iEvaluateDao.loadAllByUser( uid);
	}
	@Override
	public List<evaluate> loadAllByBusi(int bid) {
		return iEvaluateDao.loadAllByBusi(bid);
	}
	public void add(evaluate eva) {
		iEvaluateDao.Add(eva);
	}
}
